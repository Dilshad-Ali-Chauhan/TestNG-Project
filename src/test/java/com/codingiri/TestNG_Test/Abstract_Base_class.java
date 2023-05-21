package com.codingiri.TestNG_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.codingiri.Library.Application_Library;
import com.codingiri.Pages.Advanced_Search_Page;
import com.codingiri.Pages.Home_Page;
import com.codingiri.Pages.Search_Result_Page;

public class Abstract_Base_class {
	/**
	 * we create base class of same method that are used in all class so that we don't need to mention these method again in all class
	 */
	
	WebDriver driver;
	private Application_Library app; //use this for library class
	/** Home_Page homepage;
	 Advanced_Search_Page advSearchPage;
		Search_Result_Page srcResultPage;
	 **/   //we remove this to use library class
	//@BeforeMethod 
	//@BeforeTest //by using before test now driver will open and close only once not again after every test case it will execute before one suite 
	/**@BeforeMethod(alwaysRun=true)  //in testNG xml we cannot run multiple program by using before-test method so convert it to previous method because before test is executed only once
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    app = new Application_Library(driver); //use this for library class 
	  **/
	//use this setup for parameter
	    @Parameters({"browser" , "driverexe"}) //we add multiple name of parameter by putting comma if using only single name no need to put inside curly bracket
		@BeforeMethod(alwaysRun=true)
	    public void setup(@Optional("Chrome") String browser ,
	    		@Optional("C:\\\\Users\\\\Dilshad\\\\Documents\\\\Drivers\\\\chromedriver.exe") String exe) {
	    	//we use optional to run class without xml file
	    	if(browser.equals("chrome")) {
	    		System.setProperty("webdriver.chrome.driver", exe);
	    	    driver = new ChromeDriver();	    	    
	    	}else if(browser.equals("firefox")) {
	    		System.setProperty("webdriver.gecko.driver", exe);
	    	    driver = new FirefoxDriver();
	    	}
	    	app = new Application_Library(driver); 
	    }
	    
	    
	    
	  /**  driver call app object
	    app call applicaton library in applib class
	    applib call page in page library class
	    page library call all the fuction 
	    
	 /**   homepage = new  Home_Page(driver);                                    
	    advSearchPage = new Advanced_Search_Page(driver);                         
	    srcResultPage = new Search_Result_Page(driver);
	    **/  //we remove this to use library class
	//}
	//@AfterMethod
	//@AfterTest
	@AfterMethod(alwaysRun=true) //always run is used to make sure that this setup is run every time for each class
	public void tearDown() {
		driver.close();
	}
	public Application_Library app() {
		return app;
	}
}
