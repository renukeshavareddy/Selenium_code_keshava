package Module5;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class understandTest {
	
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("this is before class method....");
		
	}
	
	
	@Test(priority=1) //test case
	public void zxy() {
		
		System.out.println("this is zxy method...");
		
	}
	
	
	@Test(priority=2)
	public void xyz() {
		
		
		//int i=10/0;
		//System.out.println(i);
		
		System.out.println("this is xyz method...");
		
	}
	
	@Test(priority=3)
	public void abc() {
		
		System.out.println("this is abc method...");
		
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("this is after class method....");
	}

}
