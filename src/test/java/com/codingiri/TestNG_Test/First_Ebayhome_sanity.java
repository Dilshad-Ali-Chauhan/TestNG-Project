

package com.codingiri.TestNG_Test;
import static org.testng.Assert.assertEquals;

//"<!DOCTYPE test SYSTEM "http://testng.org/Testing-1.0.TODO" >"
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.codingiri.Elements.Ebay_Home_Page;
import com.codingiri.Pages.Home_Page;

import org.testng.Assert;
public class First_Ebayhome_sanity extends Abstract_Base_class { //we inherit base class things to this class
	
	/**WebDriver driver;  //we made a class of WebDriver so that it can use in any method if we dont do that we cannot use it in other method
	//declare the object
	// Ebay_Home_Page homePageElements;
	 Home_Page homepage; //use object of page class 
	**/   //we hide these because these are common things that are used in each test so we put them in base class
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before class setting done");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("after class setting done");
	}
/**	@BeforeMethod     // Before method is used to run that method before every method so that we donot need to write same thing in all method
	public void setup() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get("https://www.ebay.com");
			Thread.sleep(2000);
			//homePageElements = new  Ebay_Home_Page(driver);//page factory
			homepage = new  Home_Page(driver);//for page class
	}
	
	
	
	@AfterMethod
	public void tearDown() {  //After method will get executed at the end of each method every method
	driver.close();	
	}
	**/
	//we hide these because these are common things that are used in each test so we put them in base class
  @Test(groups = {"p0" , "p1"})
  public void Empty_Search_Test() throws InterruptedException {
	  
	  app().flow().navigateToUrl("https://www.ebay.com"); //use this for flow class 
	 // driver.get("https://www.ebay.com"); //we add these two line for base class setup
		Thread.sleep(2000);
	  
	  
		String ExpectedUrl = "https://www.ebay.com/n/all-categories";
		String ExpectedTitle = "Shop by Category | eBay";
		
		// 3. to verify the condtion is true..if it is true is run otherwise it give false
	//	Assert.assertTrue(driver.findElement(By.id("gh-btn")).isEnabled(), "verify search button is enabled");
		//Assert.assertTrue(homePageElements.searchButton.isEnabled(), "verify search button is enabled");
		//Assert.assertTrue(homepage.isSearchButtonEnabled(), "verify search button is enabled");//for page class
		Assert.assertTrue(app().pages().home().isSearchButtonEnabled(), "verify search button is enabled"); //use for library class
		
		// 4. to verify the condition is false
		///Assert.assertFalse(false, ExpectedTitle);
		
		// 5. 
		Assert.assertNull(ExpectedUrl, ExpectedTitle) ;
		// 6.
		Assert.assertNotNull(ExpectedUrl, ExpectedTitle);
		
		//driver.findElement(By.id("gh-btn")).click();
		//homePageElements.searchButton.click(); //page factory
		//homepage.clickSearchButton(); //for page class
		app().pages().home().clickSearchButton(); //use for library class
		Thread.sleep(2000);
		//String newUrl = driver.getCurrentUrl();
		String newUrl = app().flow().getCurrentpageUrl(); //for flow class
		//String newTitle = driver.getTitle();
		String newTitle = app().flow().getCurrentPageTitle(); //for flow class
		
		System.out.println(newUrl);
		System.out.println(newTitle);
		// 1.to verify two value are equals from new value to expected value.we use assert equals
		///Assert.assertEquals(newUrl, ExpectedUrl,"verify the url of new page");
		      //Assert.assertEquals(newUrl, "","verify the url of new page");//for checking failed case
		//Assert.assertEquals(newTitle, ExpectedTitle,"verify the title of new page");
		
		// 2.to verify two value are not equals from new value to expected value
		Assert.assertNotEquals(newUrl, "","verify url");
		Assert.assertNotEquals(newTitle, "");
		
		
		//driver.close(); /// we use it in after method so no need to write it again
  }
  
  @Test(groups = {"p1" , "p2"})
  public void Empty_Search_Test_softAssert() throws InterruptedException {
	  
	  app().flow().navigateToUrl("https://www.ebay.com"); //for flow class
	//  driver.get("https://www.ebay.com"); //we add these two line for base class setup
		Thread.sleep(2000);

	  
	  //hard assert abort the code immediately when an error occurred
	  //soft error skip the error line and execute the whole program
	  //if we not use a.assertall() at the end then it shows test case are passed
	  
	  
	  SoftAssert sa = new SoftAssert();
	 
		String ExpectedUrl = "https://www.ebay.com/n/all-categories";
		String ExpectedTitle = "Shop by Category | eBay";
		
		
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(2000);
		//String newUrl = driver.getCurrentUrl();
		String newUrl = app().flow().getCurrentpageUrl(); //for flow class
		//String newTitle = driver.getTitle();
		String newTitle = app().flow().getCurrentPageTitle();
		
		System.out.println(newUrl);
		System.out.println(newTitle);
		// 1.to verify two value are equals from new value to expected value.we use assert equals
		///sa.assertEquals(newUrl, ExpectedUrl,"verify the url of new page");
		      sa.assertEquals(newUrl, "","verify the url of new page");//for checking failed case
		//Assert.assertEquals(newTitle, ExpectedTitle,"verify the title of new page");
		
		// 2.to verify two value are not equals from new value to expected value
		sa.assertNotEquals(newUrl, "","verify url");
		sa.assertNotEquals(newTitle, "");
		
		
	
		sa.assertAll();
  }
}

