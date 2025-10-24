package advSelenium_15_07_2025;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateOrganizationInVtiger {
	
	@SuppressWarnings("null")
	public static void main(String[] args) throws Exception
	{
		
		//WebDriver driver=null;
		FileInputStream fis=new FileInputStream("E:\\A8_QSPIDER SELENIUM LEARNING\\advanceSelenium_15-07-2025\\src\\test\\resources\\CommonData.properties");
		 	
		Properties prop=new Properties();
			prop.load(fis);
			
			String BROWSER=prop.getProperty("browser");
			String URL=prop.getProperty("url");
			String USERNAME=prop.getProperty("un");
			String PASSWORD=prop.getProperty("pwd");
			
			System.out.println(BROWSER);
		/*	
			if(BROWSER.equals("browser")) {
				new ChromeDriver();
			}
			
			else if(BROWSER.equals("browser")) {
				new FirefoxDriver();
			}
			else {
				new ChromeDriver();
			}
			
		*/
			WebDriver driver=new ChromeDriver();
			//URL to open Website.
			driver.get(URL);
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//User name
			WebElement un=driver.findElement(By.xpath("//input[@name='user_name']"));
				un.sendKeys(USERNAME);
				
				Thread.sleep(2000);
			//password
			WebElement ps=driver.findElement(By.xpath("//input[@name='user_password']"));
				ps.sendKeys(PASSWORD);
				
				Thread.sleep(2000);
			//submit button
				
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submitButton"))).click();
				
		
			driver.navigate().refresh();
			Thread.sleep(2000);
			WebElement organizationmodule = driver.findElement(By.partialLinkText("Organizations"));
				organizationmodule.click();
				Thread.sleep(2000);
				
			WebElement createorganization=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
				
			createorganization.click();
			
	
	
	
	
	
	
	
	
	
	}

}
