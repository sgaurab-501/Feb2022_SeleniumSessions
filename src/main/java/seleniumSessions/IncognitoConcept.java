package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IncognitoConcept {
	
public static void main(String[] args) {
	
WebDriverManager.chromedriver().setup();
ChromeOptions co = new ChromeOptions();
co.addArguments("---incognito");

WebDriver driver = new ChromeDriver(co);
driver.get("https://www.bing.com/");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());

}
}
