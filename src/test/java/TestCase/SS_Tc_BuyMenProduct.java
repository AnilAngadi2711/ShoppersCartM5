package TestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SS_Tc_BuyMenProduct {

	
	public void Men_Product() throws Throwable {
//		Buy Men Product
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("anilkumar.me004@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("5An@kumar");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("men")).click();
		driver.findElement(By.xpath("//span[text()='Skinny Men Blue Jeans']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("Buy Now")).click();
		driver.findElement(By.id("5901")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
	}
}
