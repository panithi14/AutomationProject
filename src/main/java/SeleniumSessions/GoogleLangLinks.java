package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLangLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
//		List<WebElement>lanList=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
//		System.out.println(lanList.size());
//		
//		for(WebElement e: lanList) {
//			String text=e.getText();
//			System.out.println(text);
//			if(text.trim().equals("मराठी")) {
//				e.click();
//				break;
//			}

		driver.get("https://www.google.com/");
//		By LangLinksXpath=By.xpath("//div[@id='SIvCob']/a");
//		doLinkClick(LangLinksXpath, "বাংলা");
//		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By footer = By.xpath("//footer//a");
		doLinkClick(footer, "Site Map");
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void doLinkClick(By locator, String linkvalue) {

		List<WebElement> linksList = driver.findElements(locator);
		System.out.println(linksList.size());

		for (WebElement e : linksList) {
			String text = e.getText();
			System.out.println(text);
			if (text.trim().equals(linkvalue)) {
				e.click();
				break;
			}
		}
	}

}
