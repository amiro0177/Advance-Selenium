package com.Vtiger.Crm.ProductModuleTest;

import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Vtiger.ContactPage.LoginPage;
import com.Vtiger.Crm.ProductsModulePage.ProductsPage;

public class ProductModuleTest {

	 public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver;

	 
		FileInputStream fis = new FileInputStream(
				"E://A8_QSPIDER SELENIUM LEARNING/advanceSelenium_15-07-2025/src/test/resources/CommonData.properties");

		Properties prop = new Properties();
		prop.load(fis);
		String BROWSER = prop.getProperty("browser");
		String URL = prop.getProperty("url");
		String USERNAME = prop.getProperty("un");
		String PASSWORD = prop.getProperty("pwd");

		if (BROWSER.contains("browser")) {
			driver = new ChromeDriver();

		} else if (BROWSER.contains("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.contains("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}

		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		LoginPage login = new LoginPage(driver);
		login.login(USERNAME, PASSWORD);
		 
		
		Thread.sleep(1000);

		ProductsPage productsPage1 = new ProductsPage(driver);
		productsPage1.getProductmodule().click();

		Thread.sleep(1000);

		ProductsPage productsPage2 = new ProductsPage(driver);
		productsPage2.getCreateProductAddPlussign().click();

		Thread.sleep(1000);

		ProductsPage productsPage3 = new ProductsPage(driver);
		Random ran = new Random();
		int random = ran.nextInt(90000);

		productsPage3.getProductnameTextField().sendKeys("ProductName_" + random);

		Thread.sleep(1000);
		ProductsPage productsPage4 = new ProductsPage(driver);
		WebElement sel = productsPage4.getProductactive();
		if (sel.isSelected()) {
			System.out.println("This CheckBox is Selected");
			// return;

		} else {
			productsPage4.getProductactive().click();

		}

		Thread.sleep(1000);

		ProductsPage productsPage5 = new ProductsPage(driver);
		productsPage5.getProductCategoryDropDown().click();
		Select selectproductcategories = new Select(productsPage5.getProductCategoryDropDown());
		selectproductcategories.selectByValue("Software");

		Thread.sleep(1000);

		ProductsPage productsPage6 = new ProductsPage(driver);
		String mainWindow = driver.getWindowHandle();
		Thread.sleep(1000);
		productsPage6.getVendorNamePlusSign().click();

		System.out.println("Main Window ID: " + mainWindow);
		Set<String> windowhandlesId = driver.getWindowHandles();

		for (String id : windowhandlesId) {
			String currentUrl = driver.switchTo().window(id).getCurrentUrl();
			System.out.println("Current Url of Second Window: " + currentUrl);
			if (currentUrl.contains("Vendors")) {

				Thread.sleep(1000);
				WebElement search = driver.findElement(By.xpath("//input[@id='search_txt']"));
				search.sendKeys("Bin2Bil", Keys.ENTER);

				Thread.sleep(1000);
				WebElement searcheditem = driver.findElement(By.xpath("//a[@id='1' and contains(., 'Bin2Bil')] "));
				Actions Action = new Actions(driver);
				Action.moveToElement(searcheditem).click().build().perform();

				// String text=searcheditem.getText();
				// System.out.println("Searched Item Name: " +text);
				Thread.sleep(1000);

			} else {
				System.out.println("Something is Fishy");
			}
			driver.switchTo().window(mainWindow);
			Thread.sleep(4000);

			// ProductsPage productsPage7 = new ProductsPage(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");

			Thread.sleep(2000);

			ProductsPage productsPage8 = new ProductsPage(driver);
			productsPage8.getUsageUnit_Dropdown().click();

			Select select = new Select(productsPage8.getUsageUnit_Dropdown()); // Selecting the value from Usage Unit
			select.selectByValue("Pieces");

			Thread.sleep(3000);

			ProductsPage productsPage9 = new ProductsPage(driver);
			productsPage9.getHandler_UserCheckBox().click();

			ProductsPage productsPage10 = new ProductsPage(driver);
			productsPage10.getHandler_UserCheckBox_Dropdown().click();

			Thread.sleep(1000);

			Select sel2 = new Select(productsPage10.getHandler_UserCheckBox_Dropdown());
			sel2.selectByValue("6");

			Thread.sleep(3000);

			ProductsPage productsPage11 = new ProductsPage(driver);
			productsPage11.getDescriptionTextField().sendKeys("Why Automation Testing is Required?\r\n " + " \r\n "
					+ " Automation testing is essential in modern software development because it enables faster,\r\n "
					+ " more reliable, and cost-effective testing compared to manual methods. It plays a key role-\r\n "
					+ " in meeting the speed, scalability, and quality demands of Agile and DevOps environments.\r\n"
					+ "");

			Thread.sleep(1000);
			ProductsPage productsPage12 = new ProductsPage(driver);
			productsPage12.getSave().click();

		}

	}

}
