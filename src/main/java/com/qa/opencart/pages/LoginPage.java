package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtils;

public class LoginPage {

	private WebDriver driver;
	private ElementUtils elementutil;

	// By Locators -page objects -or object repository

	private By emailid = By.id("input-email");
	private By password = By.id("input-password");
	private By login = By.xpath("//input[@value='Login']");
	private By forgotpasslink = By.linkText("Forgotten Password");
	private By registerlink = By.linkText("Register");

	// page Constructor

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		elementutil=new ElementUtils(driver);
	}

	// page actions/methods/features

	public String LoginPageTitle() {
		return driver.getTitle();
	}

	public String LoginPageUrl() {
		return driver.getCurrentUrl();
	}

	public boolean isForgotPasswordLinkExist() {
		return driver.findElement(forgotpasslink).isDisplayed();
	}

	public boolean isRegisterLinkExist() {
		return driver.findElement(registerlink).isDisplayed();
	}

	public Accountspage doLogin(String un, String pwd) {
		driver.findElement(emailid).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(login).click();
		return new Accountspage(driver);
	}
	
	public RegistrationPage navigateToRegisterPage()
	{
		elementutil.doClick(registerlink);
		return new RegistrationPage(driver);
	}

}
