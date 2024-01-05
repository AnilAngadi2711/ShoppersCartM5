package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage 

{
	public PaymentPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Cash On Delivery (COD)']/preceding-sibling::span/input")
	private WebElement CashOnDelevery;
	
	public WebElement getCashOnDelevery()
	{
		return CashOnDelevery;
	}
	
	@FindBy(xpath="//input[@value='Net Banking']")
	private WebElement NetBanking;
	
	public WebElement getNetBanking()
	{
		return NetBanking;
	}
	
	
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement ProceedButtonInPaypage;
	
	public WebElement getProceedButtonInPaypage()
	{
		return ProceedButtonInPaypage;
	}
}
