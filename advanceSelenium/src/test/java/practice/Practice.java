package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0&scenario=1");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//table[@class='w-full text-sm text-left text-gray-500 h-64']/tbody/tr[1]/td[1]")).click();
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
	}

}
