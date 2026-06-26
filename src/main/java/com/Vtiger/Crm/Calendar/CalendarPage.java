package com.Vtiger.Crm.Calendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {
	
	public CalendarPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="//td[@class='tabSelected']")
			private WebElement homeButton;
	
	@FindBy(xpath="//td[@class='small' ]//descendant::td[@class='tabUnSelected' and contains(., 'Calendar')]")
			private WebElement calendar;
	
	@FindBy(xpath="//table[@class='small']//descendant:: td[@class='dvtUnSelectedCell' and contains(., 'All Events & Todos')]")
			private WebElement AllEventsTodos;
	
	@FindBy(xpath="//table[@class='searchUIBasic small']//descendant::input[@name='search_text']")
			WebElement searchBox;
	
	@FindBy(xpath="//div[@id='basicsearchcolumns_real']//descendant:: select[@name='search_field']")
			private WebElement InDropDown;
	 

}
