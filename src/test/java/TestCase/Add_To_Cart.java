package TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import SSUtility.SS_BaseClass;

public class Add_To_Cart extends SS_BaseClass
{
//	Add Kids Product To Cart....
	
	@Test
	public void Ss_TcKids_001()
	{
		driver.findElement(By.id("kidsProd")).click();
		driver.findElement(By.xpath("//span[text()='Santoor']")).click();
		driver.findElement(By.id("Add To Cart")).click();
		System.out.println("------Santoor Added To Cart------");
	}
	
	@Test
	public void Ss_TcKids_002()
	{
		driver.findElement(By.id("kidsProd")).click();
		driver.findElement(By.xpath("//span[text()='Girls Casual Polyester Ruffled Top ']")).click();
		driver.findElement(By.id("Add To Cart")).click();
		System.out.println("------Girls Casual Polyester Ruffled Top Added To Cart------");
	}
	
	@Test
	public void Ss_TcKids_003()
	{
		driver.findElement(By.id("kidsProd")).click();
		driver.findElement(By.xpath("//span[text()='Girls Party Rayon Ruffeld Top']")).click();
		driver.findElement(By.id("Add To Cart")).click();
		System.out.println("------Girls Party Rayon Ruffeld Top Added To Cart------");
	}
	
	@Test
	public void Ss_TcKids_004()
	{
		driver.findElement(By.id("kidsProd")).click();
		driver.findElement(By.xpath("//span[text()='Boys Printed Pure Cotton T Shirt ']")).click();
		driver.findElement(By.id("Add To Cart")).click();
		System.out.println("------Boys Printed Pure Cotton T Shirt Added To Cart------");
	}
	
	@Test
	public void Ss_TcKids_005()
	{
		driver.findElement(By.id("kidsProd")).click();
		driver.findElement(By.xpath("//span[text()='Boys  Collar Casual tShirt']")).click();
		driver.findElement(By.id("Add To Cart")).click();
		System.out.println("------Boys  Collar Casual tShirt Added To Cart------");
	}
	
	@Test
	public void Ss_TcKids_006()
	{
		driver.findElement(By.id("kidsProd")).click();
		driver.findElement(By.xpath("//span[text()='Naughty Ninos Girls Blue Denim Jegg...']")).click();
		driver.findElement(By.id("Add To Cart")).click();
		System.out.println("------Naughty Ninos Girls Blue Denim Jegg Added To Cart------");
	}
	
	@Test
	public void Ss_TcKids_007()
	{
		driver.findElement(By.id("kidsProd")).click();
		driver.findElement(By.xpath("//span[text()='Apple Group Latest Fancy Stylish Ba...']")).click();
		driver.findElement(By.id("Add To Cart")).click();
		System.out.println("------Apple Group Latest Fancy Stylish Ba Added To Cart------");
	}
	
	@Test
	public void Ss_TcKids_008()
	{
		driver.findElement(By.id("kidsProd")).click();
		driver.findElement(By.xpath("//span[text()='Table']")).click();
		driver.findElement(By.id("Add To Cart")).click();
		System.out.println("------Table Added To Cart------");
	}
	
	@Test
	public void Ss_TcKids_009()
	{
		driver.findElement(By.id("kidsProd")).click();
		driver.findElement(By.xpath("//span[text()='Building Blocks for Kids']")).click();
		driver.findElement(By.id("Add To Cart")).click();
		System.out.println("------Building Blocks for Kids Added To Cart------");
	}
	
	@Test
	public void Ss_TcKids_010()
	{
		driver.findElement(By.id("kidsProd")).click();
		driver.findElement(By.xpath("//span[text()='Boy Baby Cloths']")).click();
		driver.findElement(By.id("Add To Cart")).click();
		System.out.println("------Boy Baby Cloths Added To Cart------");
	}
	
	@Test
	public void Ss_TcKids_011()
	{
		driver.findElement(By.id("kidsProd")).click();
		driver.findElement(By.xpath("//span[text()='Mi Arcus Elephant Soft Toy']")).click();
		driver.findElement(By.id("Add To Cart")).click();
		System.out.println("------Mi Arcus Elephant Soft Toy Added To Cart------");
	}
	
//	@Test
	public void Ss_TcKids_012()
	{
		driver.findElement(By.id("kidsProd")).click();
		driver.findElement(By.xpath("//span[text()='zeep']")).click();
		driver.findElement(By.id("Add To Cart")).click();
		System.out.println("------zeep Added To Cart------");
	}
	
//	@Test
	public void Ss_TcKids_013()
	{
		driver.findElement(By.id("kidsProd")).click();
		driver.findElement(By.xpath("//span[text()='GSM classmate A4']")).click();
		driver.findElement(By.id("Add To Cart")).click();
		System.out.println("------GSM classmate A4 Added To Cart------");
	}
	
//	@Test
	public void Ss_TcKids_014()
	{
		driver.findElement(By.id("kidsProd")).click();
		driver.findElement(By.xpath("//span[text()='happilo 100%']")).click();
		driver.findElement(By.id("Add To Cart")).click();
		System.out.println("------happilo 100% Added To Cart------");
	}
	
//	@Test
	public void Ss_TcKids_015()
	{
		driver.findElement(By.id("kidsProd")).click();
		driver.findElement(By.xpath("//span[text()='chocolate home treats chocolate bars']")).click();
		driver.findElement(By.id("Add To Cart")).click();
		System.out.println("------chocolate home treats chocolate bars Added To Cart------");
	}
}

