package com.Vtiger.Crm.TroubleTickets;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.tyss.crm.GenaricUtility.BaseClass;

public class TroubleTicketsTest extends BaseClass {

	@Test
	public void troubleTicketsTest() throws Exception {

		TroubleTicketsPage ttp1 = new TroubleTicketsPage(driver);
		driver.navigate().refresh();
		Thread.sleep(1000);
		ttp1.getTroubleTickets().click();
		System.out.println("Hello Thanks for choosing Trouble Ticketing module");

		Thread.sleep(1000);

		TroubleTicketsPage ttp2 = new TroubleTicketsPage(driver);
		ttp2.getCreateTicketPlussign().click();
		System.out.println("Hello, you have Clicked on Create Ticket plus sign.");

		Thread.sleep(1000);

		TroubleTicketsPage ttp3 = new TroubleTicketsPage(driver);
		ttp3.getTitle().sendKeys("Automation TroubleTicketsPage.....");
		System.out.println("Title Text Field has been Filled");

		Thread.sleep(1000);

		TroubleTicketsPage ttp4 = new TroubleTicketsPage(driver);
		ttp4.getAssignedToGroup().click();
		System.out.println("Clicked on Assigned to Group Radio button  ");

		Thread.sleep(1000);

		TroubleTicketsPage ttp5 = new TroubleTicketsPage(driver);
		ttp5.getAssignedToGroupDropDown().click();
		Thread.sleep(1000);
		Select sel1 = new Select(ttp5.getAssignedToGroupDropDown());
		sel1.selectByValue("4");
		System.out.println("Group Radio BUtton has bee Clicked.");

		Thread.sleep(1000);

		TroubleTicketsPage ttp6 = new TroubleTicketsPage(driver);
		ttp6.getPrioritiesDropDown().click();
		Thread.sleep(1000);
		Select sel2 = new Select(ttp6.getPrioritiesDropDown());
		sel2.selectByValue("High");
		System.out.println("Priority Drop Down has been Selected.");

		Thread.sleep(1000);

		TroubleTicketsPage ttp7 = new TroubleTicketsPage(driver);
		ttp7.getSeveritiesDropDown().click();
		Thread.sleep(1000);
		Select sel3 = new Select(ttp7.getSeveritiesDropDown());
		sel3.selectByValue("Critical");
		System.out.println("Severity Drop Down has been Selected.");

		Thread.sleep(1000);

		TroubleTicketsPage ttp8 = new TroubleTicketsPage(driver);
		ttp8.getCategoriesDropdown().click();
		Thread.sleep(1000);
		Select sel4 = new Select(ttp8.getCategoriesDropdown());
		sel4.selectByValue("Small Problem");
		System.out.println("Categorise Drop Down has been Selected.");

		Thread.sleep(1000);

		TroubleTicketsPage ttp9 = new TroubleTicketsPage(driver);
		ttp9.getStatusDropDown().click();
		Thread.sleep(1000);
		Select sel5 = new Select(ttp9.getStatusDropDown());
		sel5.selectByValue("Wait For Response");
		System.out.println("Status Drop Down has been Selected");

		Thread.sleep(1000);

		TroubleTicketsPage ttp10 = new TroubleTicketsPage(driver);
		ttp10.getDescriptions().sendKeys("Hello ! This is regarding Testing purpose.");
		System.out.println(" Description Text Field is Filled.");

		Thread.sleep(1000);

		TroubleTicketsPage ttp11 = new TroubleTicketsPage(driver);
		ttp11.getSaveButton().click();
		System.out.println("You have Clicked on Saved Button.");

		Thread.sleep(3000);

		System.out.println("If you getting this it means All Filed has been Tested as per Requirement.");

	}

	// Second Test Cases for Confirm Trouble Tickets
	@Test
	public void confirmTroubleTickets() {

	}

}
