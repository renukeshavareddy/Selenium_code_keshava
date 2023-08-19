package Module5;

import org.testng.annotations.Test;

public class testng_alwaysrun_depedendsonmethod {

	//hotel application scenario
	
	@Test (description="this is login test case") //test case
	public void loginTest() {   //failed case
		try {
			
			
			System.out.println("loginTest");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(alwaysRun = true,dependsOnMethods = {"loginTest"},description="this is search test case")  //dependent method is failed, next method is skipped
	public void searchTest() {  
		
		System.out.println("searchTest");
	}
	
	@Test (description="this is select test case")
	public void selectTest() {
		
		System.out.println("selectTest");
	}
	
}
