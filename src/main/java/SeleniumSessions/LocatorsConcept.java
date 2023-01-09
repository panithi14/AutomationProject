package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		// create webelement + perform action(click, sendkeys, get text, isdisplayed)
		// 1.
		// driver.findElement(By.id("input-email")).sendKeys("naveenanimation20@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys("selenium12345");

		// 2.
//		WebElement email= driver.findElement(By.id("input-email"));
//		WebElement password=driver.findElement(By.id("input-password"));
//		email.sendKeys("naveenanimation20@gmail.com");
//		password.sendKeys("selemium12345");
//		
		// 3.By Locator
		By emailId = By.id("input-email");
		By pass = By.id("input-password");
		driver.findElement(emailId).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(pass).sendKeys("selenium12345");

		// 4.
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		WebElement eId = driver.findElement(emailId);
//		WebElement pwd = driver.findElement(password);	
//		eId.sendKeys("naveen@gmail.com");
//		pwd.sendKeys("naveen@123");
	
	// 5.generic function: to create a webelement:getelement is used to create the webelement

//	By eid = By.id("input-email");
//	By passwd = By.id("input-password");
//	getElement(eid).sendKeys("sampanithi99@gmail.com");
//	getElement(passwd).sendKeys("selenium12345");
	
		
		// 6.generic function:getelement()+ sendkeys()

		By eid = By.id("input-email");
		By password1 = By.id("input-password");
	
		doSendKeys(eid,"naveen@gmail.com");
		doSendKeys(password1,"sam");
		
		//7.
//		ElementUtil eleutil=new ElementUtil();
//		By eid1 = By.id("input-email");
//		By password2 = By.id("input-password");
//		eleutil.doSendKeys(eid1, "naveen@gmail.com");
//
//		eleutil.doSendKeys(password2, "selenium");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
		
	public static void doSendKeys(By locator, String value) {
		 getElement(locator).sendKeys(value);
	}

}
