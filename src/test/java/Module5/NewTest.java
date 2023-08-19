package Module5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	
  @Test
  public void f() {
	  
	  System.out.println("this is testcase");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("this is beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is afterClass");
	  
  }

}
