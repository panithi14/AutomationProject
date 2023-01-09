package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMRegistration {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		BrowserUtil util = new BrowserUtil();
		util.launchUrl("https://www.orangehrm.com/hris-hr-software-demo/");
		String attrfirstvalue =driver.findElement(By.id("Form_submitForm_FirstName")).getAttribute("type");
		String attlastname=driver.findElement(By.id("Form_submitForm_LastName")).getAttribute("type");
		System.out.println(attlastname);

	}

}
