package seleniumSessions2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling {

	static WebDriver driver = null;
	public static void main(String[] args) throws Exception {
	
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
 
    ElementUtil eutil = new ElementUtil(driver);
    
        
    driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
  // Drop down -- html tag --? <select> --> <options>
  // Select class 
    
    
    
    By prodList = By.className("col-lg-3");
//  WebElement products = getElement(prodList);
   
//    Select sel = new Select(products);
//    sel.selectByIndex(4);
//	sel.selectByVisibleText("Yahoo");
//    sel.selectByValue("Google");
        By aniList = By.id("animals");
//   WebElement animals = getElement(aniList);
   
   Thread.sleep(3000);
//   Select slct = new Select(animals);
//   slct.selectByVisibleText("Big Baby Cat");

//   doSelectByIndex(prodList, 2);
     doSelectByVisibleText(prodList, "Iphone");
     
     Thread.sleep(3000);
     doSelectByValue(aniList, "big baby cat");  
    
	}

public static WebElement getElement(By locator) {
	
	return driver.findElement(locator);
}

public static void doSelectByIndex(By locator, int index) {
	
	Select select = new Select(getElement(locator));
	select.selectByIndex(index);
		
}

public static void doSelectByVisibleText(By locator, String text) {
	
	Select select = new Select(getElement(locator));
	select.selectByVisibleText(text);
	
}

public static void doSelectByValue(By locator, String value) {
	
	Select select = new Select(getElement(locator));
	select.selectByValue(value);
	
}

}

