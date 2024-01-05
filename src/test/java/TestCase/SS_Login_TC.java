package TestCase;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import PomClass.SS_Login;

public class SS_Login_TC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/");
		
		SS_Login Log = new SS_Login(driver);
		
		Log.loginbutton.click();
		Log.emailTextField.sendKeys("anilkumar.me004@gmail.com");
		Log.passwordTextField.sendKeys("5An@kumar");
		Log.buttonLogin.click();
	}

}
