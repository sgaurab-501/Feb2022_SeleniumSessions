package util.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleElements {

// FindElement -- single element 
// FindElements -- multiple elements

// url: page 
// find out the total no. of links on the page and print the count of links
// print the text of each link on the console
// ignore those links which are having empty text
	
  public static void main(String[] args) {
	
  WebDriver driver = null;	  
  WebDriverManager.chromedriver().setup();	  
  driver = new ChromeDriver();  
//  driver.get("https://twitter.com/i/flow/login");
  driver.get("https://www.flipkart.com/");
  
  // links <a> tag name
  List<WebElement> linksList = driver.findElements(By.tagName("a"));
  System.out.println("Total links: "+linksList.size());

//  for(int i=0; i<linksList.size(); i++) {
//   String text =	linksList.get(i).getText();
//   String hrefVal = linksList.get(i).getAttribute(text);
//   if(!text.isEmpty()) { 
//   System.out.println(text);
//  }
//  }
  
  // for each loop
  

// Java Streams
// Sequential stream  
//   linksList.stream().forEach(ele -> System.out.println(ele.getText()));
   linksList.stream().filter(e -> !e.getText().isEmpty()).forEach(e -> System.out.println(e.getText()));
  
// Parallel stream
  
  }
	


}
