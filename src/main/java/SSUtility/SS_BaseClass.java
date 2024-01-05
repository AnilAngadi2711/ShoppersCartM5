package SSUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomClass.AccountSettingPage;
import PomClass.HomePage;
import PomClass.LoginPage;
import PomClass.WelcomePage;

public class SS_BaseClass
{
	public static WebDriver driver;
	public SS_Data_Utility  data = new  SS_Data_Utility ();
	public SS_WebDriverUtility WU = new SS_WebDriverUtility();
	public SS_DropDownUtility  DrpDnU= new SS_DropDownUtility ();
	

	
	
	@BeforeClass
	public void LaunchBrowser() throws Throwable
	{
		System.out.println("------Launching Browser------");
		String BROWSER = data.dataFromPropertiesFile("browser");
		
		if(BROWSER.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if(BROWSER.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		else if(BROWSER.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		
		else 
		{
			driver=new ChromeDriver();
		}
		
		String URL = data.dataFromPropertiesFile("url");
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	}
	
	@BeforeMethod
	public void LoginAccess() throws Throwable 
	{
		System.out.println("----------Login To Application----------");
		Thread.sleep(3000);
		WelcomePage WLPage = new WelcomePage(driver);
		WLPage.getMainLoginButton().click();
		
		LoginPage LGPage = new LoginPage(driver);
		String emailId = data.dataFromPropertiesFile("email");
		LGPage.getemailTextField().sendKeys(emailId);
		
		String PassWord = data.dataFromPropertiesFile("password");
		LGPage.getpasswordTextField().sendKeys(PassWord);
		
		LGPage.getloginButton().click();
	
		}


	
	@AfterMethod
	public void Logout() throws Throwable
	{
		System.out.println("----------Logout From Application----------");
		Thread.sleep(10000);
		HomePage HmPage = new HomePage(driver);
		HmPage.getaccountSettingIcon().click();
//		WU.javaScriptClick(driver, HmPage.getaccountSettingIcon());
		
		AccountSettingPage ActSetPage = new AccountSettingPage (driver);
		ActSetPage.getlogoutIcon().click();
	}
	
	@AfterClass
	public void QuitBrowser()
	{
		System.out.println("----------Quit Browser----------");
		driver.quit();
	}
}
