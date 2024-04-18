package Test2;

import org.testng.annotations.Test;

/*
 
 
 Day-35
-------
Annotations
----
@Test

@BeforeMethod
@AfterMethod

@BeforeClass
@AfterClass

@BeforeTest
@AfterTest

@BeforeSuite
@AfterSuite



Suite-->Tests--->Classes--->Methods

XML -- Tests----Classes--->Methods

TC1
----
1) Login - @BeforeMethod
2) Search  -   @Test
3) Logout - @AfterMethod
4) Login
5) Advanced search  -- @Test
6) Logout

TC1
----
1) Login - @BeforeClass
2) Search  - @Test
3) Advanced search  - @Test
4) Logout  - @AfterClass

Dependecy methods
----------


Assertions
----------
validations

Hard assertions
----
access though 'Assert' class
all methods are static
if hard assertion got failed then rest of the statement will not be executed.

Soft assertions
-----------
access through 'SoftAssert' object

SoftAssert sa=new SoftAssert();
sa.assertTrue()

if soft assertion got failed then rest of the statemetns still execute.
 
 */

public class T0 {
  
}
