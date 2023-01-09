package com.qa.opencart.test;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.Base.BaseTest;
import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.ExcelUtil;

public class RegistrationPageTest extends BaseTest {

	@BeforeClass
	public void regPageSetUp() {
		registrationPage = loginpage.navigateToRegisterPage();

	}

	public String getRandomNumber() {
		Random random = new Random();
		String email = "testautoamtion" + random.nextInt(50000) + "gmail.com";
		return email;

	}

	@DataProvider
	public Object[][] getRegisterTestData() {
		Object data[][] = ExcelUtil.getTestData(Constants.REGISTER_SHEET_NAME);
		return data;
	}

	@Test(dataProvider = "getRegisterTestData")
	public void registrationTest(String firstname, String lastname, String email, String telephone, String password,
			String subscribe) {
		Assert.assertTrue(
				registrationPage.registrationPage(firstname, lastname, getRandomNumber(), telephone, password, subscribe));

	}

}
