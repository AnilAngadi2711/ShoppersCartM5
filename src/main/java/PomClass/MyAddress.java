package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddress 
{

	public WebDriver driver;
	
	public MyAddress(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//a[@href='/addressform']")
	private WebElement AddressFormButton;

	public WebElement getAddressFormButton() {
		return AddressFormButton;
	}

	@FindBy(xpath="//h4[text()='Address 3']")
	private WebElement addedaddress;

	public WebElement getaddedaddress() {
		return addedaddress;
	}
	
	
	
	
	
}
