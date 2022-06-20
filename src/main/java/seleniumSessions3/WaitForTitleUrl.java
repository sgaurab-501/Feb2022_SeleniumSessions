package seleniumSessions3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForTitleUrl {

	static WebDriver driver;
	
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.get("https://www.msn.com/en-in");
	
	String title = waitForTitleContains("MSN", 30);
	System.out.println(title);
	
	}
public static String waitForTitleContains(String titlePart, int timeOut) {
	

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
if(	wait.until(ExpectedConditions.titleContains(titlePart))) {
       return driver.getTitle();
}
return null;
}

public static String waitForTitle(String titleValue, int timeOut) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	if(wait.until(ExpectedConditions.titleContains(titleValue))) {
	       return driver.getTitle();
	}
	return null;
	}
public static String waitForUrlContains(String urlPart, int timeOut) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	if(wait.until(ExpectedConditions.urlContains(urlPart))) {
	       return driver.getCurrentUrl();
	}
	return null;
	
}
public static String waitForUrl(String url, int timeOut) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	if(wait.until(ExpectedConditions.urlToBe(url))) {
	       return driver.getCurrentUrl();
	}
	return null;
	
}

}



