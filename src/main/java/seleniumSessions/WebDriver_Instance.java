package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumNetworkConditions;

public class WebDriver_Instance {

	
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","E:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe" );
	
//	WebDriver driver = new ChromeDriver();
//	driver = new ChromeDriver();
//	driver = new ChromeDriver();
	
//	driver.get("https://www.google.com/");
	
	WebDriver driver1 = new ChromeDriver();
	WebDriver driver2 = new ChromeDriver();
	WebDriver driver3 = new ChromeDriver();
	
	
	driver1.get("https://www.google.com/");
	driver2.get("https://www.flipkart.com/");
	driver3.get("https://www.amazon.in/");

	
}	
}
