package seleniumSessions2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	static WebDriver driver = null;
	public static void main(String[] args) {

		
	}
	
public ElementUtil(WebDriver driver) {
	this.driver = driver;
	
}
public WebElement getElement(By locator) {
	
return driver.findElement(locator);

}
}
