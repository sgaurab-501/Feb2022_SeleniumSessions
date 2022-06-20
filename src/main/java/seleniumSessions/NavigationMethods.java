package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {
	
	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
   WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/"); // Launch the url in a Browser instance
	System.out.println(driver.getTitle());
	driver.get("https://www.msn.com/en-in/");
	
//	driver.navigate().to("https://www.india.com/"); // Launch the url in same Browser instance or open a new if no instance
	System.out.println(driver.getTitle());
	
	driver.navigate().back();
	System.out.println(driver.getTitle());
	
	driver.navigate().forward();
	System.out.println(driver.getTitle());
	
	driver.navigate().refresh();
	
	
	
	}
	
	
}
