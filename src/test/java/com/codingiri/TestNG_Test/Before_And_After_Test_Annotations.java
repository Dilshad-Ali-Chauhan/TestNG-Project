package com.codingiri.TestNG_Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.fail;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterTest;

public class Before_And_After_Test_Annotations {

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method executed");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method executed");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class executed");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class executed");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test execution is done");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test execution is done");
  }
 // @Test(dependsOnMethods = {"Test2" , "Test3"}) //if we want to run test 1 after test2 and test3 then we have to define test dependency
  @Test(dependsOnMethods = {"Test2" , "Test3"} , alwaysRun = true)//if test 2 and 3 are somehow fail then test 1 will be skipped so in order to run test 1 after test 2 & 3 fail we have to define always run
  public void Test1() {
	  System.out.println("Test1 Executed");
  }
  @Test
  public void Test2() {
	  System.out.println("Test2 Executed");
	  fail("Test2 fails"); //we deliberately make test fail to see response of depends function for this we use always run
  }
  @Test
  public void Test3() {
	  System.out.println("Test3 Executed");
	  fail("Test2 fails");
  }
  @Test @Ignore //to make test ignore this test will never executed .we can also ignore class 
  public void Test4() {
	  System.out.println("Test4 Executed");
  }
  @Test
  public void Test5() {
	  System.out.println("Test5 Executed");
  }
  
}

