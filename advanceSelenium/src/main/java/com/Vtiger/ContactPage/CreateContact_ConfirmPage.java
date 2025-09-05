package com.Vtiger.ContactPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContact_ConfirmPage {

	WebDriver driver=null;
	public CreateContact_ConfirmPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
 
	@FindBy(xpath="//input[@name='Edit' and @title='Edit [Alt+E]']")
	 	private WebElement editbutton;
	
	@FindBy(xpath="//input[@id='mobile']")
		private WebElement mobile;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]' and @type='submit']")
		private WebElement saveAfterEdit;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']/parent::td[@class='small']")
		private WebElement hovertosignouticon;
	
	@FindBy(xpath="//a[@class='drop_down_usersettings' and contains(., 'Sign Out')]")
		private WebElement selectsignout;
	
	
 
	public WebElement getClickOnEditButton() {
		return editbutton;
	}
	
	public WebElement getmobile() {
		return mobile;
	}
	
	public WebElement saveAfterEdit() {
		return saveAfterEdit;
	}
	
	public WebElement gethovertosignouticon() {
		return hovertosignouticon;
	}
	
	public WebElement getselectsignout() {
		return  selectsignout;
	}
	
}
