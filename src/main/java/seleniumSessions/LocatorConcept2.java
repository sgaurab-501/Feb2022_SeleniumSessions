package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept2 {

	static WebDriver driver;	
public static void main(String[] args) {


WebDriverManager.chromedriver().setup();

 driver = new ChromeDriver();
 driver.get("https://www.opencart.com/index.php?route=account/login");
 
// 1) id: unique, cannot be duplicate
// 2) name: can be duplicate
 
// driver.findElement(By.name("email")).sendKeys("user@gmail.com");
// driver.findElement(By.id("input-password")).sendKeys("user@123");

By email = By.id("input-email");
By pass = By.id("input-password");

//ElementUtil elu = new ElementUtil(driver);
//elu.doSendKeys(email, "user@gmail.com");
//elu.doSendKeys(pass, "user@123");

// 3) class name: 
// form-control 

//driver.findElement(By.className("form-control")).sendKeys("user@gmail.com");

// 4) xpath: is a locator (address of an element in DOM) -- but it is not an attribute

//driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("user@gmail.com");
//driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("user@123");
//driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[2]/div/div[1]/form/div[3]/div[1]/button[1]")).click();

//By email_id = By.xpath("//*[@id=\"input-email\"]");
//By pass_id = By.xpath("//*[@id=\"input-password\"]");
//By login_btn = By.xpath("//*[@id=\"account-login\"]/div[2]/div/div[1]/form/div[3]/div[1]/button[1]");
//By err_msg = By.className("alert-danger");

//String error = driver.findElement(err_msg).getText();

//doSendKeys(email_id, "user@gmail.com");
//doSendKeys(pass_id, "user@123");
//doClick(login_btn);

//String error = getText(err_msg);
//System.out.println(error);
//
//if(error.contains("warning")) {
//	System.out.println("correct error message");
//}
//else {
//	System.out.println("incorrect error message");
//}

//5) css selector is a locator, but it is not an attribute

//driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
//driver.findElement(By.cssSelector("#input-password")).sendKeys("user@123");
//driver.findElement(By.cssSelector("#account-login > div.container > div > div:nth-child(1) > form > div.row > div:nth-child(1) > button.btn.btn-primary.btn-lg.hidden-xs")).click();

// 6) Link Text: only applicable for links

//    driver.findElement(By.linkText("REGISTER")).click();
 
//      By registerLink = By.linkText("REGISTER");
//      doClick(registerLink);
//     By loginLink = By.linkText("LOGIN");
//     doClick(loginLink);

// 7) partialLinkText: only for links

// Forgotten password
// Forgotten username

//driver.findElement(By.linkText("LOGIN")).click();
//driver.findElement(By.partialLinkText("Forgot")).click();
//System.out.println(driver.getTitle());

// 8) tagName

String header = driver.findElement(By.tagName("h1")).getText();
System.out.println(header);


}

public static void doClick(By locator) {
	
	getElement(locator).click();
}

public static void doSendKeys(By locator, String value) {
	
	getElement(locator).sendKeys(value);;
}

public static WebElement getElement(By locator) {
	return driver.findElement(locator);
}

public static String getText(By locator) {
	
return	getElement(locator).getText();
}
}
