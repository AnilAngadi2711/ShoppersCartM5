package TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import SSUtility.SS_BaseClass;

public class AddToCart extends SS_BaseClass
{

	@Test
	public void SS_Testcase_Men01()
	{
		driver.findElement(By.id("mensProd")).click();
		driver.findElement(By.xpath("//span[text()='Men Regular Fit Solid Cut Away Coll...']")).click();
		driver.findElement(By.id("Add To Cart")).click();
		System.out.println("------Men Regular Fit Solid Cut Away Coll is Added To Cart------");
	}
	
	@Test
	public void SS_Testcase_Women01()
	{
		driver.findElement(By.id("womensProd")).click();
		driver.findElement(By.xpath("//span[text()='Fashion2wear ']")).click();
		driver.findElement(By.id("Add To Cart")).click();
		System.out.println("------fashion2wear is Added To Cart------");
	}

	@Test
	public void SS_Testcase_Kids01()
	{
		driver.findElement(By.id("kidsProd")).click();
		driver.findElement(By.xpath("//span[text()='Apple Group Latest Fancy Stylish Ba...']")).click();
		driver.findElement(By.id("Add To Cart")).click();
		System.out.println("------Apple Group Latest Fancy Stylish Ba... is Added To Cart------");
	}
	
	@Test
	public void SS_Testcase_Electronic01()
	{
		driver.findElement(By.id("electronicsProd")).click();
		driver.findElement(By.xpath("//span[text()='APPLE iPhone 14 Pro']")).click();
		driver.findElement(By.id("Add To Cart")).click();
		System.out.println("------APPLE iPhone 14 Pro is Added To Cart------");
	}
	
	@Test
	public void SS_Testcase_Beauty01()
	{
		driver.findElement(By.id("beautyProd")).click();
		driver.findElement(By.xpath("//span[text()='Lakme Lumi Cream']")).click();
		driver.findElement(By.id("Add To Cart")).click();
		System.out.println("------Lakme Lumi Cream is Added To Cart------");
	}
}
