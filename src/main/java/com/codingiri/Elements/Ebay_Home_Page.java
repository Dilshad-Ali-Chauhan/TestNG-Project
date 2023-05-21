package com.codingiri.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_Home_Page {
	
	//this contain the element of home page
	//it can reduce repeat_ness of same element
	//it is easy to make change in element if there locater id is changed
	
	WebDriver driver;
	
	@FindBy(id="gh-btn") public WebElement searchButton;
	
	public Ebay_Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

}
}