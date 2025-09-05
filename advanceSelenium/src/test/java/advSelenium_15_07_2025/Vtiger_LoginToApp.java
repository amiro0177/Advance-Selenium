package advSelenium_15_07_2025;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Vtiger.Login_CreateOrg_logout.CreateOrganizationPage;
import com.Vtiger.Login_CreateOrg_logout.HomePage;
import com.Vtiger.Login_CreateOrg_logout.OrganizationPage;
import com.Vtiger.Login_CreateOrg_logout.PomClassSyntex_Example;

public class Vtiger_LoginToApp
{
	public static void main(String[] args) throws Exception {
		
		Random randon=new Random();
		 int ran=randon.nextInt(1000);
		 
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
	
	 Properties prop=new Properties();
	 	prop.load(fis);
	 	
	 	String BROWSER=prop.getProperty("browser");
	 	String URL=prop.getProperty("url");
	 	String USERNAME=prop.getProperty("un");
	 	String PASSWORD=prop.getProperty("pwd");
	 	
	 	WebDriver driver=new ChromeDriver();
	 	driver.get(URL);
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 	
	 	
	 	PomClassSyntex_Example lp=new PomClassSyntex_Example(driver);
	 			lp.loginToApp(USERNAME, PASSWORD);
	 	
	 	System.out.println("SuccessFul Login !!!");
	 	 
	 	Thread.sleep(2000);
	 	
	 	// Create Object of HomePage....
	 	 HomePage hp=new HomePage(driver);
	 	 		 hp.contactLink.click();
	 	 	     hp .orgLink.click();
	 	 	Thread.sleep(2000);
	 
	 	 	//click on Organization Module
	 	OrganizationPage op=new OrganizationPage(driver);
	 			op.clickOnOrganizationButton();
	 			
	 			Thread.sleep(2000);
	 			//click on Create Organization Module	
	 			
	 			String orgname="Test_Yantra" +ran;
	 			String assignuser="Bill_Gate";
	   CreateOrganizationPage co=new CreateOrganizationPage(driver);
	 			co.createOrganization(orgname,assignuser);
	 			
	 			Thread.sleep(2000);
	 			//for Validation
	 			CreateOrganizationPage co1=new CreateOrganizationPage(driver);
	 			String actualorg=co1.getConfirmOrganization().getText();
	 			
	 			if(actualorg.contains(orgname))
	 			{
	 				System.out.println("Created");
	 			}
	 			
	 	Thread.sleep(2000);
	 	
	 	/*
	 	  SignOut signout=new SignOut(driver);
	 	
	 		signout.hoverTosignOutOptions();
	 		System.out.println("Successfully SignOut from Vtiger");
	 	 */	
	 		
	 		 
	 					 	 
	 	 
	 	 
	 	
	}
	

}
