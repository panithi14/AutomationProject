package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.ElementUtils;

public class Accountspage {

	/*
	 * in page classes we have to maintain the by locators and constructor and page
	 * actions or methods
	 */

	private WebDriver driver;
	private ElementUtils elementutil;
	private By search = By.name("search");
	private By logout = By.linkText("logout");
	private By accsecheaders = By.cssSelector("div#content h2");

	public Accountspage(WebDriver driver) {
		this.driver = driver;
		elementutil = new ElementUtils(driver);

	}

	public String getAccPageTitle() {
		return elementutil.waitForTitleToBe(Constants.DEFAULT_TIME_OUT, Constants.ACCOUNT_PAGE_TITLE);

	}

	public boolean logoutLink() {
		return elementutil.doIsDiplayed(logout);
	}

	public List<String> getaccsecList() {
		List<WebElement> seclist = elementutil.getElements(accsecheaders);
		List<String> secheaderlist = new ArrayList<String>();

		for (WebElement e : seclist) {
			secheaderlist.add(e.getText());

		}
		return secheaderlist;
	}
	
	public ResultsPage doSearch(String ProductName) {
		
		System.out.println("prodt name is:" +ProductName);
		elementutil.doSendKeys(search, ProductName);
		elementutil.doClick(search);
		return new ResultsPage(driver);
	}

}
