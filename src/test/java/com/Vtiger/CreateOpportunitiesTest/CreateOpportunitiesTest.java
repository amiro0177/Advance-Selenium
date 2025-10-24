package com.Vtiger.CreateOpportunitiesTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.Vtiger.ContactPage.LoginPage;
import com.Vtiger.CreateOpportunitiesPage.CreateOpportunitiesPage;
import com.tyss.crm.GenaricUtility.JavaUtility;

public class CreateOpportunitiesTest extends JavaUtility {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = null;
		FileInputStream fis = new FileInputStream(
				"E:\\A8_QSPIDER SELENIUM LEARNING\\advanceSelenium_15-07-2025\\src\\test\\resources\\CommonData.properties");
		Properties prop = new Properties();
		prop.load(fis);

		String BROWSER = prop.getProperty("browser");
		String URL = prop.getProperty("url");
		String USERNAME = prop.getProperty("un");
		String PASSWORD = prop.getProperty("pwd");

		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
			driver.get(URL);
			System.out.println("Browser Opened");
		}

		else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.get(URL);
			System.out.println("Browser Opened");
		}

		else {
			driver = new ChromeDriver();
			driver.get(URL);
			System.out.println("Browser Opened");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		LoginPage lp = new LoginPage(driver);
		lp.login(USERNAME, PASSWORD);
		System.out.println("***** Login Successful *****");

		Thread.sleep(1000);
		Random r = new Random();
		int rannumber = r.nextInt(200);

		CreateOpportunitiesPage createopportunities1 = new CreateOpportunitiesPage(driver);
		createopportunities1.getOpportunitiesmodule().click();
		createopportunities1.getCreatenewopportunities().click();

		// Opportunity Name created.
		createopportunities1.getOpportunityname().sendKeys("Opportunities Name_" + rannumber);
		System.out.println("Opportunity Name created");

		Thread.sleep(1000);

		CreateOpportunitiesPage createopportunities2 = new CreateOpportunitiesPage(driver);
		createopportunities2.getRelatedtodropdown().click();
		System.out.println("Clicked On Related To Drop down.");

		CreateOpportunitiesPage createopportunities3 = new CreateOpportunitiesPage(driver);
		Select selectoption = new Select(createopportunities3.getRelatedtodropdown());
		selectoption.selectByValue("Contacts");
		System.out.println("Releated to Drop down option Selected");
		Thread.sleep(2000);

		String mainwin = driver.getWindowHandle();
		// Here we Perform action on related to add icon
		CreateOpportunitiesPage createopportunities4 = new CreateOpportunitiesPage(driver);
		createopportunities4.getrelatedtoaddicon().click();

		Thread.sleep(1000);

		// Window Handle
		Set<String> windowid = driver.getWindowHandles();
		for (String id : windowid) {
			String currenturl = driver.switchTo().window(id).getCurrentUrl();
			System.out.println("Current URL: " + currenturl);
			if (currenturl.contains("Contacts&action")) {

				Thread.sleep(2000);
				WebElement search = driver.findElement(By.xpath("//input[@id='search_txt']"));
				search.sendKeys("thanveer3141", Keys.ENTER);

				Thread.sleep(2000);
				driver.findElement(By.xpath("//table[@class='small']//descendant::a[@id='1']")).click();

				System.out.println("***** Windows has been Handled and Returned to the Man Window *****");

			}
		}
		driver.switchTo().window(mainwin);
		Thread.sleep(1000);

		CreateOpportunitiesPage createopportunities5 = new CreateOpportunitiesPage(driver);
		createopportunities5.getGroupOption().click();
		createopportunities5.getAssignedToGroupDropdown().click();
		Thread.sleep(1000);

		// Selecting Group Option Drop Down option : Support Group
		CreateOpportunitiesPage createopportunities6 = new CreateOpportunitiesPage(driver);
		Select option = new Select(createopportunities6.getAssignedToGroupDropdown());
		option.selectByValue("4");
		System.out.println("Support Group is Selected  ");

 
		// Click on Calendar Icon.
		CreateOpportunitiesPage createopportunities8 = new CreateOpportunitiesPage(driver);
		createopportunities8.getexpectedclosedate().click();

		Thread.sleep(1000);
		
		//Selected Date
		CreateOpportunitiesPage createopportunities9 = new CreateOpportunitiesPage(driver);
		createopportunities9.getchosendate().click();

		Thread.sleep(1000);
		
		// Sales Stage Drop Down Click.
		CreateOpportunitiesPage createopportunities10 = new CreateOpportunitiesPage(driver);
		createopportunities10.getSalesstagedropdown().click();
		
		Thread.sleep(1000);
		
		//Selecting Prospecting option from stage drop down option.
		CreateOpportunitiesPage createopportunities11 = new CreateOpportunitiesPage(driver);
		Select  selectstagedd=new Select(createopportunities11.getSalesstagedropdown());
		selectstagedd.selectByValue("Needs Analysis");
		
		Thread.sleep(1000);
		
		//Save
		CreateOpportunitiesPage createopportunities12 = new CreateOpportunitiesPage(driver);
		createopportunities12.getSave().click();
		
		
		
		
		
		
		
	}
}
