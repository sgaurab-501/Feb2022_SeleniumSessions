package seleniumSessions2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownCheck {

	static WebDriver driver = null;
	
	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
	
	By countryList = By.id("Form_submitForm_Country");

   WebElement countries = getElement(countryList);
   List<String>	countryNames = getDropDownList(countryList);
    if(countryNames.contains("Yemen")) { System.out.println("Pass");	}
    if(countryNames.contains("Finland")) { System.out.println("Pass");   }
    if(countryNames.contains("India")) { System.out.println("Pass");   }
    
	}
	public static List<WebElement> getAllElements(By locator){
		
		return driver.findElements(locator);
	}
	
	public static List<String> getDropDownList(By locator) {
		
	List<String> valueList = new ArrayList<String>();
	Select slct = new Select(getElement(locator));
	List<WebElement> optnList = slct.getOptions();

	for(WebElement e: optnList) {
		
	String text = e.getText();	
     valueList.add(text);		
	}
	
	return valueList;
	}
	
	public static WebElement getElement(By locator) {
   		
	 return driver.findElement(locator);	

	}
public static void selectValueFromDropDown(By locator, String value) {
	Select slct = new Select(getElement(locator));
	List<WebElement> options = slct.getOptions();
	
	for(WebElement e: options) {
	String text = e.getText();
	if(text.contains(value)) {
	e.click();
	break;
	}
		
	}
	
	
}

}
