package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

//Headless -- No Browser window
//improves performance of the script
//complex UI -- might not work 
public class HeadlessBrowserConcept {

public static void main(String[] args) {
	
WebDriverManager.chromedriver().setup();

ChromeOptions co = new ChromeOptions();
//co.setHeadless(true);
co.addArguments("---headless");

WebDriver driver = new ChromeDriver(co);
driver.get("https://www.google.com/");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());

driver.quit();

}	
}
