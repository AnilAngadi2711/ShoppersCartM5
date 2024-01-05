package PomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SS_Kids_Products {

	
	@FindBy(id="kids")
	public WebElement kidsModule;
	
	@FindBy(xpath="//span[text()='Santoor']")
	public WebElement Santoor;
	
}
