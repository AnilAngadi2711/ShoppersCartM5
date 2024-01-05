package TestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PomClass.SS_Login;

public class KidsProduct 
{

	
	public void kidsProd() throws Throwable {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		SS_Login Log = new SS_Login(driver);
		
		Log.loginbutton.click();
		Log.emailTextField.sendKeys("anilkumar.me004@gmail.com");
		Log.passwordTextField.sendKeys("5An@kumar");
		Log.buttonLogin.click();
		Thread.sleep(3000);
		
//		Kids product
		
		driver.findElement(By.id("kidsProd")).click();
		driver.findElement(By.xpath("https://www.shoppersstack.com/")).click();
		driver.findElement(By.xpath("//span[text()='buy now']")).click();
		driver.findElement(By.id("4258")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		

		
	}

}
