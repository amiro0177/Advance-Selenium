package testNG_Syllabus;

import org.testng.annotations.Test;

public class DependsOnMethodTest {

	@Test
	public void createContactTtest() {
		System.out.println("Create Contact-->HDFC");
	}
	
	@Test(dependsOnMethods="createContactTtest")
	public void modifyContact() {
		System.out.println("Modify Contact from HDFC to ICICI");
	}
	@Test(dependsOnMethods="modifyContact")
	public void deleteContactTest() {
		System.out.println("Delete Contact ICICI, which is modified from HDFC to ICICI");
	}
	
	/* Order of Execution with Depends On Methods
	 * 1> createContactTtest
	 *  2> modifyContact
	 *  3> deleteContactTest
	 */
	
}
