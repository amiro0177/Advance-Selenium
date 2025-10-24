package com.Vtiger.Crm.LeadModule_Confirm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.tyss.crm.GenaricUtility.BaseClass;

public class LeadModuleConfirmTest extends BaseClass {

	@Test
	public void LeadConfirmTest() throws Exception {

		LeadModuleConfirmPage lmcp1 = new LeadModuleConfirmPage(driver);
		Thread.sleep(1000);
		lmcp1.getLeadsmodule().click();

		Thread.sleep(1000);

		LeadModuleConfirmPage lmcp2 = new LeadModuleConfirmPage(driver);
		lmcp2.getSearch().sendKeys("Roy_1233");
		Thread.sleep(1000);

		LeadModuleConfirmPage lmcp3 = new LeadModuleConfirmPage(driver);
		lmcp3.getSearchdropdown().click();

		Thread.sleep(1000);

		Select sel1 = new Select(lmcp3.getSearchdropdown());
		sel1.selectByVisibleText("Last Name");

		Thread.sleep(1000);

		LeadModuleConfirmPage lmcp4 = new LeadModuleConfirmPage(driver);
		lmcp4.getSearchnowbutton().click();

		Thread.sleep(1000);

		LeadModuleConfirmPage lmcp5 = new LeadModuleConfirmPage(driver);
		lmcp5.getSelectsearchresultcheckbox().click();
		
		//LeadModuleConfirmPage lmcp6=new LeadModuleConfirmPage(driver);
		//lmcp6.getDeletebutton();
		
		
		

	}

}
