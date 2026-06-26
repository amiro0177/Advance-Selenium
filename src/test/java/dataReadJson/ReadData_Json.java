package dataReadJson;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadData_Json {
	
	@Test(dataProvider="excel")
	public void amazonPage(String productname, String brandname) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("nav-hamburger-menu")));
//		 
 
		
		
		
		WebElement all=driver.findElement(By.id("nav-hamburger-menu"));
		all.click();
		
		WebElement user=driver.findElement(By.id("hmenu-customer-profile"));
		user.click();
		
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.amazon.in/");
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.clear();
		search.sendKeys(productname,brandname);
		
		Thread.sleep(2000);
		driver.close();
	}
	
	
	@DataProvider(name="excel")
	public Object[][] jsonFunction() throws Exception{
		
		FileInputStream fis=new FileInputStream("C:\\Users/ravir/OneDrive/Desktop/Product_Data_100_plus.xlsx/");
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet=wb.getSheet("ProductData");
		
		int rows=sheet.getPhysicalNumberOfRows();
		int cols=sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] data=new Object[rows-1][cols];
		 for(int i=1;i<rows;i++) {
			 for(int j=0;j<cols;j++) {
				 data[i-1][j]=sheet.getRow(i).getCell(j);
				
			}
			
		}
		wb.close();
		fis.close();
		return data;
	}

}
