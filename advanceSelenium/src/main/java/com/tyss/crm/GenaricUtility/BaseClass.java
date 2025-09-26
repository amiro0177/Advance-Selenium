package com.tyss.crm.GenaricUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.Vtiger.ContactPage.LoginPage;
import com.Vtiger.Login_CreateOrg_logout.Logout;
import com.beust.jcommander.Parameter;

public class BaseClass {

	// Object Created...
	public FileUtility fileutility = new FileUtility();
	public WebDriverUtility webDriverUtility = new WebDriverUtility();
	public JavaUtility javaUtil = new JavaUtility();
	public WebDriver driver;

	@BeforeSuite
	public void beforeSuit() {

		System.out.println("***** Connecting to Data Base *****");
	}

	//@Parameters("BROWSER")
	@BeforeClass
	public void launchBrowser() throws IOException {

		System.out.println("Launching the BROWSER");
		// String BROWSER=browser;

		 String BROWSER1 = fileutility.readDataFromPropertiesFile("browser");
		if (BROWSER1.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}

		else if (BROWSER1.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else {
			//driver = new EdgeDriver();

		}

		webDriverUtility.maximizeWindow(driver);

	}

	@BeforeMethod
	public void loginTest() throws Throwable {

		System.out.println("=== Login ===");

		fileutility.readDataFromPropertiesFile("url");

		String URL = fileutility.readDataFromPropertiesFile("url");
		String USERNAME = fileutility.readDataFromPropertiesFile("un");
		String PASSWORD = fileutility.readDataFromPropertiesFile("pwd");
		driver.get(URL);

		LoginPage lp = new LoginPage(driver);
		lp.login(USERNAME, PASSWORD);

		System.out.println("Login Successfully Done ");

	}

	@AfterMethod
	public void logout() throws InterruptedException {
		System.out.println("This method is Used for Logout");

		Thread.sleep(2000);
		Logout logout = new Logout(driver);
		logout.signout();
		System.out.println("Logout SuccessFully Done: ");

	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("=== Browser is Closed Now===");
		driver.close();

	}

	@AfterSuite
	public void afterSuit() {
		System.out.println("=== Closed data Base, Report Back Up Done");
	}

}
