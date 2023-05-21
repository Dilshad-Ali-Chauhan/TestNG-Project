package com.codingiri.Library;

import org.openqa.selenium.WebDriver;

public class Flow_Library {
	
	private WebDriver driver;
	
	public Flow_Library(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToUrl(String url) {
		this.driver.get(url);
	}
	public String getCurrentpageUrl() {
		return this.driver.getCurrentUrl();
	}
	public String getCurrentPageTitle() {
		return this.driver.getTitle();
	}

}
