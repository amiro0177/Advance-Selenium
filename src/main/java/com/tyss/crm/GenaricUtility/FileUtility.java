package com.tyss.crm.GenaricUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class FileUtility {
	
	@Test
	public String readDataFromPropertiesFile(String key) throws IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
	
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
		
		 
		 
	
 	}

}
