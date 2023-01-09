package com.qa.opencart.pages;

import org.openqa.selenium.By;

import com.qa.opencart.utils.ElementUtils;

public class RegisterPage {
	
	private ElementUtils elementutil;
	
	private By first_name=By.id("input-firstname");
	private By last_name=By.id("input-lastname");
	private By email=By.id("input-email");
	private By telephone=By.id("input-telephone");
	private By password=By.id("input-password");
	private By confirmpassword=By.id("input-confirm");
	private By subscribeyes=By.xpath("//label[text()='Yes']");
	private By subscribeno=By.xpath("//label[text()='No']");
	private By agreecheckbox=By.xpath("//input[@type='checkbox']");
	private By continuebutton=By.xpath("//button[text()='Continue']");

}