package util.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	private WebDriver driver;

	public String getAttributeValue(By locator, String attributename) {

   return driver.findElement(locator).getAttribute(attributename);

	}
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
		
	}
	

	public WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public void doClick(By locator) {
		
		getElement(locator).click();
	}	

	public boolean doIsDisplayed(By locator) {

		return getElement(locator).isDisplayed();
	}

	public int getElementsCount(By locator) {

		return driver.findElements(locator).size();
	}

	public List<WebElement> getElements(By locator) {

		return driver.findElements(locator);
	}

}
