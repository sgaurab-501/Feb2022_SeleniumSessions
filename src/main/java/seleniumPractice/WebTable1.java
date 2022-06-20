package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable1 {

static WebDriver driver = null;
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
   	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/46121/gt-vs-pbks-48th-match-indian-premier-league-2022");
	
//div.cb-col.cb-col-100.cb-scrd-itms	
   	
   By bowler = By.cssSelector("div.cb-scrd-itms");
   
   List<WebElement> card = driver.findElements(bowler);
 
   List<String> details = new ArrayList<String>();
   for(WebElement e: card) {
	   String text = e.getText();
	  details.add(text);
	  
   }
Iterator<String> it = details.iterator();
while(it.hasNext()){
	
	System.out.println(it.next());
	
	
}
   
}
	
	
	
	
	
}
