package SSUtility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SS_DropDownUtility 
{


		public void selectDropDownByText(String textOfOption, WebElement selectTagOfDropDown)
		{
			Select select = new Select(selectTagOfDropDown);
			select.selectByVisibleText(textOfOption);
		}

		
		public void selectDropDownByValueOfValueAttribute(WebElement selectTagOfDropDown,String valueAttributeValue)
		{
			Select select = new Select(selectTagOfDropDown);
			select.selectByVisibleText(valueAttributeValue);
		}
		
		public void selectDropDownByIndex(int index, WebElement selectTagOfDropDown)
		{
			Select select = new Select(selectTagOfDropDown);
			select.selectByIndex(index);
		}
		
		public void deselectDropDownByText(String textOfOption, WebElement selectTagOfDropDown)
		{
			Select select = new Select(selectTagOfDropDown);
			select.deselectByVisibleText(textOfOption);
		}
		

		public void deselectDropDownByValueAttribute(WebElement selectTagOfDropDown,String valueAttributeValue)
		{
			Select select = new Select(selectTagOfDropDown);
			select.deselectByVisibleText(valueAttributeValue);
		}
		
		public void deselectDropDownByIndex(int index, WebElement selectTagOfDropDown)
		{
			Select select = new Select(selectTagOfDropDown);
			select.deselectByIndex(index);
		}
		
		public ArrayList ToGetAllOptionText(WebElement selectTagOfDropDown)
		{
			Select select = new Select(selectTagOfDropDown);
			List<WebElement> allOptions = select.getOptions();
			
			ArrayList<String> allOptionsTexts = new ArrayList<String>();
			for(WebElement ele:allOptions)
			{
				allOptionsTexts.add(ele.getText());
			}
			return allOptionsTexts;
		}
		
		 public WebElement ToGetPerticularOptiononIndex(WebElement selectTagOfDropDown, int indexOfOption) 
		 {
				Select select = new Select(selectTagOfDropDown);
				List<WebElement> allOptions = select.getOptions();
				WebElement perticularOptionWebElement = allOptions.get(indexOfOption);
				return perticularOptionWebElement;
		 }
}
