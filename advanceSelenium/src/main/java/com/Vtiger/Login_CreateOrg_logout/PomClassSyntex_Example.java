package com.Vtiger.Login_CreateOrg_logout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClassSyntex_Example {
	WebDriver driver;

	public PomClassSyntex_Example(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "user_name")
	private WebElement usernameTF;

	@FindBy(name = "user_password")
	private WebElement passwordTF;

	@FindBy(id = "submitButton")
	private WebElement submitbtn;

	public WebElement getUserName() {
		return usernameTF;
	}

	public WebElement getPassword() {
		return passwordTF;

	}

	public WebElement getSubmit() {
		return submitbtn;
	}
	
	public void loginToApp(String username, String password) {
		
		usernameTF.sendKeys(username);
		passwordTF.sendKeys(password);
		submitbtn.click();
		
		
	}

}
