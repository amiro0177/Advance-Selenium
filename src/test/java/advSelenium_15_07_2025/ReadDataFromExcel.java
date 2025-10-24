package advSelenium_15_07_2025;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ReadDataFromExcel 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream("E:\\A8_QSPIDER SELENIUM LEARNING\\advanceSelenium_15-07-2025\\src\\test\\resources\\TestScriptData.xlsx");
		
		
		 Workbook wb=WorkbookFactory.create(fis);
		 
		 	Sheet sheetname=wb.getSheet("Emp");
		 	System.out.println(wb.getSheet("Emp").getRow(1).getCell(3).getStringCellValue());
		 	//Row row=wb.getRow(2);
		 	//Cell cell=wb.getCell(2);
		 	//Sheet sheet=wb.getSheet(null)
		
	}

}
