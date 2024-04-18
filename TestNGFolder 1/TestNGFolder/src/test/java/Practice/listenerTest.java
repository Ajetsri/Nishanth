package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class listenerTest {
  @Test(priority=1)
  void test1() {
	  Assert.assertTrue(true);
  };
  @Test(priority=2)
  void test2() {
	  Assert.assertTrue(false);
  };
  @Test(priority=3,dependsOnMethods= {"test2"})
  void test3() {
	  Assert.assertTrue(true);
  };
}
