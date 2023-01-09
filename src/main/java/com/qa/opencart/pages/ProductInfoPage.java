package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.ElementUtils;

public class ProductInfoPage {
	
	private WebDriver driver;
	private ElementUtils elementutil;
	private ProductInfoPage productInfoPage;
	private By productHeader=By.cssSelector("div#content h1");
	private By productImages=By.cssSelector("ul.thumpnails img");
	private By addToCartBtn=By.id("button-cart");
	
	public ProductInfoPage(WebDriver driver) {
		
		this.driver=driver;
		elementutil=new ElementUtils(driver);
		
		
	}
	
	public String getproductHeaderText() {
		return elementutil.doGetText(productHeader);
	}
	
	public int getproductImageCount() {
		return elementutil.waitForElementsVisible(productImages,Constants.DEFAULT_TIME_OUT).size();
	}
	
	

}
