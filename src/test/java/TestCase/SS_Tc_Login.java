package TestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SS_Tc_Login {
	
	@Test
	public void Tc_SS_Login() {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("anilkumar.me004@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("5An@kumar");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}
	

}
