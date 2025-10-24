package configurationAnnotation.Practical_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo {

	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Execute Before Suit");
	}
	
 
	@BeforeClass
	public void beforeClass() {
		System.out.println("Execute Before Class");
	}
 
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Execute Before Method");
	}
	
	
	@Test
	public void createContactTest() {
		System.out.println("Execute Create Contact");
	}
	
	@Test
	public void createContactTest1() {
		System.out.println("Execute create ContactTest 2");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Execute After Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Execute After Class");
	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("Execute After Suit");
	}
	
}
