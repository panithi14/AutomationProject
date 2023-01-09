package com.qa.opencart.test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.Base.BaseTest;
import com.qa.opencart.utils.Constants;

public class ProductInfoTest extends BaseTest {

	@BeforeClass
	public void ProductInfoPageSetUp() {
		accPage = loginpage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
	}

	@Test
	public void productHeaderTest() {
		resultsPage = accPage.doSearch("macbook");
		productInfoPage = resultsPage.selctProduct("macBook Pro");
		String actualHeader = productInfoPage.getproductHeaderText();
		Assert.assertEquals(actualHeader, "macBook Pro");

	}
	
	@DataProvider
	public Object[][] getImageData() {
		return new Object[][]{ 
			{"macbook","macbook pro",4},{"imac","iMac",3},{"Apple","Apple cinema 30\"",6} };
	}
	
	@Test(dataProvider="getImageData")
	public void productImageCountTest(String productName,String mainProductName,int imageCount) {
		resultsPage=accPage.doSearch("productName");
		resultsPage.selctProduct("mainProductName");
		Assert.assertEquals(productInfoPage.getproductImageCount(),imageCount);
		}
}
