package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage 
{
	public AddressPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="4258")
	private WebElement HomeAddress;
	
	public WebElement getHomeAddress()
	{
		return HomeAddress;
	}

	
	@FindBy(id="5901")
	private WebElement Home1Address;
	
	public WebElement getHome1Address()
	{
		return Home1Address;
	}
	
	@FindBy(id="14154")
	private WebElement OfficeAddress;
	
	public WebElement getOfficeAddress()
	{
		return OfficeAddress;
	}
	
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement ProceedButton;
	
	public WebElement getProceedButton()
	{
		return ProceedButton;
	}
	
	
	
}
