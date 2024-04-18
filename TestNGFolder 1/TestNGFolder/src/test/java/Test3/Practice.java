package Test3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practice {
	@Test(dataProvider = "app")
	public void get(String a) {
		System.out.println(a);
	}
	@DataProvider(name="app")
	String[] set() {
		String []x={"lp","opp"};
		return x;
	}
}
