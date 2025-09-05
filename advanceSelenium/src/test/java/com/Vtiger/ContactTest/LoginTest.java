package com.Vtiger.ContactTest;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Vtiger.ContactPage.LoginPage;

public class LoginTest {
	
	@SuppressWarnings("null")
	public static void main(String[] args) throws Exception {
	
		
		//WebDriver driver=null;
		
		FileInputStream fis=new FileInputStream("E:\\A8_QSPIDER SELENIUM LEARNING\\advanceSelenium_15-07-2025\\src\\test\\resources\\CommonData.properties");
		 	
		Properties prop=new Properties();
			prop.load(fis);
			
			String BROWSER=prop.getProperty("browser");
			String URL= prop.getProperty("url");
			String USERNAME=prop.getProperty("un");
			String PASSWORD=prop.getProperty("pwd");
		
			WebDriver driver=new ChromeDriver();
			 
			driver.get(URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			LoginPage lp=new LoginPage(driver);
				lp.login(USERNAME, PASSWORD);
				lp.getLoginbutton().click();
				
				
			
}

}
