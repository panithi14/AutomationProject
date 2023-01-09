package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	static WebDriver driver;

	public static void main(String[] args) {

		// total images on the page
		// for each image, print src and alt value

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// driver.get("https://www.amazon.in/");

//		List<WebElement>imageList=driver.findElements(By.tagName("img"));
//		System.out.println("Total images:" +imageList.size());
//		
//		for(int i=0;i<imageList.size();i++) {
//			String altvalue=imageList.get(i).getAttribute("alt");
//			String srcvalue=imageList.get(i).getAttribute("src");
//			
//			System.out.println(altvalue + ": "+ srcvalue);

		// total links on the page, and print its text and href value
//		List<WebElement>totalList=driver.findElements(By.tagName("a"));
//		System.out.println(totalList.size());
//		
//		for(WebElement e:totalList) {
//			String href=e.getAttribute("href");
//			String text=e.getText();
//			
//			System.out.println(href + ":"+ text);
//			
//		}
//		}

		// democart example to capture all the links in the page
//		driver.get("https://demo.opencart.com/index.php?route=account/login");
//		List<WebElement>totalLinks=driver.findElements(By.linkText("a"));
//		System.out.println("total links:" +totalLinks.size());
//		//to capture place holder
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		List<WebElement> inputtag = driver.findElements(By.tagName("input"));
		//System.out.println("totaltextfileds:" + inputtag);

//		for(int i=0;i<inputtag.size();i++) {
//			String placevalue=inputtag.get(i).getAttribute("placeholder");
//		System.out.println("place holder:"+placevalue);
//		
//		
//		}
		for (WebElement e : inputtag) {
			String placeholder = e.getAttribute("placeholder");
			System.out.println("place:"+placeholder);
		}
		driver.close();
	}

}
