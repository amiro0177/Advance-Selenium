package com.Vtiger.Crm.LeadModule_Confirm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadModuleConfirmPage {

	public LeadModuleConfirmPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Leads']")
	private WebElement leadsmodule;

	@FindBy(xpath="//input[@name='search_text']")
	private WebElement search;

	@FindBy(xpath = "//div[@id='basicsearchcolumns_real']//descendant::select[@id='bas_searchfield']")
	private WebElement searchdropdown;

	@FindBy(xpath = "//input[@value=' Search Now ']")
	private WebElement searchnowbutton;

	@FindBy(xpath = "//input[@id='64015' and @name='selected_id']")
	private WebElement selectsearchresultcheckbox;

	@FindBy(xpath = "//input[@class='crmbutton small delete' and @value='Delete']")
	private WebElement deletebutton;

	// Getter

	public WebElement getLeadsmodule() {
		return leadsmodule;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSearchdropdown() {
		return searchdropdown;
	}

	public WebElement getSearchnowbutton() {
		return searchnowbutton;
	}

	public WebElement getSelectsearchresultcheckbox() {
		return selectsearchresultcheckbox;
	}

	public WebElement getDeletebutton() {
		return deletebutton;
	}

	// Setter

	public void setLeadsmodule(WebElement leadsmodule) {
		this.leadsmodule = leadsmodule;
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}

	public void setSearchdropdown(WebElement searchdropdown) {
		this.searchdropdown = searchdropdown;
	}

	public void setSearchnowbutton(WebElement searchnowbutton) {
		this.searchnowbutton = searchnowbutton;
	}

	public void setSelectsearchresultcheckbox(WebElement selectsearchresultcheckbox) {
		this.selectsearchresultcheckbox = selectsearchresultcheckbox;
	}

	public void setDeletebutton(WebElement deletebutton) {
		this.deletebutton = deletebutton;
	}

}
