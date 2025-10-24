package com.Vtiger.CreateOpportunitiesConfirmPage;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOpportunitiesConfirmPage {

	WebDriver driver;

	public CreateOpportunitiesConfirmPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// this.driver=driver;
	}

	
	@FindBy(xpath="//input[@title='Edit [Alt+E]' and @name='Edit']")
	private WebElement edit;
	
	@FindBy(xpath = "//input[@name='amount' and @class='detailedViewTextBox']")
	private WebElement amount;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]' and @type='submit']")
	private WebElement confirmsave;
 
//Getter

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getAmount() {

		return amount;
	}
	
	public WebElement getConfirmSave() {
		return confirmsave;
	}
	
	public void setEdit(WebElement edit) {
		 this.edit=edit;
	}
	
	public void setAmount(WebElement amount) {
		 this.amount=amount;
	}
	
	public void setConfirmSave(WebElement confirmsave) {
		 this.confirmsave=confirmsave;
	}
}
	 
