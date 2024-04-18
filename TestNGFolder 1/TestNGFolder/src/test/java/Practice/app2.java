package Practice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class app2 {
 
  @Test
  void AdvSearch() {
	  System.out.println("C");
  }
  @AfterSuite
  void logout() {
	  System.out.println("D");
  }
}
