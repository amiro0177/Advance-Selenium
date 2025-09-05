package com.Vtiger.Login_CreateOrg_logout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout  {
	
	WebDriver driver;
	
	 public Logout(WebDriver driver) {
		 
		 PageFactory.initElements(driver,this);
		 this.driver=driver;
	 }
	 
	 @FindBy(xpath="//td[@class='small']/descendant::img[@src='themes/softed/images/user.PNG']")
	 	private WebElement profileicon;
	 
	 @FindBy(xpath="//a[@class='drop_down_usersettings' and contains(.,'Sign Out')]")
	 	private WebElement signout;
	 
	 public void signout() {
		
		 Actions act=new Actions(driver);
		 	act.moveToElement(profileicon).click(signout).perform();
		 	act.click(signout);
		 	 
	 }
}
