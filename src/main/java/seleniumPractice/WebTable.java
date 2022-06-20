package seleniumPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	static WebDriver driver = null;
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
   driver.get("");
	
// xpath-axes
   
 //locator
 // framework
 // test report
 // syntax of the code
	selectUser("John,Smith");
	selectUser("Kevin,Mathews");
	System.out.println("username is: "+"Kevin,Mathews");
 System.out.println(getUserData("Kevin,Mathews"));
	
	
	
}	



public static List<String> getUserData(String name) {

List<WebElement> colEle = driver.findElements(By.xpath("//a[text()='"+name+"']/parent::td/following-sibling::td"));	

List<String> colData = new ArrayList<String>();
for(WebElement e: colEle) {
	String text = e.getText();
	colData.add(text);
}

return colData;

}

public static void selectUser(String name) {
	
	By check = By.xpath("//a[text()='"+name+"']/parent::td/preceding-sibling::td/input");
	
	driver.findElement(check).click();
	
	
}
	
}
