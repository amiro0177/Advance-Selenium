package com.tyss.crm.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	/**
	 * this method is for fetching particular row and cell data
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws Exception 
	 * @throws IOException
	 * @throws EncryptedDocumentException
	 * @throws Throwable
	 */

	
	
	
	
	// If you have any Issue with it, we can remove it
	public String fromExcel(String sheetname, int rownum,int cellnum) throws Exception {
		
		FileInputStream fis=new FileInputStream("/advanceSelenium/src/test/resources/Product_Data_100_plus.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		Sheet sheet=wb.getSheet("ProductData");
		
		int rowcount=sheet.getPhysicalNumberOfRows();
		for(int i=1;i<rowcount;i++) {
			String value=sheet.getRow(i).getCell(cellnum).getStringCellValue();
			 return value;
		}
		return sheetname;
		
	}
	
	
	
	
	
	
	
	// This cann't be remove
	public String readDataFromExcelSheet(String sheetName, int rowNum, int cellNum)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/TestScriptData.xlsx");

		Workbook workbook = WorkbookFactory.create(fis);

		Sheet sheet = workbook.getSheet(sheetName);
		String value = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
		return value;
	}

	/**
	 * This method is used to count the total row in the excel file
	 * 
	 * @param sheetName
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public int getTotalRowCount(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestScriptData.xlsx");

		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		return rowCount;

	}

	/**
	 * This method is used to write the data into Excel sheet
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public void writeDataIntoExcel(String sheetName, int rowNum, int cellNum, String Value)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/WriteData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.createSheet(sheetName);
		sheet.createRow(0).createCell(0).setCellValue(Value);

		FileOutputStream fos = new FileOutputStream("./src/test/resources/WriteData.xlsx");
		workbook.write(fos);
		workbook.close();
	}

	public HashMap<String, String> readMultipleData(String sheetName, int cellNo)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();

		HashMap<String, String> map = new HashMap<String, String>();
		for (int i = 0; i <= rowCount; i++) {
			String key = sheet.getRow(i).getCell(cellNo).getStringCellValue();
			String value = sheet.getRow(i).getCell(cellNo + 1).getStringCellValue();
			map.put(key, value);
		}
		return map;

	}
}
