package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.Base.BaseTest;
import com.qa.opencart.utils.Constants;

public class LoginPageTest extends BaseTest {

	@Test

	public void loginPageTitleTest() {

		String title = loginpage.LoginPageTitle();
		System.out.println("account page title is:" + title);
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);

	}

	@Test

	public void loginPageUrl() {
		String url = loginpage.LoginPageUrl();
		System.out.println("login page url:" + url);
		Assert.assertTrue(url.contains(Constants.LOGIN_PAGE_URL_VALUE));
	}

	@Test
	public void ForgetPasswordLinkExist() {
		Assert.assertTrue(loginpage.isForgotPasswordLinkExist());
	}

	@Test
	public void RegistrationLinkExist() {
		Assert.assertTrue(loginpage.isRegisterLinkExist());

	}
	@Test
	public void loginTest() {
		loginpage.doLogin(prop.getProperty("username").trim(),prop.getProperty("password").trim());
	}

}
