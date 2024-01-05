package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PomClass.AddressPage;
import PomClass.HomePage;
import PomClass.NetBanking_Details;
import PomClass.OrderConform;
import PomClass.PaymentPage;
import PomClass.TshirtPage;
import PomClass.addToCart;
import SSUtility.SS_BaseClass;
import SSUtility.SS_Data_Utility;

public class Buy_Product extends SS_BaseClass
{
	@Test
		public void Ss_AddToCart_001() throws Throwable
	{
		Thread.sleep(3000);
		System.out.println("First Test Case");
		String titleHomePage = driver.getTitle();
		Assert.assertEquals(titleHomePage, "ShoppersStack | Home");
	
		HomePage HP = new HomePage(driver);
		Thread.sleep(5000);
		WebElement menLink = HP.getmenMenuLink();
	
		WU.mouseOverAction(driver, menLink);
		HP.getTshirtPopupLink().click();
		TshirtPage tsp = new TshirtPage(driver);
		String currenturl = driver.getCurrentUrl();
		Assert.assertEquals(currenturl, "https://www.shoppersstack.com/sub-category/men-tshirt");
		WU.mouseOverAction(driver, tsp.getTshirtTopLink());
	
	
		tsp.getLevisMensRegularFitTee_AddToCartButton().click();
		HP.getaddToCartLink().click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.shoppersstack.com/cart");
	
		addToCart AC = new addToCart(driver);
		String levisProductTest = AC.getlevisProduct().getText();
		Assert.assertEquals(levisProductTest, "Levis Mens Regular Fit Tee");
		System.out.println(" The Product is Added to The Cart");
		
		AC.getbuynowButtonIncartPage().click();
		
		String addressPageurl = driver.getCurrentUrl();
		Assert.assertEquals(addressPageurl,"https://www.shoppersstack.com/selectaddress");
		System.out.println("Address Page Is Displayed");
		
		AddressPage OfficeAddress = new AddressPage(driver);
		OfficeAddress.getOfficeAddress().click();
		OfficeAddress.getProceedButton().click();
		
		PaymentPage Pay = new PaymentPage(driver);
		Pay.getNetBanking().click();
		Pay.getProceedButtonInPaypage().click();
		
		
		
		NetBanking_Details NetBanking = new NetBanking_Details(driver);
		driver.switchTo().frame(NetBanking.getNetBankingFrameTag());
		NetBanking.getIDHC_radioButton().click();
		NetBanking.getSubmitButton().click();
		
		
		
	}

	
}
