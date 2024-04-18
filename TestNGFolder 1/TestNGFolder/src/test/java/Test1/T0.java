package Test1;

import org.testng.annotations.Test;

public class T0 {
	// Here If we do not mention the priority the method will execute in a Alphabetical order
	@Test
	void f() {
	  System.out.println("A--1");
  	}
	@Test
  	void a() {
  	  System.out.println("B--2");
  	}
	void x() {
		System.out.println("I Will Not Exceute Because i have no @Test Annotation");
	}
	@Test
	void b() {
	  System.out.println("C--3");
	}
}
