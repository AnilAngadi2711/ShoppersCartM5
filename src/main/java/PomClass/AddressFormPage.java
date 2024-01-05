package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressFormPage 
{

public WebDriver driver;
	
	public AddressFormPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	@FindBy(id="Name") 
	private WebElement nameTextField;
	
	@FindBy(id="House/Office Info") 
	private WebElement HouseTextField;
	
	@FindBy(id="Street Info") 
	private WebElement StreetTextField;
	
	@FindBy(id="Landmark") 
	private WebElement LandMarkTextField;
	
	@FindBy(id="Country") 
	private WebElement CountryDropDown;
	
	@FindBy(id="State") 
	private WebElement StateDropDown;
	
	@FindBy(id="City") 
	private WebElement CityDropDown;
	
	@FindBy(id="Pincode") 
	private WebElement PinCodeTextField;
	
	@FindBy(id="Phone Number") 
	private WebElement PhoneNumberTextField;
	
	@FindBy(xpath="//button[text()='Add Address']") 
	private WebElement ADDAddressButton;

	public WebElement getNameTextField() 
	{
		return nameTextField;
	}

	public WebElement getHouseTextField() 
	{
		return HouseTextField;
	}

	public WebElement getStreetTextField() 
	{
		return StreetTextField;
	}

	public WebElement getLandMarkTextField() 
	{
		return LandMarkTextField;
	}

	public WebElement getCountryDropDown() 
	{
		return CountryDropDown;
	}

	public WebElement getStateDropDown() 
	{
		return StateDropDown;
	}

	public WebElement getCityDropDown() 
	{
		return CityDropDown;
	}

	public WebElement getPinCodeTextField() 
	{
		return PinCodeTextField;
	}

	public WebElement getPhoneNumberTextField() 
	{
		return PhoneNumberTextField;
	}

	public WebElement getADDAddressButton() 
	{
		return ADDAddressButton;
	}
	
	
	
	

	
}
