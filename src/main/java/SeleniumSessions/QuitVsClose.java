package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sam P\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch the browser
		driver.get("http://google.com");
		String title = driver.getTitle();
		System.out.println(driver.getCurrentUrl());//get url

		driver.quit();// close the browser
		//driver.close();// close the browser//123
		
		driver = new ChromeDriver();//launch the browser//456
		driver.get("http://www.google.com");
		title = driver.getTitle();// get the page title
		//Quit: NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		//close: NoSuchSessionException: invalid session id
		System.out.println("page title : " + title);

	}

}
