package com.Vtiger.Crm.EmailModuleTest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Vtiger.Crm.EmailPage.EmailModulePage;
import com.tyss.crm.GenaricUtility.BaseClass;

public class EmailModuleTest extends BaseClass {

	@Test
	public void emailModuleTest() throws Exception {

		EmailModulePage EmailModulePage1 = new EmailModulePage(driver);
		EmailModulePage1.getEmailmodule().click();

		String title = "";
		String title2 = "";
		Thread.sleep(1000);

		// compose mail's window's instance that is "main window"
		String mainwindow = driver.getWindowHandle();

		EmailModulePage EmailModulePage2 = new EmailModulePage(driver);
		EmailModulePage2.getCompose().click();

		Thread.sleep(1000);

		EmailModulePage EmailModulePage3 = new EmailModulePage(driver);

		Set<String> allwindow = driver.getWindowHandles();

		System.out.println("Main Windows id: " + allwindow);
		for (String id : allwindow) {
			title = driver.switchTo().window(id).getTitle();
			System.out.println("Title of Current Page: " + title);
			if (title.contains("Compose Mail")) {

				break;

			}
		}
		System.out.println("Hi Welcome to Window_2");

		EmailModulePage3.getToDropDown().click();
		Select s = new Select(EmailModulePage3.getToDropDown());
		s.selectByValue("Vendors");

		Thread.sleep(1000);

		EmailModulePage EmailModulePage4 = new EmailModulePage(driver);
		EmailModulePage4.getToPlusIcon().click();

		System.out.println("****** End of Second Window ******");

		System.out.println("***** From Here you will Redirect to third Window *****");

		Set<String> mainwindow2 = driver.getWindowHandles();
		System.out.println(mainwindow2);
		for (String id2 : mainwindow2) {
			title2 = driver.switchTo().window(id2).getCurrentUrl();
			if (title2.contains("Vendors&action")) {

				break;

			}

		}
		System.out.println("Title of Third Window: ");
		Thread.sleep(1000);

		EmailModulePage EmailModulePage5 = new EmailModulePage(driver);
		EmailModulePage5.getPlusiconsearch().sendKeys("Bin2Bil", Keys.ENTER);

		Thread.sleep(1000);

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Bin2Bil']"))).click().build().perform();

		System.out.println("***** End of work on Window 3 *****");

		Set<String> mmm = driver.getWindowHandles();
		for (String id3 : mmm) {
			String t2 = driver.switchTo().window(id3).getTitle();
			if (t2.contains(title2)) {
				break;
			}
		}
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		EmailModulePage EmailModulePage6 = new EmailModulePage(driver);
		EmailModulePage6.getCc().sendKeys("Testingautomation" + javaUtil.randonNumber() + "@test.com");

		Thread.sleep(1000);

		EmailModulePage EmailModulePage7 = new EmailModulePage(driver);
		EmailModulePage7.getSubject().sendKeys("Regarding Automation Testing Learning Purpose.");

		Thread.sleep(1000);

		// Body
		Actions a = new Actions(driver);
		a.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB)
				.sendKeys("Learning Automation is Very Important in todays time").perform();

		Thread.sleep(1000);

		EmailModulePage EmailModulePage8 = new EmailModulePage(driver);
		EmailModulePage8.getComposeMailSave().click();

		Thread.sleep(1000);

		driver.switchTo().window(mainwindow);

		Thread.sleep(1000);

		System.out.println("*** Compose Mail Testing Ended ***");

	}
}
