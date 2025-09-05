package com.Vtiger.Login_CreateOrg_logout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//td[@class='tabUnSelected']/a[text()='Organizations']")
	public WebElement orgLink;

	@FindBy(xpath = "//td[@class='tabUnSelected']/a[text()='Contacts']")
	public WebElement contactLink;

	public WebElement getOrgLink() {
		return orgLink;
	}

	public void getContactLink() {
		  contactLink.click();
	}

	// Business Logic
	private void clickOnOrgLink() {
		orgLink.click();
	}

}
