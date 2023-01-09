package com.qa.opencart.Base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.Accountspage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.pages.ProductInfoPage;
import com.qa.opencart.pages.RegistrationPage;
import com.qa.opencart.pages.ResultsPage;

public class BaseTest {

	public WebDriver driver;
	public DriverFactory df;
	public LoginPage loginpage;
	public Properties prop;
	public Accountspage accPage; 
	public ResultsPage resultsPage;
	public ProductInfoPage productInfoPage;
	public RegistrationPage registrationPage;
	
	@BeforeTest
		
	public void setUp() {
		df=new DriverFactory();
		prop=df.initprop();
		driver=df.initDriver(prop);
		loginpage=new LoginPage(driver);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
