package com.qa.opencart.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public WebDriver driver;
	public Properties prop;
	/**
	 * this method is used to initialize the webdriver on the basis of given browser name....
	 * @param browser
	 * @return this method will return driver
	 */
	
	public WebDriver initDriver(Properties prop) {
		String browser=prop.getProperty("browser");
		
	System.out.println("browser name is:" +browser);
	
	if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
	}

	else {
		System.out.println("please pass the corect browser:" + browser);
		
	}
	driver.get(prop.getProperty("url"));
	return driver;
	
}
	/**
	 * this method is used to initialize the properties on the basis of given environment
	 * @return this method returns prop
	 */
	
	public Properties initprop() {
		
		prop=new Properties();
		try {
			FileInputStream ip=new FileInputStream("./SrcResources/Config/Config.Properties");
	
				prop.load(ip);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	return prop;
	
	}
	
	
	}

