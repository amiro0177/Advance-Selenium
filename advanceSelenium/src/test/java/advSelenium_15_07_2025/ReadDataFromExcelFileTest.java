package advSelenium_15_07_2025;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelFileTest {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestScriptData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		System.out.println(wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue());
	}

}
