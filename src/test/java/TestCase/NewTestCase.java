package TestCase;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SSUtility.SS_BaseClass;

@Listeners(SSUtility.Ss_Listeners_Utility.class)
public class NewTestCase extends SS_BaseClass
{

	@Test
	public void TC_AddToCart_001_Test() throws Throwable
	{
		Thread.sleep(3000);
		System.out.println("This Is First Test Case");
		String titleHomePage = driver.getTitle();
		Assert.assertEquals(titleHomePage, "ShoppersStack | Home");
	}
	
	@Test
	public void TC_AddToCart_002_Test() throws Throwable
	{
		Thread.sleep(3000);
		System.out.println("This Is second Test Case");
	}
	
}
