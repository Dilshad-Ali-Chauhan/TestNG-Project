package com.codingiri.Pages;

import org.openqa.selenium.WebDriver;

import com.codingiri.Elements.Ebay_Home_Page;

public class Home_Page {
	WebDriver driver; 
	 Ebay_Home_Page homePageElements;
	 
	 public Home_Page(WebDriver driver) {
		 this.driver = driver;
		 homePageElements = new Ebay_Home_Page(driver);
	 }
	 
	 /**
	  * Click on search button
	  */
	 public void clickSearchButton() {
		 
		 homePageElements.searchButton.click();
		 
	 }
	 /**
	  * search button enabled
	  */
	 public boolean isSearchButtonEnabled() {
		 return homePageElements.searchButton.isEnabled();
	 }
	 

}
