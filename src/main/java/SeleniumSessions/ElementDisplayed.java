package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementDisplayed {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.get("https://demo.opencart.com/index.php?route=account/login");
//		boolean flag=driver.findElement(By.id("input-email")).isDisplayed();
//		System.out.println(flag);
//
//		boolean flag1=driver.findElement(By.id("search")).isEnabled();

		driver.get("https://classic.freecrm.com/register/");
		WebElement submit = driver.findElement(By.id("submitButton"));

		System.out.println(submit.isDisplayed());
		System.out.println(submit.isEnabled());

		WebElement agreechk = driver.findElement(By.name("agreeTerms"));
		System.out.println(agreechk.isSelected());
		agreechk.click();
		System.out.println(agreechk.isSelected());
		System.out.println(submit.isEnabled());
		System.out.println(submit.isDisplayed());

	}
	
	
	
	

}

