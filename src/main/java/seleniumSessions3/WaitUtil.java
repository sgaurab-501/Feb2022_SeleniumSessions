package seleniumSessions3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {

 WebDriver driver;

public WaitUtil(WebDriver driver) {
	this.driver = driver;
}

public WebElement waitForElementPresent(By locator, int timeOut) {
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
return wait.until(ExpectedConditions.presenceOfElementLocated(locator));


}

public WebElement waitforElementVisible(By locator, int timeOut) {
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));


}
public String waitForTitleContains(String titlePart, int timeOut) {
	

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
if(	wait.until(ExpectedConditions.titleContains(titlePart))) {
       return driver.getTitle();
}
return null;
}

public String waitForTitle(String titleValue, int timeOut) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	if(wait.until(ExpectedConditions.titleContains(titleValue))) {
	       return driver.getTitle();
	}
	return null;
	}
public String waitForUrlContains(String urlPart, int timeOut) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	if(wait.until(ExpectedConditions.urlContains(urlPart))) {
	       return driver.getCurrentUrl();
	}
	return null;
	
}
public String waitForUrl(String url, int timeOut) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	if(wait.until(ExpectedConditions.urlToBe(url))) {
	       return driver.getCurrentUrl();
	}
	return null;
	
}

	
	
	
}
