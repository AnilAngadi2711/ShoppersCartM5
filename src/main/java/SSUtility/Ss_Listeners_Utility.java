package SSUtility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class Ss_Listeners_Utility extends SS_BaseClass implements ITestListener
{

	public void onTestFailure(ITestResult result)
	{
		String failedMethod = result.getMethod().getMethodName().toString();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		String currentTime = LocalDateTime.now().toString().replace(';', '-');
		
		File ImageFile = new File("./src/test/resources/ScreenShot/"+currentTime+failedMethod+".png");
		
		try {
			FileHandler.copy(tempFile, ImageFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}





	
}
