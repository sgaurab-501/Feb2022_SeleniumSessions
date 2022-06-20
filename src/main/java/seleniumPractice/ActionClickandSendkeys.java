package seleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClickandSendkeys {

	static WebDriver driver = null;
	
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	System.out.println(driver.getTitle());
	
	
	By email = By.xpath("//div[@class='_6lux']/input[@id='email']");
    doActionSendKeys(email, "user@gmail.com"); 

    By passwd = By.xpath("//div[@class='_6luy _55r1 _1kbt']/input[@id='pass']");
    doActionSendKeys(passwd, "user123");
	
	By register = By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']/li/a[contains(text(),'Sign')]");
	doActionClick(register);
	System.out.println(driver.getTitle());
	}

public static WebElement getElement(By locator) {
	return driver.findElement(locator);
	
}
public static void doActionSendKeys(By locator, String value) {

	Actions act = new Actions(driver);
  WebElement target = getElement(locator); 
	act.sendKeys(target, value).perform();
}

public static void doActionClick(By locator) {
	Actions act = new Actions(driver);
    WebElement clickEle = getElement(locator);
    act.click(clickEle).build().perform();   
    

}

}
