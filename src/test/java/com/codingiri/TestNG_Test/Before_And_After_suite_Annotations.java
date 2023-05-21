package com.codingiri.TestNG_Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Before_And_After_suite_Annotations {
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method is executed");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method is executed");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class is executed");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class is executed");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test is executed");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test is executed");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite is executed");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite is executed");
  }
  @Test
  public void Test1() {
	  System.out.println("Test1 Executed");
  }
  @Test
  public void Test2() {
	  System.out.println("Test2 Executed");
  }
  @Test
  public void Test3() {
	  System.out.println("Test3 Executed");
  }
  @Test
  public void Test4() {
	  System.out.println("Test4 Executed");
  }
  @Test
  public void Test5() {
	  System.out.println("Test5 Executed");
  }
  

}
