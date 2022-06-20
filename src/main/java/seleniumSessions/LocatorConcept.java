package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//create web elements(using locators) + actions (click, sendkeys, getText, isDisplayed)
public class LocatorConcept {

	static WebDriver driver;
public static void main(String[] args) {
	
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://www.opencart.com/index.php?route=account/login");

// 1) id
driver.findElement(By.id("input-email"));
driver.findElement(By.id("input-password"));

// 2)
WebElement emailId = driver.findElement(By.id("input-email"));
WebElement pass = driver.findElement(By.id("input-password"));

// emailId.sendKeys("user@yahoo.com");
// pass.sendKeys("user@123");

// 3) By Locator 
By email = By.id("input-email");
By pwd = By.id("input-password");

//WebElement email_ele = driver.findElement(email);
//WebElement pwd_ele = driver.findElement(pwd);

//email_ele.sendKeys("user@aol.com");
//pwd_ele.sendKeys("user@123");

//4) By Locator with a generic method
 By email_id = By.id("input-email");
By passwd = By.id("input-password");

//getElement(email_id).sendKeys("user@gmail.com");
//getElement(passwd).sendKeys("user@123");

// 5) By Locator with a  generic method getElement() + actions method 

//       doSendKeys(email_id, "user@gmail.com");
//      doSendKeys(passwd, "user@123");

// 6) By locator with a generic method in ElementUtil class

      ElementUtil eutil = new ElementUtil(driver); 
      
//      eutil.doSendKeys(email_id, "user@gmail.com");
//      eutil.doSendKeys(passwd, "user@123");

// 7) String locator OR with generic methods in ElmentUtil class
      String email_field = "input-email";
      String pass_id = "input-password";
      
    doSendKeys(eutil.getBy("id", email_field), "user@gmail.com");
    doSendKeys(eutil.getBy("id", pass_id), "user@123");
    
}

 public static WebElement getElement(By locator) {
	 
    return driver.findElement(locator); 
 }

 public static void doSendKeys(By locator, String value) {

	 getElement(locator).sendKeys(value);

 
 }






}
