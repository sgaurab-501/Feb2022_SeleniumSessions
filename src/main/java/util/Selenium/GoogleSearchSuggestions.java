package util.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;


import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSuggestions {

	static WebDriver driver = null;
	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();	
//	ChromeOptions co = new ChromeOptions();
//	co.setHeadless(true);
//	co.addArguments("---headless");
//	driver=new ChromeDriver(co);
	
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Travel to Goa");
	Thread.sleep(3000);
	
List<WebElement> suggList = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li//div[@class=\"wM6W7d\"]//span"));
	
for(WebElement e : suggList) {
	
	String text = e.getText();
	System.out.println("=============="+text+"===============");
  if(text.contains("by road")) {
	  e.click();
	  break;
	  
	  
  }
 	
}

	}
}
