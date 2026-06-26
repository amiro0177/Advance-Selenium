package amazonDatadDrivenTest;

import org.testng.annotations.Test;

import com.tyss.crm.GenericUtility.BaseClass;

import amazonDataDrivenTesting.AmazonDataDrivenPage;

public class AmazonDataDrivenTest extends BaseClass {
	
	
	@Test
	public void amazonDataDrivenTest() throws Exception {
		
		AmazonDataDrivenPage addp=new AmazonDataDrivenPage();
		addp.getSearch().click();
		
	}

}
