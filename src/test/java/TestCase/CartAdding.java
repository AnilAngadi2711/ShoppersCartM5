package TestCase;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PomClass.AccountSettingPage;
import PomClass.AddressFormPage;
import PomClass.AddressPage;
import PomClass.HomePage;
import PomClass.MyAddress;
import PomClass.MyProfilePage;
import PomClass.OrderConform;
import PomClass.PaymentPage;
import PomClass.TshirtPage;
import PomClass.addToCart;
import SSUtility.SS_BaseClass;

//@Listeners(SSUtility.Ss_Listeners_Utility.class)
public class CartAdding extends SS_BaseClass
{
	
//	@Test(dataProvider="dataProviderAddress")
	public void Ss_AddAddress_001(String name, String house_office, String street, String landmark, String Country,
			String State, String City, String pincode, String phoneno) throws Throwable 
	{
		System.out.println("Add Address");
		Thread.sleep(3000);
		HomePage HP = new HomePage(driver);
		HP.getaccountSettingIcon().click();
	
		
		AccountSettingPage AS = new AccountSettingPage(driver);
		AS.getmyProfileLink().click();
		
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.shoppersstack.com/my-profile/my-profile-info");
		System.out.println("My Profile Page is Opened");
		
		MyProfilePage MP = new MyProfilePage(driver);
		MP.getmyAddressButton().click();
		
		MyAddress MA = new MyAddress(driver);
		MA.getAddressFormButton().click();
		
		AddressFormPage AFP = new AddressFormPage(driver);
		AFP.getNameTextField().sendKeys(name);
		AFP.getHouseTextField().sendKeys(house_office);
		AFP.getStreetTextField().sendKeys(street);
		AFP.getLandMarkTextField().sendKeys(landmark);
		WebElement CountryDropDown = AFP.getCountryDropDown();
		DrpDnU.selectDropDownByText(Country, CountryDropDown);
		WebElement StateDropDown = AFP.getStateDropDown();	
		DrpDnU.selectDropDownByText(State, StateDropDown);
		WebElement CityDropDown = AFP.getCityDropDown();
		DrpDnU.selectDropDownByText(City, CityDropDown);
		AFP.getPinCodeTextField().sendKeys(pincode);
		AFP.getPhoneNumberTextField().sendKeys(phoneno);
		AFP.getADDAddressButton().click();
	
//		Assert.assertEquals(MA.getaddedaddress().getText(),name);
//		System.out.println("The address-"+name+" is added successfully");
		
	}  
	
	@DataProvider
	public Object[][] dataProviderAddress() throws Throwable
	{
	 return data.accessAllAddress();
	}


	
//	@DataProvider
//	public Object[][] dataProviderAddress()
//	{
//		Object[][] ref = new Object[1][9];
//		ref[0][0]="Anil Kumar";
//		ref[0][1]="153, Chandra Layout";
//		ref[0][2]="Ponappa 2nd cross";
//		ref[0][3]="Near Pampa Hotel";
//		ref[0][4]="India";
//		ref[0][5]="Karnataka";
//		ref[0][6]="Bengaluru";
//		ref[0][7]="560010";
//		ref[0][8]="9731523565";
//		return ref;
//	}
	
	
	
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
		
		AddressPage HomeAddress = new AddressPage(driver);
		HomeAddress.getHomeAddress().click();
		HomeAddress.getProceedButton().click();
		
		PaymentPage Pay = new PaymentPage(driver);
		Pay.getCashOnDelevery().click();
		Pay.getProceedButtonInPaypage().click();
		
		OrderConform Oc = new OrderConform(driver);
		Assert.assertEquals(Oc.getOrderConformed().getText(),"Order Conformed");
		System.out.println("The Order got Conformed in Cash On Delevery");
		
		
		
	}
}
