package util.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	static WebDriver driver;
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");

//	String email_place = driver.findElement(By.id("email")).getAttribute("placeholder");
//    System.out.println(email_place); 
 
	By email = By.id("email");
    By pass = By.id("pass");	
  System.out.println(getAttributeValue(email, "placeholder"));
  System.out.println(getAttributeValue(pass, "placeholder"));
  
  doSendKeys(email, "test@gmail.com");
  System.out.println(getAttributeValue(email, "value"));
    
	
} 
	

public static String getAttributeValue(By locator, String attributename) {
	
	return driver.findElement(locator).getAttribute(attributename);
	
}

public static WebElement getElement(By locator) {
	
	return driver.findElement(locator);
}

public static void doSendKeys(By locator, String value) {
	getElement(locator).sendKeys(value);
}

public static boolean doIsDisplayed(By locator) {
	return getElement(locator).isDisplayed();
}

}
