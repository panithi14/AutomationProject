package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementWithWebElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();
		WebElement emailid = driver.findElement(By.id("input-email"));
		emailid.sendKeys("sampanithi@gmail.com");
		driver.navigate().refresh();
		emailid = driver.findElement(By.id("input-email"));
		emailid.sendKeys("sampaniti@gmail.com");
         //StaleElementReferenceException: stale element reference:
		// element is not attached to the page document
		
		//why we are getting this error
		//whenever we are launching the browser and then i am entering the url and then DOM will be loaded first and then browser will read the DOM 
	//whenever we do the refresh the DOM got updated with new version v2 so here we need to create the webelement once again 
	}
	

}
