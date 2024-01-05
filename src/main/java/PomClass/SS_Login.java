package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SS_Login {
	
	@FindBy(id="loginBtn")
	public WebElement loginbutton;
	
	@FindBy(id="Email")
	public WebElement emailTextField;
	
	@FindBy(id="Password")
	public WebElement passwordTextField;
	
	@FindBy(xpath="//span[text()='Login']")
	public WebElement buttonLogin;
	
	public SS_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
