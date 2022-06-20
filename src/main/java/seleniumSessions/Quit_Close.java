package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit_Close {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","E:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe" );
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	System.out.println(driver.getTitle());
//	driver.quit();// quit browser
	driver.close();
	System.out.println(driver.getTitle()); //NoSuchSessionException
	
	
	driver = new ChromeDriver();
	driver.get("https://www.india.com/");
	System.out.println(driver.getTitle());
	}
}
