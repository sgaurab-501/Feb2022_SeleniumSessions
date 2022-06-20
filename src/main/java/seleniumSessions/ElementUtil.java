package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	private WebDriver driver;
	
public ElementUtil(WebDriver driver) {
	
	this.driver = driver;
	
	
}
	
public static void main(String[] args) {


}

public WebElement getElement(By locator) {
	 
    return driver.findElement(locator); 
 }

 public void doSendKeys(By locator, String value) {

	 getElement(locator).sendKeys(value);
 }

 public static By getBy(String locatorType, String locatorValue) {
	 By locator = null;
	 
	 switch (locatorType) {
	case "id":
	locator = By.id(locatorValue);	
	break;

case "name":
	locator = By.name(locatorValue);	
		break;		
case "classname":
	locator = By.className(locatorValue);
	break;
	
	default:
	System.out.println("please pass the right locator.....");	
		break;
	}
	
	 return locator;
 }
 
	public String getText(By locator) {
		
	return	getElement(locator).getText();
}

	public void doClick(By locator) {
		
		getElement(locator).click();
	}

}

