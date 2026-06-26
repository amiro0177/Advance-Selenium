package com.Vtiger.QuickCreatePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickCreateDropDownPage {
	
	public void quickCreatePage(WebDriver driver) {
		
		 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@id='qccombo']")
	private WebElement quickCreate;

	public WebElement getQuickCreate() {
		return quickCreate;
	}

	public void setQuickCreate(WebElement quickCreate) {
		this.quickCreate = quickCreate;
	}
	
 
	
	
	
	

}
