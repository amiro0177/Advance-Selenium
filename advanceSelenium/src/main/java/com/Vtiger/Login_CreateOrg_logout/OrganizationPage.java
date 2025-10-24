package com.Vtiger.Login_CreateOrg_logout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {

	public OrganizationPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Create Organization...']")
		WebElement createorganizationbtn;
	
	
	// Click on Create Organization  
	public void clickOnOrganizationButton() {
		
		createorganizationbtn.click();
	}
	
}
