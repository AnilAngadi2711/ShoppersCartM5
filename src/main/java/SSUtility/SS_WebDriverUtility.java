package SSUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SS_WebDriverUtility 
{

/**	Author: AnilKumar A B
*When we get Element Click intercepted exception(when element is hidden by other element)
*then we will use Java script click
*it will take Webdriver object and element ref on which you want to perform javascript click
*@param driver
**@param ele
*/
	public void javaScriptClick(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ele);
	}	
	
/**
 * to avoid ElementClickException
 * @param driver
 * @param ele
 * @param data	
 */
	
	public void javaScriptsendkeys(WebDriver driver,WebElement ele,String data)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value=arguments[1];", ele,data);
	}
	
/**Author AnilKumar A B
 * this method will scroll the webpage with given element 
 * @param driver
 * @param ele
 * @param data
 */
	
	public void javaScriptScrollTillWebElement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", ele);
	}
	
	
/**Author AnilKumar A B
	 * this method will scroll the webpage with given co-orinates
	 * @param driver
	 * @param ele
	 * @param data
	 */	
	
	public void javaScriptScrollByCordinates(WebDriver driver,int xcordinate, int ycordinate)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scrollBy("+xcordinate+","+ycordinate+");");
	}
	
	
	/**Author AnilKumar A B
	 * this method will Highlight Web Element by 2px red colour
	 * @param driver
	 * @param ele
	 * @param data
	 */		
	
	public void javaScriptHighLightWebElement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].style.border='2px solid red';",ele);
	}
	
	/**
	 * This method will wait till given element reaches to click able state
	 * @param locator
	 * @param driver
	 * @param ele
	 * @param timeInSeconds
	 */
	public void explicitlyWaitForElementClickable(By locator,WebDriver driver, WebElement ele, int timeInSeconds)
	{
		WebDriverWait Wait= new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
		Wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	
/**
 * 	This method will wait until alert is present
 * @param driver
 * @param ele
 * @param timeInSeconds
 */
	public void explicitlyWaitForAlertTobePresent(WebDriver driver, WebElement ele, int timeInSeconds)
	{
		WebDriverWait Wait= new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
		Wait.until(ExpectedConditions.alertIsPresent());
	}
	
/**
 * 	This method will wait ultil url is present
 * @param driver
 * @param ele
 * @param timeInSeconds
 * @param Completeurl
 */
	public void explicitlyWaitForUrlTobePresent(WebDriver driver, WebElement ele, int timeInSeconds,String Completeurl)
	{
		WebDriverWait Wait= new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
		Wait.until(ExpectedConditions.urlToBe(Completeurl));
	}
	
	/**
	 * 	This method will wait until element is visible
	 * @param driver
	 * @param ele
	 * @param timeInSeconds
	 */
		public void explicitlyWaitForTitle(WebDriver driver,  int timeInSeconds, String CompleteTitle)
		{
			WebDriverWait Wait= new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
			Wait.until(ExpectedConditions.titleIs(CompleteTitle));
		}	
	
/**
 * 	This method will wait until element is visible
 * @param driver
 * @param ele
 * @param timeInSeconds
 */
	public void explicitlyWaitForVisiblityOfElement(WebDriver driver, WebElement ele, int timeInSeconds)
	{
		WebDriverWait Wait= new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
		Wait.until(ExpectedConditions.visibilityOf(ele));
	}

	
	/**
	 * To do mouse over Actions
	 * @param driver
	 * @param ele
	 */
	public void mouseOverAction(WebDriver driver, WebElement ele)
	{
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
	}
/**
 * To do double click action on web element
 * @param driver
 * @param ele
 */
	public void doubleClickAction(WebDriver driver, WebElement ele)
	{
		Actions action=new Actions(driver);
		action.doubleClick(ele).perform();
	}
	
/**
 * to perform rightclick operation on web element
 * @param driver
 * @param ele
 */
	public void rightClickAction(WebDriver driver, WebElement ele)
	{
		Actions action=new Actions(driver);
		action.contextClick(ele).perform();
	}
	
/**
 * to perform click and hold operation on web element 	
 * @param driver
 * @param ele
 */
	public void clickAndHold(WebDriver driver, WebElement ele)
	{
		Actions action=new Actions(driver);
		action.clickAndHold(ele).perform();
	}
	
/**
 * to perform drag and drop operation between two elements	
 * @param driver
 * @param draggingElement
 * @param dropingElement
 */
	public void dragAndDropAction(WebDriver driver, WebElement draggingElement, WebElement dropingElement)
	{
		Actions action=new Actions(driver);
		action.dragAndDrop(draggingElement, dropingElement).perform();
	}
	
	
/**
 * To Perform scrolling to webelement till the element 	
 * @param driver
 * @param ele
 */
	public void scrollToWebElementByActionsClass(WebDriver driver, WebElement ele)
	{
		Actions action=new Actions(driver);
		action.scrollToElement(ele).perform();
	}
	
	
	
}
