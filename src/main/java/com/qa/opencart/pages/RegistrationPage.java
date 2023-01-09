package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.ElementUtils;

public class RegistrationPage {
	private WebDriver driver;
	private ElementUtils elementutil;

	private By firstname = By.id("input-firstname");
	private By lastname = By.id("input-lastname");
	private By email = By.id("input-email");
	private By telephone = By.id("input-telephone");
	private By password = By.id("input-password");
	private By confirmpassword = By.id("input-confirm");
	private By subscribeYes = By.xpath("(//label[@class='radio-inline'])[position()=1]/input");
	private By subscribeNo = By.xpath("(//label[@class='radio-inline'])[position()=2]/input");
	private By agreecheckbox = By.xpath("//input[@type='checkbox']");
	private By continuebutton = By.xpath("//input[@type='submit']");
	private By successmsg = By.cssSelector("div#content h1");
	private By logoutLink = By.linkText("Logout");
	private By registerLink = By.linkText("Register");

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		elementutil = new ElementUtils(driver);

	}

	public boolean registrationPage(String firstname, String lastname, String email, String telephone, String password,
			String subscribe) {

		fillRegForm(firstname, lastname, email, telephone, password);
		selectSubscribeOption(subscribe);
		return getRegistrationStatus();
	}

		private boolean getRegistrationStatus() {
		String message = elementutil.doGetText(successmsg);
		if (message.contains(Constants.REGISTER_SUCCESS_MESSAGE)) {
			elementutil.doClick(logoutLink);
			elementutil.doClick(registerLink);
			return true;

		}

		return false;
	}
	

	private void selectAgreementAndContinue()
	{
		elementutil.doClick(agreecheckbox);
		elementutil.doClick(continuebutton);
	}
	
	
		private void selectSubscribeOption(String subscribe) {
	
		if (subscribe.equalsIgnoreCase("yes")) {
			elementutil.doClick(subscribeYes);

		} else {
			elementutil.doClick(subscribeNo); 
		}
		}
		

	private void fillRegForm(String firstname, String lastname, String email, String telephone, String password) {
		
		elementutil.doSendKeys(this.firstname, firstname);
		elementutil.doSendKeys(this.lastname, lastname);
		elementutil.doSendKeys(this.email, email);
		elementutil.doSendKeys(this.telephone, telephone);
		elementutil.doSendKeys(this.password, password);
		elementutil.doSendKeys(this.confirmpassword, password);	
		
		
	}
		}
		
		
		
		
		
		
		
