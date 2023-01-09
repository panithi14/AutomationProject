package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sam P\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// launch the browser
		driver.get("http://google.com");
		String title= driver.getTitle();
		if(title.equals("Google")){
			System.out.println("title is correct ");
		}
		else {
			System.out.println("wrong title");
		}

		System.out.println(driver.getCurrentUrl());
		String pagesource=driver.getPageSource();
		if(pagesource.contains("copyright"))
		{
			System.out.println("page source is correct");
		}
		else {
			System.out.println("page source is incorrect");
		}
		//driver.quit();
		driver.close();
	}

}
