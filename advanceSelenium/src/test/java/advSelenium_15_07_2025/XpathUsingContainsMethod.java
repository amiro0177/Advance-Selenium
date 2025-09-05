package advSelenium_15_07_2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingContainsMethod 
{
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE' and @name='q' ]"));
			search.sendKeys("Iphone"+Keys.ENTER);
			
			WebElement AppleIPhone16White128GB = driver.findElement(By.xpath("//div[@class='yKfJKb row' and contains(.,'Apple iPhone 16 (White, 128 GB)')]//div[@class='Nx9bqj _4b5DiR']"));
			AppleIPhone16White128GB.click();
			
	*/
		
		driver.get("https://www.flipkart.com/"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		  search.sendKeys("Iphone" +Keys.ENTER);
		  
		  WebElement AppleIPhone15128GBBlack = driver.findElement(By.xpath("//div[@class='puisg-col-inner' and contains(., 'Apple iPhone 15 (128 GB) - Black') and contains(., 'Sponsored')]"));
		  AppleIPhone15128GBBlack.click();
		  System.out.println(AppleIPhone15128GBBlack.getText());
		  
		 // WebElement boysfootwear = driver.findElement(By.xpath("//a[@class='jBYtJt cNDIdi CP4tVY' and contains(., \"Boys' Footwear\")]"));
		  //boysfootwear.click();
	}
	

}
