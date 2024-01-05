package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NetBanking_Details 
{

	public NetBanking_Details (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getNetBankingFrameTag()
	{
		return netBankingFrameTag;
	}
	
	@FindBy(xpath="//iframe[@title='Netbanking']")
	private WebElement netBankingFrameTag;
	
	
	
	@FindBy(xpath="//input[@value='IDHC']")
	private WebElement IDHC_radioButton;
	
	public WebElement getIDHC_radioButton()
	{
		return IDHC_radioButton;
	}
	
	
	
	@FindBy(xpath="//input[@value='ICD']")
	private WebElement ICD_radioButton;
	
	public WebElement getICD_radioButton()
	{
		return ICD_radioButton;
	}
	
	
	@FindBy(xpath="//input[@value='TBI']")
	private WebElement TBI_radioButton;
	
	public WebElement getTBI_radioButton()
	{
		return TBI_radioButton;
	}
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement SubmitButton;
	
	public WebElement getSubmitButton()
	{
		return SubmitButton;
	}
	
	
	@FindBy(xpath="//button[@name='Submit']")
	private WebElement NetBankSubmitButton;
	
	public WebElement getNetBankSubmitButton()
	{
		return NetBankSubmitButton;
	}
	
}
