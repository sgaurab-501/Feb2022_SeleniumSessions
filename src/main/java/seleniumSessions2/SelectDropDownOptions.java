package seleniumSessions2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownOptions {

	static WebDriver driver = null;
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();	
	driver = new ChromeDriver();
	driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
	
	By countryList = By.id("Form_submitForm_Country");	
	
	printDropDownValue(countryList);
	
//	System.out.println(countries.size());
	
	int count = getDropDownCount(countryList);
	System.out.println(count);
	}
	
	

public static WebElement getEleent(By locator) {
	
	return driver.findElement(locator);
	
}

public static WebElement getElement(By locator) {
	
	return driver.findElement(locator);
}

public static List<WebElement> getAllElements(By locator){
	
	return driver.findElements(locator);
	
}

public static int getDropDownCount(By locator) {
	
return getAllElements(locator).size();

}

public static void printDropDownValue(By locator) {
	

	Select slct = new Select(getEleent(locator));
	List<WebElement> countries = slct.getOptions();
	
	System.out.println("------Text--------");	
	for(WebElement e: countries) {
	System.out.println(e.getText());
}
}
	public static void printSelectDropDownValues(By locator) {

    Select slct = new Select(getElement(locator));
    List<WebElement> options = slct.getOptions();	
		
	}
}
