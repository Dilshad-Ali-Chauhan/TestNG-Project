package com.codingiri.Elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_Advanced_Search_Page {    // to use them in other package we must declared them public
	
	WebDriver driver;
	
	@FindBy(css = "div[class='adv-s mb space-top'] button[type='submit']") public WebElement advancedsearchbutton;//this is single element
	
	@FindBy(id = "gh-la") public WebElement ebaylogo; //this is also single element
	
	@FindBy(xpath = "//input[@id='_nkw']") public WebElement KeywordsField;//single element
	
	@FindBy(id = "e1-1") public List<WebElement> allcategorySelectBoxOption;//this is list of element
	
	//we create a constructor
	public Ebay_Advanced_Search_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

}
}