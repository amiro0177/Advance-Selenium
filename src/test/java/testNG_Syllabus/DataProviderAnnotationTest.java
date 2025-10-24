package testNG_Syllabus;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotationTest {

	@Test(dataProvider = "getData")
	public void employeeTest(String firstname, String lastname ) {
		System.out.println("Firstname:" + firstname + ",LastName:" + lastname  );
	}

	// Creating Table of 2-D Array because data Provider will accept only 2-D Array.
	@DataProvider
	public Object [][] getData() {
		
	Object [][] objarr=new Object[2][2]; //[First is Row][Second is Column]
	objarr[0][0]="Ram";
	objarr[0][1]="God";
	objarr[1][0]="Sita";
	objarr[1][1]="Goddess";
	 

	return objarr;

}
}
