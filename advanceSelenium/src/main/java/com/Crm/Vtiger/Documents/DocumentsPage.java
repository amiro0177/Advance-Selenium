package com.Crm.Vtiger.Documents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentsPage {
	WebDriver driver;
	
	public DocumentsPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this); 
		
	}
		@FindBy(xpath="//td[@class='tabUnSelected']//descendant::a[text()='Documents']") 
		private WebElement documents;
		
		@FindBy(xpath="//img[@title='Create Document...']")
		private WebElement plussign;
		
		@FindBy(xpath="//input[@name='notes_title']")
		private WebElement title;
		
		@FindBy(xpath="//td[@class='dvtCellInfo']//descendant::input[@value='T']")
		private WebElement assignedtogroup;
		
		@FindBy(xpath="//td[@class='dvtCellInfo']//descendant::select[@name='assigned_user_id']")
		private WebElement assignedtodropdown;
		
		@FindBy(xpath="//html[@dir='ltr']")
		private WebElement description;
		
		@FindBy(xpath="//select[@name='filelocationtype']")
		private WebElement downloadtype;
		
		@FindBy(xpath="//input[@title='Save [Alt+S]'][1]")
		private WebElement save;
		
		
		// GETTER
		
		public WebElement getDocuments() {
			return documents;
		}
		public WebElement getPlussign() {
			return plussign;
		}
		public WebElement getTitle() {
			return title;
		}
		public WebElement getAssignedToGroup() {
			return assignedtogroup;
		}
		public WebElement getAssignedToDropDown() {
			return assignedtodropdown;
		}
		public WebElement getDescription() {
			return description;
		}
		public WebElement getDownloadType() {
			return downloadtype;
		}
		public WebElement getSave() {
			return save;
		}
		
		// SETTER
		
		public void setDocuments(WebElement documents) {
			this.documents=documents;
		}
		public void setPlussign(WebElement plussign) {
			this.plussign=plussign;
		}
		public void setTitle(WebElement title) {
			this.title=title;
		}
		public void setAssignedToGroup(WebElement assignedtogroup) {
			this.assignedtogroup=assignedtogroup;
		}
		public void setAssignedToDropDown(WebElement assignedtodropdown) {
			this.assignedtodropdown=assignedtodropdown;
		}
		public void setDescription(WebElement description) {
			this.description=description;
		}
		public void setDownloadType(WebElement downloadtype) {
			this.downloadtype=downloadtype;
		}
		public void setSave(WebElement save) {
			this.save=save;
		}
		
	}


