package com.codingiri.TestNG_Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.codingiri.Elements.Ebay_Advanced_Search_Page;
import com.codingiri.Elements.Ebay_Search_Results_Page;
import com.codingiri.Pages.Advanced_Search_Page;
import com.codingiri.Pages.Search_Result_Page;

public class Second_Ebay_Advanced_Search_sanity extends Abstract_Base_class {
	
	/***WebDriver driver;
	//we create a object of page factory class to use them in this program
	//Ebay_Advanced_Search_Page advSearchElements; //this is advanced search page object
	//Ebay_Search_Results_Page searchResultsElements; //this is search result page object
	/**
	 * for page class
	 */
	/**Advanced_Search_Page advSearchPage;
	Search_Result_Page srcResultPage;
	**/
	/**@BeforeMethod
	public void setup() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get("https://www.ebay.com/sch/ebayadvsearch");
			Thread.sleep(2000);
			
			//advSearchElements = new Ebay_Advanced_Search_Page(driver); //used for page factory
			advSearchPage = new Advanced_Search_Page(driver);//for page class
			//searchResultsElements = new Ebay_Search_Results_Page(driver); //used for page factory
			srcResultPage = new Search_Result_Page(driver);//for page class
	}
	
	@BeforeMethod //we create this method for base class
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    advSearchPage = new Advanced_Search_Page(driver);
	    srcResultPage = new Search_Result_Page(driver);
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	**/
	//we hide these because these are common things that are used in each test so we put them in base class
  @Test(groups = {"p3"})
  public void Empty_advanced_search_test() throws InterruptedException {
	  
	  app().flow().navigateToUrl("https://www.ebay.com/sch/ebayadvsearch"); //use this line for flow class
	 // driver.get("https://www.ebay.com/sch/ebayadvsearch");// we use these two line for base class setup
		Thread.sleep(2000);
	  
	  String expectedUrl = "https://www.ebay.com/n/all-categories";
	  String ExpectedTitle = "Shop by Category | eBay";
	 // WebElement searchbutton = driver.findElement(By.cssSelector("div[class='adv-s mb space-top'] button[type='submit']"));
	  
	 // WebElement searchbutton = advSearchElements.advancedsearchbutton; // page factory
	  
	 // Assert.assertTrue(searchbutton.isEnabled(), "verify search button enabled");
	//  Assert.assertTrue(advSearchPage.isAdvSearchButtonEnabled(), "verify search button enabled");//for page class
	  Assert.assertTrue(app().pages().advanced().isAdvSearchButtonEnabled(), "verify search button enabled"); //use for library class
	  
	 // searchbutton.click();
	 // advSearchPage.clickAdvSearchbutton();//for page class
	  app().pages().advanced().clickAdvSearchbutton();  //use for library class
	  Thread.sleep(2000);
	  
	 // String newUrl = driver.getCurrentUrl();
	  String newUrl = app().flow().getCurrentpageUrl();
	 // String newTitle = driver.getTitle();
	  String newTitle = app().flow().getCurrentPageTitle();
	  System.out.println(newUrl);
	  System.out.println(newTitle);
	  
	  Assert.assertEquals(newUrl, expectedUrl,"verify the url of new page");
	  Assert.assertEquals(newTitle, ExpectedTitle,"verify the title of new page");
  }
  @Test(groups = {"p1" , "p2"})
  public void category_options_in_ascending_order_test() throws InterruptedException {
	  
	  app().flow().navigateToUrl("https://www.ebay.com/sch/ebayadvsearch"); //for flow class
	  //driver.get("https://www.ebay.com/sch/ebayadvsearch");// we use these two line for base class setup
		Thread.sleep(2000);
	  
	//  List<WebElement> category_options =  driver.findElements(By.id("e1-1"));
	  //List<WebElement> category_options = advSearchElements.allcategorySelectBoxOption; //page factory
	 // List<WebElement> category_options = advSearchPage.getAllCatOption();//for page class
	  List<WebElement> category_options = app().pages().advanced().getAllCatOption(); //use this for library class
	  List<String> arr1 = new ArrayList<String>();
	  
	  for(WebElement option : category_options) {
		  arr1.add(option.getText());
	  }
	  List<String> arr2 = new ArrayList<String>();
	  Collections.sort(arr2);
	  System.out.println("Actual List:" + arr1);
	  System.out.println("Sorted List:" + arr2);
	  Assert.assertTrue(arr1.equals(arr2), "verify category items sorted"); //here test fail because actual list are not im ascending order
}

  
  //we add these test for page factory concept
  
 @Test(groups = {"p2" , "p3"})
  public void ebay_logo_link_navigation_home_page_test() throws InterruptedException {
	 
	 app().flow().navigateToUrl("https://www.ebay.com/sch/ebayadvsearch");
	// driver.get("https://www.ebay.com/sch/ebayadvsearch");// we use these two line for base class setup
		Thread.sleep(2000);
		
	  String expectURL = "https://www.ebay.com/";
	  String expectTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
	  
	 // driver.findElement(By.id("gh-la")).click();
	  //advSearchElements.ebaylogo.click(); // for page factory
	//  advSearchPage.clickOnEbayLogo();//for page class
	  app().pages().advanced().clickOnEbayLogo(); //use this for library class

	  Thread.sleep(2000);
	  //String newURL = driver.getCurrentUrl();
	  String newURL = app().flow().getCurrentpageUrl();
	 // String newTitle = driver.getTitle();
	  String newTitle = app().flow().getCurrentPageTitle();
	  
	  System.out.println(newURL);
	  System.out.println(newTitle);
	  Assert.assertEquals(newURL, expectURL,"verify url of new page");
	  Assert.assertEquals(newTitle, expectTitle,"verify title of new page");
 
 
 }
 @Test(groups = {"p0" , "p3"})
 public void advanced_search_keywords_test() throws InterruptedException {
	 
	 app().flow().navigateToUrl("https://www.ebay.com/sch/ebayadvsearch");
	// driver.get("https://www.ebay.com/sch/ebayadvsearch");// we use these two line for base class setup
		Thread.sleep(2000);
	 
	String keyword1 = "realme" ;
	String keyword2 = "narzo";
	String searchString = keyword1 + " " + keyword2;
	
	//driver.findElement(By.xpath("//input[@id='_nkw']")).sendKeys(searchString);
	//advSearchElements.KeywordsField.sendKeys(searchString);
	//advSearchPage.enterSearchStringInKeywordsField(searchString);//for page class
	app().pages().advanced().enterSearchStringInKeywordsField(searchString);//use this for library class

	//driver.findElement(By.xpath("//div[@class='adv-s mb space-top']//button[@type='submit'][normalize-space()='Search']")).click();
	//advSearchElements.advancedsearchbutton.click(); //page factory
	//advSearchPage.clickAdvSearchbutton();//for page class
	app().pages().advanced().clickAdvSearchbutton(); //use this for library class

	Thread.sleep(2000);
	 
	// WebElement firstResult = driver.findElement(By.id("item3db7961ba3"));
	//WebElement firstResult = searchResultsElements.firstSearchResult; //hide for page class
	// String firstResultTitle = firstResult.getText().trim();
	// String firstResultTitle = srcResultPage.getFirstResultTitle();//for page class
	 String firstResultTitle = app().pages().result().getFirstResultTitle(); //use this for library class

	 
	 Assert.assertTrue(firstResultTitle.toLowerCase().contains(keyword1),"Result title contains first keyword" + keyword1);
	 Assert.assertTrue(firstResultTitle.toLowerCase().contains(keyword2),"Result title contains second keyword" + keyword2);
 }
 
 
 
}