package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDrvrMngrConcept {

	public static void main(String[] args) {
		
//	System.setProperty("webdriver.chrome.driver","E:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe" );
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
//	WebDriverManager.edgedriver().setup();
//	WebDriver driver = new EdgeDriver();
	
	
	driver.get("https://www.india.com/");
	
	
	
		
	}
}
