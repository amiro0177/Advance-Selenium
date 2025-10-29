package com.Vtiger.ContactTest;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Vtiger.ContactPage.ContactModulePage;
import com.Vtiger.ContactPage.CreateContact_ConfirmPage;
import com.Vtiger.ContactPage.LoginPage;
import com.tyss.crm.GenericUtility.WebDriverUtility;

public class ContactModuleTest extends WebDriverUtility {

	  public static void main(String[] args) throws Exception {

		// @BeforeClass
		WebDriver driver;
		// For Generating Ramdom Number.
		Random rand = new Random();
		int random = rand.nextInt(10000);

		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");

		Properties prop = new Properties();
		prop.load(fis);

		String BROWSER = prop.getProperty("browser");
		String URL = prop.getProperty("url");
		String USERNAME = prop.getProperty("un");
		String PASSWORD = prop.getProperty("pwd");

		if (BROWSER.contains("browser")) {
			driver = new ChromeDriver();
		}

		else if (BROWSER.contains("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new EdgeDriver();
		}

		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		Thread.sleep(2000);

		// LOGIN to VTIGER.
		LoginPage lp = new LoginPage(driver);
		lp.login(USERNAME, PASSWORD);

		// Creating Contact below...!

		//@Test
		ContactModulePage cmp = new ContactModulePage(driver);
		System.out.println("Contact Module Page OBJECT has been Created ");
		Thread.sleep(1000);

		String fname = "Qspider" + random;
		String lname = "Test_Yantra" + random;
		String selectUserOption = "Bill Gates";

		ContactModulePage cmp1 = new ContactModulePage(driver);
		cmp1.getClickoncontact().click();
		cmp1.getClickonplussign().click();
		cmp1.getFirstname().sendKeys(fname);
		cmp1.getLastname().sendKeys(lname);
		cmp1.getSelectuseroption().click();

		Select select = new Select(cmp1.getUserdropdown());
		select.selectByVisibleText(selectUserOption);

		// Below is to SAVE
		cmp1.getsavebutton().click();

		Thread.sleep(1000);

		// Click on EDIT Option
		CreateContact_ConfirmPage cc2 = new CreateContact_ConfirmPage(driver);
		cc2.getClickOnEditButton().click();
		Thread.sleep(2000);

		// After click on EDIT Button, then add Mobile number.
		CreateContact_ConfirmPage ccm = new CreateContact_ConfirmPage(driver);
		ccm.getClickOnEditButton().click();

		Thread.sleep(2000);

		CreateContact_ConfirmPage cce = new CreateContact_ConfirmPage(driver);
		Random mobile = new Random();
		int addmobile = mobile.nextInt(10) * 99999;

		cce.getmobile().sendKeys("98765" + addmobile);
		Thread.sleep(2000);
		cce.gethovertosignouticon().click();
		Thread.sleep(2000);
		cce.getselectsignout().click();

	}

}
