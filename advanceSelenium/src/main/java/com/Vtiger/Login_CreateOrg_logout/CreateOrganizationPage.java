package com.Vtiger.Login_CreateOrg_logout;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateOrganizationPage {

	public CreateOrganizationPage(WebDriver driver) {
		// this.organizationName=organizationName;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement organizationName;

	@FindBy(xpath = "//td[@class='dvtCellInfo' and contains(., 'User')]")
	private WebElement user;

	@FindBy(xpath = "//span[@id='assign_user' ]//descendant::select[@name='assigned_user_id']")
	private WebElement clickOnDropDownoptions;
	 

	@FindBy(xpath = "//input[@class='crmbutton small save' or contains(., 'Save' )]")
	private WebElement save;

	@FindBy(xpath = "//td[@class='dvtCellInfo' and @id='mouseArea_Organization Name']")
	private WebElement confirmOrganization;
	

	public WebElement getOrganizationName() {
		return organizationName;
	}


	public void setOrganizationName(WebElement organizationName) {
		this.organizationName = organizationName;
	}


	public WebElement getUser() {
		return user;
	}


	public void setUser(WebElement user) {
		this.user = user;
	}


	public WebElement getClickOnDropDownoptions() {
		return clickOnDropDownoptions;
	}


	public void setClickOnDropDownoptions(WebElement clickOnDropDownoptions) {
		this.clickOnDropDownoptions = clickOnDropDownoptions;
	}


	public WebElement getSave() {
		return save;
	}


	public void setSave(WebElement save) {
		this.save = save;
	}


	public WebElement getConfirmOrganization() {
		return confirmOrganization;
	}


	public void setConfirmOrganization(WebElement confirmOrganization) {
		this.confirmOrganization = confirmOrganization;
	}


	public void createOrganization(String orgName, String assignuser) throws InterruptedException {

		Random randon = new Random();
		int ran = randon.nextInt(1000);

		organizationName.sendKeys(orgName);

		// Assigned To:-- USER: Chosen.
		user.isSelected();
		user.click();
		Thread.sleep(1000);

		clickOnDropDownoptions.click(); // it will click on Drop Down options.

		Thread.sleep(1000);

		Select select = new Select(clickOnDropDownoptions);
		select.selectByVisibleText("Bill Gates");
		System.out.println("clickOnDropDownoptions :: Bill Gates");

		Thread.sleep(1000);

		save.click();
		System.out.println(save.getText());
		
		
		

	}

}
