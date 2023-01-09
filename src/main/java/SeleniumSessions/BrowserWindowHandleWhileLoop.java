package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleWhileLoop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent window
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();//pop up window		
		Thread.sleep(5000);
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		it.next();
		while(it.hasNext()) {
			String widndowId = it.next();
			System.out.println(widndowId);
			driver.switchTo().window(widndowId);
			System.out.println("window title: " + driver.getTitle());
			driver.close();
		}
	
		
		//driver.quit();
	}

}
