package testNG_Syllabus;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount = 10)
	public void createOrderTest() {
		System.out.println("Order has been Created");
	}

	@Test(enabled = false) // Enabled is By Default "TRUE".
	public void billingOrderTest() {
		System.out.println("Billing is ready for the Order");
	}
}
