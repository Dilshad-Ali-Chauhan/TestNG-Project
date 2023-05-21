package com.codingiri.Library;

import org.openqa.selenium.WebDriver;

import com.codingiri.Pages.Advanced_Search_Page;
import com.codingiri.Pages.Home_Page;
import com.codingiri.Pages.Search_Result_Page;

public class Page_Library {
	private WebDriver driver;
	private Home_Page homepage;
	private Advanced_Search_Page advSearchPage;
	private	Search_Result_Page srcResultPage;
		
		public Page_Library(WebDriver driver) {
			this.driver = driver;
			 homepage = new  Home_Page(this.driver);
			    advSearchPage = new Advanced_Search_Page(driver);
			    srcResultPage = new Search_Result_Page(driver);
		}
		public Home_Page home() {
			return homepage;
		}
		public Advanced_Search_Page advanced() {
			return advSearchPage;
		}
		public Search_Result_Page result() {
			return srcResultPage;
		}

}
