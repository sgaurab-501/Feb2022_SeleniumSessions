package util.Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeftPaneLinks {

	static WebDriver driver = null;
 public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://www.freshersworld.com/");
   
	By links = By.xpath("//div[@class='menu-footer display-flex']//div[@class='col-md-3 col-lg-3 col-xs-3 l_jobs jobs_by_categoery_list1']/ul/li");

//	getAllElementsText(links);

	  List<String> actTextList = new ArrayList<String>();
    actTextList = getElementsTextList(links); 
      System.out.println(actTextList); 	  
 
 }
 
 public static int getElementListCount(By locator) {
	  return driver.findElements(locator).size();
 
  }
 
 public static List<String> getElementsTextList(By locator) {
	ArrayList<String> eleTextList = new ArrayList<String>();
  
 List<WebElement> eleList = getAllElement(locator);
 for(WebElement e: eleList) {
	 
	 String text = e.getText();
 
     eleTextList.add(text); 
 }
 
     return eleTextList;
   
 
 }
 
 
 public static void printAllElementsText(By locator) {


List<WebElement> eleList = driver.findElements(locator);
 
 for(WebElement e: eleList) {
	 
	 String text = e.getText();
	 
System.out.println("========="+text+"=========");
	
 }
 
  }
public static List<WebElement> getAllElement(By locator){
	
	return driver.findElements(locator);
}

}
