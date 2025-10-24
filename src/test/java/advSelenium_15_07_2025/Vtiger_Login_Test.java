package advSelenium_15_07_2025;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
 

public class Vtiger_Login_Test 
{
	//@SuppressWarnings("null")
	@SuppressWarnings("null")
	public static void main(String[] args) throws Exception
	{
		
		WebDriver driver=null;
		FileInputStream fis=new FileInputStream("E:\\A8_QSPIDER SELENIUM LEARNING\\advanceSelenium_15-07-2025\\CommonData\\CommonData.properties");
	
	 Properties prop=new Properties();
	 	prop.load(fis);
	 	
	 	String BROWSER=prop.getProperty("browser");
	 	String URL=prop.getProperty("url");
	 	String USERNAME=prop.getProperty("un");
	 	String PASSWORD=prop.getProperty("pwd");
	 	
	 	System.out.println(prop.getProperty("browser"));
	 	 
	 	 /*	 if(BROWSER.equals("browser"))
	 	 
	 		new ChromeDriver();
	 	 
		else if((BROWSER.equals("firefox")))
	 	{
	 		new FirefoxDriver();
	 	}
	 	else if((BROWSER.equals("chrome")))
	 	{
	 		new EdgeDriver();
	 	}
	
	 	else
	 	{
	 		System.out.println("Browser not Found");
	 		//new ChromeDriver();
	 	}
	  		
	 */	
	 	//WebDriver driver=new ChromeDriver();
	 	//URL : "http://49.249.28.218:8888/index.php?module=Accounts&action=index"
	 	driver.get(URL);
	 	
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 	
	 	Thread.sleep(2000); 	//User name:
	 	WebElement username=driver.findElement(By.xpath("//input[@name='user_name']"));
	 		username.sendKeys(USERNAME);
	 		Thread.sleep(2000); //password 
	 		
	 	WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
	 		password.sendKeys(PASSWORD);
	 		Thread.sleep(2000); // submit or login
	 	WebElement submit=driver.findElement(By.xpath("//input[@id='submitButton']"));
	 		submit.click();
	 		
	 		Thread.sleep(3000);
	 		
	 		//Click on Organisation.
	 		
	 		WebElement organizationmodule=driver.findElement(By.partialLinkText("Organizations"));
	 			organizationmodule.click();
	 		 	
	 		/* Actions act=new Actions(driver);
	 		  	act.moveToElement(driver.findElement(By.xpath("//img[@alt='Create Organization...']"))).build().perform();
	 		 	act.click();
	 		 */	
	 		  WebElement addorganization=driver.findElement(By.xpath("//img[@alt='Create Organization...']"));
	 		  	addorganization.click();
	 		 		
	 		  WebElement createorganization=driver.findElement(By.xpath("//input[@name='accountname']"));
	 		  	createorganization.sendKeys("TekPyramid"+(int)Math.random()*9);
	 		 
	 		  WebElement website=driver.findElement(By.name("website"));
	 		  	website.sendKeys("Website_"+(int)Math.random()*99 +"@Tekpyramid.com");
	 		  	
	 		  	Thread.sleep(2000);
	 		  	
	 		  	 
	 		  	WebElement industryoptions=driver.findElement(By.xpath("//td[@class='dvtCellInfo']//descendant::select[@name='industry']"));
	 		  		//industryoptions.click();
	 		  		Select selectindustry=new Select(industryoptions);
	 		  		
	 		  		selectindustry.selectByIndex(11);
	 		  		Thread.sleep(3000);
	 		  		 
	 		  	WebElement assignedTo=driver.findElement(By.xpath("//td[@class='dvtCellInfo' ]/descendant::input[@type='radio']/following-sibling::input[@name='assigntype']"));
	 		  	assignedTo.click();
	 		  	Thread.sleep(2000);
	 		  	
	 		  	WebElement group=driver.findElement(By.xpath("//span[@id='assign_team']/descendant::select[@name='assigned_group_id']"));
	 		  			group.click();
	 		  			Thread.sleep(3000);
	 		  			
	 		  	Select selectgroup=new Select(group);
	 		  	selectgroup.selectByValue("2");
	 		  	assignedTo.click();
	 		  	
	 		  	
	 		  	
	 		  	
	 		 
	 		  	
	
	
	
	}

}
