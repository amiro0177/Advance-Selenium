package com.Vtiger.Crm.TroubleTickets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TroubleTicketsPage {

	public TroubleTicketsPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//td[@class='tabUnSelected' and contains(., 'Trouble Tickets')]")
	private WebElement troubleTickets;

	@FindBy(xpath = "//img[@title='Create Ticket...']")
	private WebElement createTicketPlussign;

	@FindBy(name = "ticket_title")
	private WebElement title;

	@FindBy(xpath = "//td[@class='dvtCellInfo']//descendant::input[@value='T']")
	private WebElement assignedToGroup;

	@FindBy(name = "assigned_group_id")
	private WebElement assignedToGroupDropDown;

	@FindBy(name = "ticketpriorities")
	private WebElement PrioritiesDropDown;

	@FindBy(name = "ticketseverities")
	private WebElement severitiesDropDown;

	@FindBy(name = "ticketcategories")
	private WebElement categoriesDropdown;

	@FindBy(name = "ticketstatus")
	private WebElement statusDropDown;

	@FindBy(name = "description")
	private WebElement descriptions;

	@FindBy(name = "button")
	private WebElement saveButton;
	
	



	// Getter

	public WebElement getTroubleTickets() {
		return troubleTickets;
	}

	public WebElement getCreateTicketPlussign() {
		return createTicketPlussign;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getAssignedToGroup() {
		return assignedToGroup;
	}

	public WebElement getAssignedToGroupDropDown() {
		return assignedToGroupDropDown;
	}

	public WebElement getPrioritiesDropDown() {
		return PrioritiesDropDown;
	}

	public WebElement getSeveritiesDropDown() {
		return severitiesDropDown;
	}

	public WebElement getCategoriesDropdown() {
		return categoriesDropdown;
	}

	public WebElement getStatusDropDown() {
		return statusDropDown;
	}

	public WebElement getDescriptions() {
		return descriptions;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	// Setter
	public void setTroubleTickets(WebElement troubleTickets) {
		this.troubleTickets = troubleTickets;
	}

	public void setCreateTicketPlussign(WebElement createTicketPlussign) {
		this.createTicketPlussign = createTicketPlussign;
	}

	public void setTitle(WebElement title) {
		this.title = title;
	}

	public void setAssignedToGroup(WebElement assignedToGroup) {
		this.assignedToGroup = assignedToGroup;
	}

	public void setAssignedToGroupDropDown(WebElement assignedToGroupDropDown) {
		this.assignedToGroupDropDown = assignedToGroupDropDown;
	}

	public void setPrioritiesDropDown(WebElement prioritiesDropDown) {
		PrioritiesDropDown = prioritiesDropDown;
	}

	public void setSeveritiesDropDown(WebElement severitiesDropDown) {
		this.severitiesDropDown = severitiesDropDown;
	}

	public void setCategoriesDropdown(WebElement categoriesDropdown) {
		this.categoriesDropdown = categoriesDropdown;
	}

	public void setStatusDropDown(WebElement statusDropDown) {
		this.statusDropDown = statusDropDown;
	}

	public void setDescriptions(WebElement descriptions) {
		this.descriptions = descriptions;
	}

	public void setSaveButton(WebElement saveButton) {
		this.saveButton = saveButton;
	}

}
