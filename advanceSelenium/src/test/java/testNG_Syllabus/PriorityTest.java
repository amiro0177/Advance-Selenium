package testNG_Syllabus;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority=1)
	public void createContactTest() {
		System.out.println("Create Contact with HDFC");
	}
	
	@Test(priority=2)
	public void modifyContactTest() {
		System.out.println("Modify Contact HDFC to ICICI");
	}
	
	@Test(priority=3)
	public void deleteContactTest() {
		System.out.println("Delete Contact Test -->ICICI");
	}
	
	/* Order of Execution with Priority.
	 * 1> createContactTtest
	 *  2> modifyContact
	 *  3> deleteContactTest
	 */
}
