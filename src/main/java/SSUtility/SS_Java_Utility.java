package SSUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SS_Java_Utility 
{

	public void JavascriptClick(WebElement emt,WebDriver driver)
	{
		JavascriptExecutor JSE=(JavascriptExecutor)driver;
		JSE.executeScript("arguments[0].click();", emt);
	}
}
