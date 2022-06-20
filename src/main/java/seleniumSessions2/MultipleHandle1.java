package seleniumSessions2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleHandle1 {

static WebDriver driver = null;

public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://www.narayanacoachingcenters.in/");
	
	driver.findElement(By.partialLinkText("facebook.com"));
	
	
	
	
	
}

}
