package seleniumSessions3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://mail.aol.com/");
		
	By login_block = By.id("login-username-form");
	By username= By.xpath("//div[@class='input-group']/input[@id='login-username']");
    By button = By.xpath("//div[@class='button-container']/input[@name='signin']");
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//	WebElement loginForm = wait.until(ExpectedConditions.presenceOfElementLocated(login_block));

// Implicit wait: only for web elements    
// Explicit wait: web elements + non web elements (alert, title, url)    
    
    
	waitforElementVisible(login_block, 40);
	driver.switchTo().activeElement();
//	driver.switchTo().frame(loginForm); // not working
	
	getElement(username).sendKeys("user@aol.com");
	getElement(button).click();
    
	
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
public static WebElement waitForElementPresent(By locator, int timeOut) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
	
}
	
public static WebElement waitforElementVisible(By locator, int timeOut) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	
	
}

}
