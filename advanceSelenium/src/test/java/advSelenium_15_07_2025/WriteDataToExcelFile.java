package advSelenium_15_07_2025;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcelFile 
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos=new FileOutputStream("E:\\A8_QSPIDER SELENIUM LEARNING\\advanceSelenium_15-07-2025\\src\\test\\resources\\WriteData.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook();
		
		XSSFSheet sheet=wb.createSheet("Employee");
		XSSFRow row1=sheet.createRow(0);
					row1.createCell(0).setCellValue("JAVA");
						row1.createCell(1).setCellValue("JAVA");
							row1.createCell(2).setCellValue("JAVA");
								row1.createCell(3).setCellValue("JAVA");
	    XSSFRow row2=sheet.createRow(1);
	    		row2.createCell(0).setCellValue("SELENIUM");
	    			row2.createCell(1).setCellValue("SELENIUM");
	    				row2.createCell(2).setCellValue("SELENIUM");
	    					row2.createCell(3).setCellValue("SELENIUM");
	    					
		XSSFRow row3=sheet.createRow(2);
					row3.createCell(0).setCellValue("MANUAL");
						row3.createCell(1).setCellValue("MANUAL");
							row3.createCell(2).setCellValue("MANUAL");
								row3.createCell(3).setCellValue("MANUAL");
	            
	            wb.write(fos);
	            wb.close();
	            fos.close();
	            
	            
	            
	            System.out.println("Excel is createad");
				
				
	
	
	
	
	
	
	}

}
