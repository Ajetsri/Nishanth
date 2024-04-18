package Practice;

import org.testng.annotations.*;

public class app1 {
	
	@Test(priority = 3,groups= {"sanity","regression"})
	void loginEmail() {
		System.out.println("Email Login ...");
	}
	@Test(priority = 3,groups= {"regression"})
	void loginFaceBook() {
		System.out.println("FaceBook Login ...");
	}
	@Test(priority = 3,groups= {"sanity"})
	void loginTwitter() {
		System.out.println("Twitter Login ...");
	}
}
