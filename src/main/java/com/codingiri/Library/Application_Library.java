package com.codingiri.Library;

import org.openqa.selenium.WebDriver;

public class Application_Library {
	private WebDriver driver;
	private Page_Library page;
	private Flow_Library flow; //create this object for flow library
	
	public Application_Library(WebDriver driver) {
		this.driver = driver;
		page = new Page_Library(this.driver);
		flow = new Flow_Library(this.driver);
	}
	public Page_Library pages() {
		return page;
	}
	public Flow_Library flow() {
		return flow;
	}

}
