package com.qa.opencart.test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.Base.BaseTest;
import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.ExcelUtil;

public class AccountsPageTest extends BaseTest {

	@BeforeClass
	public void accPageSetup() {
		accPage = loginpage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
	}

	@Test
	public void getAccPageTitleTest() {
		String title = accPage.getAccPageTitle();
		System.out.println("account page title is:" + title);
		Assert.assertEquals(title, Constants.ACCOUNT_PAGE_TITLE);
	}

	@Test
	public void accPagelogoutLinkTest() {

		Assert.assertTrue(accPage.logoutLink());

	}

	@Test
	public void getAccSecListTest() {
		List<String> ActualSecList = accPage.getaccsecList();

		System.out.println("actual section list:" + ActualSecList);
		Assert.assertEquals(ActualSecList, Constants.EXE_ACCOUNTS_SEC_LIST);

	}

	@DataProvider
	public Object[][] productData() {
		return new Object[][] { { "macbook" }, { "ipad" }, { "Apple" } };
	}

	@Test(dataProvider = "productData")
	public void searchTest(String productName) {
		resultsPage = accPage.doSearch("macbook");
		Assert.assertTrue(resultsPage.getSearchProductListCount() > 0);

	}

	@DataProvider
	public Object[][] getProductsSelectData() {
		Object productdata[][] = ExcelUtil.getTestData(Constants.PRODUCTS_SHEET_NAME);
		return productdata;
	}

	@Test(dataProvider="getProductsSelectData")
	public void selectProductTest(String productName,String mainProductName) {

		resultsPage = accPage.doSearch("productName");
		resultsPage.selctProduct("mainProductName");

	}
}
