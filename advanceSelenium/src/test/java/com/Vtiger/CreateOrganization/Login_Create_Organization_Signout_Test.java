package com.Vtiger.CreateOrganization;

import org.testng.annotations.Test;

import com.Vtiger.Login_CreateOrg_logout.CreateOrganizationPage;
import com.Vtiger.Login_CreateOrg_logout.HomePage;
import com.Vtiger.Login_CreateOrg_logout.OrganizationPage;
import com.tyss.crm.GenaricUtility.BaseClass;

public class Login_Create_Organization_Signout_Test extends BaseClass {

 

	@Test
	public void createOrgTest() throws Throwable {	

		System.out.println("SuccessFul Login !!!");

		Thread.sleep(2000);

		// Create Object of HomePage....
		HomePage hp = new HomePage(driver);
		hp.contactLink.click();
		hp.orgLink.click();
		Thread.sleep(2000);

		// click on Organization Module
		OrganizationPage op = new OrganizationPage(driver);
		op.clickOnOrganizationButton();

		Thread.sleep(2000);
		// click on Create Organization Module

		int ran = javaUtil.randonNumber();
		String orgname = "Test_Yantra" + ran;
		String assignuser = "Bill_Gate";
		CreateOrganizationPage co = new CreateOrganizationPage(driver);
		co.createOrganization(orgname, assignuser);

		Thread.sleep(2000);

		// for Validation
		CreateOrganizationPage co1 = new CreateOrganizationPage(driver);
		String actualorg = co1.getConfirmOrganization().getText();

		if (actualorg.contains(orgname)) {
			System.out.println("Created");
		}

		Thread.sleep(2000);

	}
}
