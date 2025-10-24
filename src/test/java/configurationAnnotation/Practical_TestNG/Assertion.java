package configurationAnnotation.Practical_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	@Test
	public void sel() {

		String s1 = "Testing";
		String s2 = "Selenium";

		/*
		 * if(s1.equals(s2)) { System.out.println("Test is Passed");
		 * 
		 * }
		 * 
		 * else { System.out.println("Test is Failed");
		 * 
		 * }
		 */

		  Assert.assertEquals(s1, s1);
		 Assert.assertNotEquals(s1, s2);
		
	 Assert.assertNotEquals(123,12121);
	 Assert.assertTrue(false); //failed
	 Assert.assertFalse(true); //failed
	 Assert.assertTrue(true); //Passed
     Assert.assertFalse(false); //Passed
		
	 Assert.assertTrue(1==2);
	 Assert.assertFalse(1==2);
	 Assert.assertEquals("Ami", 123);
		
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(s1, s2);
			sf.assertAll();
		

	}

}
