package com.Vtiger.Crm.LeadModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadModulePage {

	public LeadModulePage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Leads']")
	private WebElement leadsModule;

	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement createLeadPlusSign;

	@FindBy(xpath = "//select[@name='salutationtype'] ")
	private WebElement firstNameDropDown;

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;

	@FindBy(name = "lastname")
	private WebElement lastName;

	@FindBy(name = "company")
	private WebElement company;

	@FindBy(name = "annualrevenue")
	private WebElement annualRevenue;

	@FindBy(name = "noofemployees")
	private WebElement noOfEmployee;

	@FindBy(name = "secondaryemail")
	private WebElement secondaryEmail;

	@FindBy(id = "mobile")
	private WebElement mobileNumber;

	@FindBy(xpath = "//td[@class='dvtCellInfo']//descendant::select[@name='leadstatus']")
	private WebElement leadStatus;

	@FindBy(xpath = "//input[@name='assigntype' and @value='T']")
	private WebElement groupCheckBox;

	@FindBy(xpath = "//span[@id='assign_team']//descendant::select[@name='assigned_group_id']")
	private WebElement assignedToGroupDropDown;

	@FindBy(xpath = "//input[@id='pobox']")
	private WebElement poBoxTextField;

	@FindBy(xpath = "//input[@id='code']")
	private WebElement postalCodeTextField;

	@FindBy(xpath = "//input[@id='city']")
	private WebElement cityTextField;

	@FindBy(id = "country")
	private WebElement country;

	@FindBy(id = "state")
	private WebElement state;

	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement description;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebutton;
	
	@FindBy(name="Edit")
	private WebElement edit;
	
	@FindBy(name="website")
	private WebElement website;
	
	@FindBy(xpath="//select[@class='small' and @name='rating']")
	private WebElement rating;
	
	@FindBy(name="button")
	private WebElement saveafteredit;

	// Getter Methods...

	public WebElement getLeadModule() {
		return leadsModule;
	}

	public WebElement getCreateLeadPlusSign() {
		return createLeadPlusSign;
	}

	public WebElement getFirstNameDropDown() {
		return firstNameDropDown;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getAnnualRevenue() {
		return annualRevenue;
	}

	public WebElement getNoOfEmployee() {
		return noOfEmployee;
	}

	public WebElement getSecondaryEmail() {
		return secondaryEmail;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getLeadStatus() {
		return leadStatus;
	}

	public WebElement getgroupCheckBox() {
		return groupCheckBox;
	}

	public WebElement getAssignedToGroupDropDown() {
		return assignedToGroupDropDown;
	}

	public WebElement getPoBoxTextField() {
		return poBoxTextField;
	}

	public WebElement getPostalCodeTextField() {
		return postalCodeTextField;
	}

	public WebElement getCityTextField() {
		return cityTextField;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}

	public WebElement getEdit() {
		return edit;
	}
	
	public WebElement getWebsite() {
		return website;
	}
	
	public WebElement getRating() {
		return rating;
	}
	
	public WebElement getSaveAfterEdit() {
		return saveafteredit;
	}
	// Setter

	public void setLeadsModule(WebElement leadsModule) {
		this.leadsModule = leadsModule;
	}

	public void setCreateLeadPlusSign(WebElement createLeadPlusSign) {
		this.createLeadPlusSign = createLeadPlusSign;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public void setCompany(WebElement company) {
		this.company = company;
	}

	public void setAnnualRevenue(WebElement annualRevenue) {
		this.annualRevenue = annualRevenue;
	}

	public void setNoOfEmployee(WebElement noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}

	public void setSecondaryEmail(WebElement secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}

	public void setMobileNumber(WebElement mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setLeadStatus(WebElement leadStatus) {
		this.leadStatus = leadStatus;
	}

	public void setGroupCheckBox(WebElement groupCheckBox) {
		this.groupCheckBox = groupCheckBox;
	}

	public void setAssignedToGroupDropDown(WebElement assignedToGroupDropDown) {
		this.assignedToGroupDropDown = assignedToGroupDropDown;
	}

	public void setPoBoxTextField(WebElement poBoxTextField) {
		this.poBoxTextField = poBoxTextField;
	}

	public void setPostalCodeTextField(WebElement postalCodeTextField) {
		this.postalCodeTextField = postalCodeTextField;
	}

	public void setCityTextField(WebElement cityTextField) {
		this.cityTextField = cityTextField;
	}

	public void setCountry(WebElement country) {
		this.country = country;
	}

	public void setState(WebElement state) {
		this.state = state;
	}

	public void setDescription(WebElement description) {
		this.description = description;
	}

	public void setSavebutton(WebElement savebutton) {
		this.savebutton = savebutton;
	}
	
	public void setEdit(WebElement edit) {
		this.edit=edit;
	}
	
	public void setWebsite(WebElement website) {
		this.website=website;
	}
	
	public void setRating(WebElement rating) {
		this.rating=rating;
	}
	
	public void setSaveAfterEdit(WebElement saveafteredit) {
		this.saveafteredit=saveafteredit;
	}

}
