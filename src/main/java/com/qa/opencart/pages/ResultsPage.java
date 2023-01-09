package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.ElementUtils;

public class ResultsPage {

	private WebDriver driver;
	private ElementUtils elementutil;
	private By searchheader = By.cssSelector("div#content h1");
	private By productResults = By.cssSelector("div.caption a");

	public ResultsPage(WebDriver driver) {
		this.driver = driver;

		elementutil = new ElementUtils(driver);
	}

	public String getSearchHeaderName() {
		return elementutil.doGetText(searchheader);
	}

	public int getSearchProductListCount() {
		return elementutil.waitForElementsPresence(productResults, Constants.DEFAULT_TIME_OUT).size();

	}

	public ProductInfoPage selctProduct(String ProductName) {
		List<WebElement> searchList = elementutil.waitForElementsPresence(productResults, Constants.DEFAULT_TIME_OUT);

		for (WebElement e : searchList) {
			String text = e.getText().trim();
			if (text.equals(ProductName)) {
				e.click();
				break;
			}

		}
		return new ProductInfoPage(driver);

	}

}
