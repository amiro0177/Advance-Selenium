package com.Vtiger.CreateOpportunitiesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOpportunitiesPage {

	WebDriver driver;

	public CreateOpportunitiesPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[@class='tabUnSelected' and contains(., 'Opportunities')]")
	private WebElement opportunitiesmodule;

	@FindBy(xpath = "//img[@title='Create Opportunity...']")
	private WebElement createnewopportunities;

	@FindBy(xpath = "//input[@name='potentialname']")
	private WebElement opportunityname;

	@FindBy(xpath = "//select[@id='related_to_type']")
	private WebElement relatedtodropdown;

	// Related to text Field Plus Sign only click performed.
	@FindBy(xpath = "//img[@alt='Select' and @title='Select']")
	private WebElement relatedtoaddicon;

	// group chosen
	@FindBy(xpath = "//input[@name='assigntype' and @value='T']")
	private WebElement groupoption;

	@FindBy(xpath = "//span[@id='assign_team']//descendant::select[@name='assigned_group_id']")
	private WebElement assignedTogroupdropdown;

	@FindBy(xpath = "//span[@id='assign_user']")
	private WebElement createopportunitydropdown;

	@FindBy(xpath = "//img[@id='jscal_trigger_closingdate']")
	private WebElement expectedclosedate;

	@FindBy(xpath = "//tr[@class='daysrow']//td[@class='day selected' and contains(., '31')]")
	private WebElement chosendate;

	@FindBy(xpath = "//td[@class='dvtCellInfo' ] //descendant::select[@name='sales_stage']")
	private WebElement salesstagedropdown;

	@FindBy(xpath = "//input[@title='Save [Alt+S]' and @value='  Save  ' and @type='submit' and @accesskey='S']")
	private WebElement save;

	// Getter
	public WebElement getOpportunitiesmodule() {
		return opportunitiesmodule;
	}

	public WebElement getCreatenewopportunities() {
		return createnewopportunities;
	}

	public WebElement getOpportunityname() {
		return opportunityname;
	}

	public WebElement getRelatedtodropdown() {
		return relatedtodropdown;
	}

	public WebElement getrelatedtoaddicon() {
		return relatedtoaddicon;
	}

	public WebElement getGroupOption() {
		return groupoption;
	}

	public WebElement getCreateopportunityGroupdropdown() {
		return assignedTogroupdropdown;
	}

	public WebElement getexpectedclosedate() {
		return expectedclosedate;
	}

	public WebElement getchosendate() {
		return chosendate;
	}

	public WebElement getSalesstagedropdown() {
		return salesstagedropdown;
	}

	public WebElement getSave() {
		return save;
	}

	// Setter
	public void setOpportunitiesmodule(WebElement opportunitiesmodule) {
		this.opportunitiesmodule = opportunitiesmodule;
	}

	public void setCreatenewopportunities(WebElement createnewopportunities) {
		this.createnewopportunities = createnewopportunities;
	}

	public void setOpportunityname(WebElement opportunityname) {
		this.opportunityname = opportunityname;
	}

	public void setRelatedtodropdown(WebElement relatedtodropdown) {
		this.relatedtodropdown = relatedtodropdown;
	}

	public void setrelatedtoaddicon(WebElement relatedtoaddicon) {
		this.relatedtoaddicon = relatedtoaddicon;
	}

	public void setUseroption(WebElement groupoption) {
		this.groupoption = groupoption;
	}

	public WebElement getAssignedToGroupDropdown() {
		return assignedTogroupdropdown;
	}

	public void setAssignedToGroupdropdown(WebElement assignedTodropdown) {
		this.assignedTogroupdropdown = assignedTodropdown;
	}

	public void setGroupoption(WebElement groupoption) {
		this.groupoption = groupoption;
	}

	public void setCreateopportunitydropdown(WebElement createopportunitydropdown) {
		this.createopportunitydropdown = createopportunitydropdown;
	}

	public void setexpectedclosedate(WebElement expectedclosedate) {
		this.expectedclosedate = expectedclosedate;
	}

	public void setchosendate(WebElement chosendate2) {
		this.chosendate = chosendate2;
	}

	public void setSalesstagedropdown(WebElement salesstagedropdown) {
		this.salesstagedropdown = salesstagedropdown;
	}

	public void setSave(WebElement save) {
		this.save = save;
	}

	public CreateOpportunitiesPage setchosendate(String chosendate2) {
		// TODO Auto-generated method stub
		return null;
	}

}
