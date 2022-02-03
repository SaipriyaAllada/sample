package TestNgpkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNgC2 {
  @Test
  public void TestMethod() {
	  
	  System.out.println("Class2 Test method");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Class2 Before Test");
  }
  
  

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("Class2 After Test");
  }

}
