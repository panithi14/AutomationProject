package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil{
	
	public WebDriver driver;
	
	public WebDriver initDriver(String browserName) {
		
		System.out.println("browser name:"+browserName);
		if(browserName.equalsIgnoreCase("chrome")) {
			//System.setProperty("webDriver.chrome.driver", "C:\\Users\\sam P\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			//System.setProperty("webDriver.chrome.driver", "C:\\Users\\sam P\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		else if (browserName.equalsIgnoreCase("safari")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new SafariDriver();
		}

		else {
			System.out.println("please pass the right browser..." + browserName);
		}

		return driver;
		}
		public void launchUrl(String url) {
			if(url==null||url.isEmpty()) {
				System.out.println("please pass the correct url");
			}
			driver.get(url);
		}
		
		public String getPageTitle() {
			return driver.getTitle();
		}

		public String getPageUrl() {
			return driver.getCurrentUrl();
		}

		public void closeBrowser() {
			driver.close();
		}

		public void quitBrowser() {
			driver.quit();
		}

	
	}
	


