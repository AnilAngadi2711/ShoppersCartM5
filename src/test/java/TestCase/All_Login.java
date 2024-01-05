package TestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PomClass.SS_Login;

public class All_Login 
{
	
	@Test(dataProvider="dataProviderMethod")
	public void All_Login(String email, String pass)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.manage().window().maximize();
	
		SS_Login Pg = new SS_Login(driver);
		Pg.loginbutton.click();
		Pg.emailTextField.sendKeys(email);
		Pg.passwordTextField.sendKeys(pass);
		Pg.buttonLogin.click();
	
	}
	
	@DataProvider
	public Object[][] dataProviderMethod()
	{
		Object[][] ref = new Object[3][2];
		
		ref[0][0]="talktorajat002@gmail.com";			ref[0][1]="Robin@123";
		
		ref[1][0]="anilkumar.me004@gmail.com";			ref[1][1]="5An@kumar";
		
		ref[2][0]="yogaraja.mtech@gmail.com";			ref[2][1]="Shivani@123";

		
		return ref;
		
	}

}
