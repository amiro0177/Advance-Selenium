package listenerImplementation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.io.Files;

@Listeners
public class ListenerTest  implements ITestListener, ISuiteListener{
	
	@Test
	public void onStart() {
		System.out.println("On Start Method");
	}
	
	@Test
	public void onFinish() throws IOException {
		System.out.println("On Finish");
		
		WebDriver driver=new ChromeDriver();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File desc=new File("E:/A8_QSPIDER SELENIUM LEARNING/advanceSelenium_15-07-2025/Screen Shot Captured/xyz.png");
		Files.copy(src, desc);
	}
	
	@Test
	public void onTestStart() {
		System.out.println("On Test Start");
	}
	
	@Test
	public void onTestSuccess() {
		System.out.println("On Test Success");
	}
	
	@Test
	public void onTestFailure() {
		System.out.println("On Test Failure");
	}
	
	@Test
	public void onTestSkipped() {
		System.out.println("On Test Failure");
	}
	
	@Test
	public void onTestFailedButWithinSuccessPercentage() {
		System.out.println("On Test Failed But Within Success Percentage");
	}
		
	  

}
