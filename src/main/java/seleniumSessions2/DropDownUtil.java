package seleniumSessions2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtil {

	static WebDriver driver = null;
	public static void main(String[] args) {
	
	ElementUtil eutil = new ElementUtil(driver);
   
	
	}
public DropDownUtil(WebDriver driver) {
	
	this.driver = driver;
	
	
}
	public void doSelectByIndex(By locator, int index) {
		
	    Select slct = new Select(getElement(locator));
		slct.selectByIndex(index);
			
	}

	public void doSelectByVisibleText(By locator, String text) {
		
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
		
	}

	public void doSelectByValue(By locator, String value) {
		
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
public static List<WebElement> getAllElements(By locator){
	return driver.findElements(locator);
}

}
