package SeleniumSessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleList {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent window
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();//pop up window		
		Thread.sleep(5000);
		
		Set<String> handles = driver.getWindowHandles();
		List<String> handlesList = new ArrayList<String>(handles);
		
		String parentWindowId = handlesList.get(0);
		System.out.println("parent window id is: " + parentWindowId);
		
		String childWindowId = handlesList.get(1);
		System.out.println("child window id is: " + childWindowId);

		
		driver.switchTo().window(childWindowId);
		System.out.println("child window title: " + driver.getTitle());
		
		driver.close();//close the child window
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title: " + driver.getTitle());
		
		driver.quit();
	}


}
