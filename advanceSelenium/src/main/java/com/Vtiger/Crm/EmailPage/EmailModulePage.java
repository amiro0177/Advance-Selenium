package com.Vtiger.Crm.EmailPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailModulePage {

	WebDriver driver;

	public EmailModulePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[@class='tabUnSelected' and contains(., 'Email')]")
	private WebElement emailmodule;

	@FindBy(xpath = "//td[@class='small' and contains(., 'Compose')]")
	private WebElement compose;

	@FindBy(xpath = "//select[@name='parent_type']")
	private WebElement toDropDown;

	@FindBy(xpath = "//span[@class='mailClientCSSButton']//descendant::img[@alt='Select']")
	private WebElement toPlusIcon;

	@FindBy(xpath = "//td[@class='dvtCellLabel']//descendant::input[@id='search_txt']")
	private WebElement plusiconsearch;
	
	//td[@class='dvtCellLabel']//descendant::input[@id='search_txt']

	@FindBy(xpath = "//tr[@class='lvtColData']")
	private WebElement bintobil;

	@FindBy(xpath = "//input[@id='cc_name']")
	private WebElement cc;

	@FindBy(id="subject")
	private WebElement subject;

	@FindBy(xpath = "//body[@class='cke_show_borders']")
	private WebElement body;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement composeMailSave;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement logout;

	// Getter
 
	public WebElement getEmailmodule() {
		return emailmodule;
	}
 
	public WebElement getCompose() {
		return compose;
	}

	public WebElement getToDropDown() {
		return toDropDown;
	}

	public WebElement getToPlusIcon() {
		return toPlusIcon;
	}

	public WebElement getPlusiconsearch() {
		return plusiconsearch;
	}

	public WebElement getBintobil() {
		return bintobil;
	}

	public WebElement getCc() {
		return cc;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getBody() {
		return body;
	}

	public WebElement getComposeMailSave() {
		return composeMailSave;
	}
	
	public WebElement getLogout() {
		return logout;
	}

	// Setter

	public void setEmailmodule(WebElement emailmodule) {
		this.emailmodule = emailmodule;
	}

	public void setCompose(WebElement compose) {
		this.compose = compose;
	}

	public void setToDropDown(WebElement toDropDown) {
		this.toDropDown = toDropDown;
	}

	public void setToPlusIcon(WebElement toPlusIcon) {
		this.toPlusIcon = toPlusIcon;
	}

	public void setPlusiconsearch(WebElement plusiconsearch) {
		this.plusiconsearch = plusiconsearch;
	}

	public void setCc(WebElement cc) {
		this.cc = cc;
	}

	public void setSubject(WebElement subject) {
		this.subject = subject;
	}

	public void setBody(WebElement body) {
		this.body = body;
	}

	public void setComposeMailSave(WebElement composeMailSave) {
		this.composeMailSave = composeMailSave;
	}
	
	public void setLogout(WebElement logout) {
		this.logout = logout;
	}

}
