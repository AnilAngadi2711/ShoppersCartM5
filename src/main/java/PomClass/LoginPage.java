package PomClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	public WebElement getemailTextField()
	{
		return emailTextField;
	}
	
	
	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	public WebElement getpasswordTextField()
	{
		return passwordTextField;
	}
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginButton;
	
	public WebElement getloginButton()
	{
		return loginButton;
	}
	
	
}