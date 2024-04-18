package Test1;

import org.testng.annotations.Test;

/* 

 1)This is the default method in the TestNG Class
 2)In TestNG We Run The Test-cases without using the Main method (***)
 3)In java we have  Annotations we use that annotations in the testNg 	


*/
public class Introduction {
  @Test
  public void f() {
	  System.out.println("Hello I am FFF");
  }
  public void A() {
	  // Here if we do not mention the annotations that method is not exceuted
	  System.out.println("Hello I am AAA");
  }
}
