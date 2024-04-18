package Practice;

import org.testng.annotations.*;

public class Parrell {
  
	@Test(priority=1)
	@Parameters("mm")
	void setup(String a) {
		System.out.println("Setting up :"+a);
	}
	@Test(priority=2)
	void login() {
		System.out.println("logging in....");
	}
	@Test(priority=3)
	void logout() {
		System.out.println("logging out....");
	}
	
}
