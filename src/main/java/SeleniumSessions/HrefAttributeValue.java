package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HrefAttributeValue {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		String url=driver.findElement(By.linkText("About Us")).getAttribute("href");
		System.out.println(url);
	String s=driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/51EAQs9-rvL._AC_SY175_.jpg' ]")).getText();
	System.out.println(s);
		}

}
