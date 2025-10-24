package com.Vtiger.ContactPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//div[@class='input']//descendant::input[@name='user_name']")
	  private WebElement username;
	
	@FindBy(xpath="//div[@class='input']/descendant::input[@name='user_password']")
		private WebElement password;
	
	@FindBy(xpath="//div[@class='button']/descendant::input[@id='submitButton']")
		private WebElement loginbutton;

	

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	public void login(String un, String pwd) {
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();
	}

	
	
	 

}
