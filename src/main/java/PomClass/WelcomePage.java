package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage 
{
	
public WebDriver driver;

//Initialization
public WelcomePage(WebDriver driver) throws Throwable
{
	Thread.sleep(3000);
	PageFactory.initElements(driver, this);
}

	@FindBy(id="loginBtn")
	private WebElement MainLoginButton;

	public WebElement getMainLoginButton() 
	{
		return MainLoginButton;
	}

	
	
}
	
