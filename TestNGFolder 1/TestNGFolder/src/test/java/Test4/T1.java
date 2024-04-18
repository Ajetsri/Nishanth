package Test4;

import org.testng.annotations.Test;

public class T1 {
	// InvocationCountDemo
	@Test(invocationCount=10)
	void test()
	{
	System.out.println("testing...");	
	}
}
