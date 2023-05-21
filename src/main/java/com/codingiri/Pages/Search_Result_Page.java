package com.codingiri.Pages;

import org.openqa.selenium.WebDriver;

import com.codingiri.Elements.Ebay_Advanced_Search_Page;
import com.codingiri.Elements.Ebay_Search_Results_Page;

public class Search_Result_Page {
	WebDriver driver;
	Ebay_Search_Results_Page searchResultsElements;
	
	public Search_Result_Page(WebDriver driver) {
		this.driver = driver;
		searchResultsElements = new Ebay_Search_Results_Page(driver); 
	}
	/**
	 * get first result title
	 */
	public String getFirstResultTitle() {
		 return searchResultsElements.firstSearchResult.getText().trim();
	}
	

}
