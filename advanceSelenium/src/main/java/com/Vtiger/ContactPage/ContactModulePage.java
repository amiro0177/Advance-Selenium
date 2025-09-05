package com.Vtiger.ContactPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactModulePage {

	 WebDriver driver=null;
	public ContactModulePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//td[@class='tabUnSelected' and contains(., 'Contacts')]")
	 	private WebElement clickoncontact;
	
	@FindBy(xpath="//img[@title='Create Contact...']")
		private WebElement clickonplussign;
	
	@FindBy(xpath="//input[@name='firstname']")
		private WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
		private WebElement lastname;
	
	@FindBy(xpath="//td[@class='dvtCellInfo' and contains(., 'User')]")
		private WebElement selectuseroption;
	
	@FindBy(xpath="//select[@name='assigned_user_id' ]")
		private WebElement userdropdown;
	
	@FindBy(xpath="//div[@align='center']//descendant::input[@title='Save [Alt+S]']")
		private WebElement savebutton;
	
	
	//Getter Created.
	
	public WebElement getClickoncontact() {
		 
		return clickoncontact;
	}

	public WebElement getClickonplussign() {
		return clickonplussign;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getSelectuseroption() {
		return selectuseroption;
	}

	public WebElement getUserdropdown() {
		return userdropdown;
	}
	
	public WebElement getsavebutton() {
		return savebutton;
	}
	
	
	
	
}
