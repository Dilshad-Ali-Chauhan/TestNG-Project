package com.codingiri.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_Search_Results_Page {
	
	//this is search result page of e_bay
	
	WebDriver driver;
	
	@FindBy(id = "item3db7961ba3") public WebElement firstSearchResult;
	
	public  Ebay_Search_Results_Page (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

}
}
