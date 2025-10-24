package com.Vtiger.Crm.LeadModule;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.tyss.crm.GenaricUtility.BaseClass;

public class LeadModuleTest<WorkBook> extends BaseClass {

	@Test()
	public void leadTest() throws Exception {

		LeadModulePage lmp1 = new LeadModulePage(driver);
		lmp1.getLeadModule().click();

		Thread.sleep(1000);

		LeadModulePage lmp2 = new LeadModulePage(driver);
		lmp2.getCreateLeadPlusSign().click();

		Thread.sleep(1000);

		LeadModulePage lmp3 = new LeadModulePage(driver);
		lmp3.getFirstNameDropDown().click();

		Select sel = new Select(lmp3.getFirstNameDropDown());
		sel.selectByValue("Mr.");

		Thread.sleep(1000);

		LeadModulePage lmp4 = new LeadModulePage(driver);
		lmp4.getFirstName().sendKeys("Amit");

		Thread.sleep(1000);

		// For Generating Last Name...

		LeadModulePage lmp5 = new LeadModulePage(driver);
		String leadlastname = "Roy_" + javaUtil.randonNumber();

		lmp5.getLastName().sendKeys(leadlastname);

		// for Write user name to excel...

		FileOutputStream fos = new FileOutputStream("./src/test/resources/GeneratedUserNameData.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook();

		XSSFSheet sheet = wb.createSheet("GeneratedUserNameData");
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue(leadlastname);

		fos.close();
		wb.close();

		Thread.sleep(1000);

		LeadModulePage lmp6 = new LeadModulePage(driver);
		lmp6.getCompany().sendKeys("Test Yantra");

		LeadModulePage lmp7 = new LeadModulePage(driver);
		lmp7.getAnnualRevenue().clear();
		Thread.sleep(1000);
		lmp7.getAnnualRevenue().sendKeys("123456");

		Thread.sleep(1000);

		LeadModulePage lmp8 = new LeadModulePage(driver);
		lmp8.getNoOfEmployee().sendKeys("200");

		Thread.sleep(1000);

		LeadModulePage lmp9 = new LeadModulePage(driver);
		lmp9.getSecondaryEmail().sendKeys("TestYantra_" + javaUtil.randonNumber() + "@testing.com");

		Thread.sleep(1000);

		LeadModulePage lmp10 = new LeadModulePage(driver);
		lmp10.getMobileNumber().sendKeys("0987654321");

		Thread.sleep(1000);

		LeadModulePage lmp11 = new LeadModulePage(driver);
		lmp11.getLeadStatus().click();
		Thread.sleep(1000);
		Select s1 = new Select(lmp11.getLeadStatus());
		s1.selectByValue("Contact in Future");

		Thread.sleep(1000);

		LeadModulePage lmp12 = new LeadModulePage(driver);
		lmp12.getgroupCheckBox().click();

		Thread.sleep(1000);

		LeadModulePage lmp13 = new LeadModulePage(driver);
		lmp13.getAssignedToGroupDropDown().click();
		Thread.sleep(1000);

		Select s3 = new Select(lmp13.getAssignedToGroupDropDown());
		s3.selectByValue("4");

		Thread.sleep(1000);

		LeadModulePage lmp14 = new LeadModulePage(driver);
		lmp14.getPoBoxTextField().sendKeys("Noida");

		Thread.sleep(1000);
		LeadModulePage lmp15 = new LeadModulePage(driver);
		lmp15.getPostalCodeTextField().sendKeys("123456");

		Thread.sleep(1000);

		LeadModulePage lmp16 = new LeadModulePage(driver);
		lmp16.getCityTextField().sendKeys("Noida");

		Thread.sleep(1000);

		LeadModulePage lmp17 = new LeadModulePage(driver);
		lmp17.getCountry().sendKeys("India");
		Thread.sleep(1000);

		LeadModulePage lmp18 = new LeadModulePage(driver);
		lmp18.getState().sendKeys("Uttar Pradesh");
		Thread.sleep(1000);

		LeadModulePage lmp19 = new LeadModulePage(driver);
		lmp19.getDescription().sendKeys("Hello ! This is regarding the testing Purpose");
		Thread.sleep(1000);

		LeadModulePage lmp20 = new LeadModulePage(driver);
		lmp20.getSavebutton().click();

		Thread.sleep(2000);

		LeadModulePage lmp21 = new LeadModulePage(driver);
		lmp21.getEdit().click();

		Thread.sleep(1000);

		LeadModulePage lmp22 = new LeadModulePage(driver);
		lmp22.getWebsite().sendKeys("https://testyantra.com/");

		Thread.sleep(1000);

		LeadModulePage lmp23 = new LeadModulePage(driver);
		lmp23.getRating().click();

		Thread.sleep(1000);

		Select s4 = new Select(lmp23.getRating());
		s4.selectByValue("Active");

		Thread.sleep(1000);

		LeadModulePage lmp24 = new LeadModulePage(driver);
		lmp24.getSaveAfterEdit().click();

		System.out.println("If you receiving the statement that means you test script will complete");

		// Thread.sleep(3000);

	}

}
