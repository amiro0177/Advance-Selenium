package testNG_Syllabus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchProduct {

	@Test
	public void getProductDetails() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Search Product.
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Iphone 15 pro",Keys.ENTER);
		Thread.sleep(2000);
		 
		String bxpath="//div[@class='col col-7-12' and contains(., 'Apple iPhone 15 Pro (Natural Titanium, 512 GB)')]";
		String pxpath="//div[@class='tUxRFH']//descendant::div[@class='Nx9bqj _4b5DiR']";
		String pricexpath=driver.findElement(By.xpath(pxpath)).getText();
		System.out.println(pricexpath);
		String brandname=driver.findElement(By.xpath(bxpath)).getText();
		System.out.println(brandname);
		
		driver.close();		
	}
	
	  
	
}
