package com.Vtiger.Document;

 
import java.util.Random;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Crm.Vtiger.Documents.DocumentsPage;
import com.tyss.crm.GenericUtility.BaseClass;

public class DocumentsTest extends BaseClass {
	
	@Test
	public void documentTest() throws Throwable {
		
		Random r=new Random();
		int random=r.nextInt(100);
		
		DocumentsPage dp1=new DocumentsPage(driver);
		dp1.getDocuments().click();
		
		Thread.sleep(1000);
		
		DocumentsPage dp2=new DocumentsPage(driver);
		dp2.getPlussign().click();
		
		Thread.sleep(1000);
		
		DocumentsPage dp3=new DocumentsPage(driver);
		dp3.getTitle().sendKeys("Amit_"+random);
		
		Thread.sleep(1000);
		
		DocumentsPage dp4=new DocumentsPage(driver);
		dp4.getAssignedToGroup().click();
		
		Thread.sleep(1000);
 		
		DocumentsPage dp5=new DocumentsPage(driver);
		dp5.getAssignedToDropDown().click();
		Thread.sleep(1000);
		
		Select s1=new Select(dp5.getAssignedToDropDown());
		s1.selectByValue("6");
		
		DocumentsPage dp6=new DocumentsPage(driver);
		driver.switchTo().frame(0);
		dp6.getDescription().sendKeys("Test");
		
		Thread.sleep(1000);
		
		DocumentsPage dp7=new DocumentsPage(driver);
		dp7.getDownloadType().click();
		Thread.sleep(1000);
		 Select s2=new Select(dp7.getDownloadType());	
		 s2.selectByValue("E");
		 
		 Thread.sleep(1000);
		 
		 DocumentsPage dp8=new DocumentsPage(driver);
		 dp8.getSave().click();
		
		
		 
		
	}

}
