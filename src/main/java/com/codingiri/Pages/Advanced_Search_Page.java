package com.codingiri.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.codingiri.Elements.Ebay_Advanced_Search_Page;
import com.codingiri.Elements.Ebay_Search_Results_Page;

public class Advanced_Search_Page {
	WebDriver driver;
	Ebay_Advanced_Search_Page advSearchElements; 
	Ebay_Search_Results_Page searchResultsElements; 
	
	public Advanced_Search_Page(WebDriver driver) {
		this.driver = driver;
		advSearchElements = new Ebay_Advanced_Search_Page(driver);
		searchResultsElements = new Ebay_Search_Results_Page(driver); 
	}
	/**
	 * is advanced search button enabled
	 */
	public boolean isAdvSearchButtonEnabled() {
		return advSearchElements.advancedsearchbutton.isEnabled();
	}
	/**
	 * get all category drop_down option
	 */
	public List<WebElement> getAllCatOption(){
		return advSearchElements.allcategorySelectBoxOption;
	}
	/**
	 * click on logo
	 */
	public void clickOnEbayLogo() {
		advSearchElements.ebaylogo.click();
	}
	/**
	 * enter search string in keyword field
	 */
	public void enterSearchStringInKeywordsField(String srcString ) {
		advSearchElements.KeywordsField.sendKeys(srcString);
	}
	/**
	 * click on advanced search button
	 */
	public void clickAdvSearchbutton() {
		advSearchElements.advancedsearchbutton.click();
	}
	

}
