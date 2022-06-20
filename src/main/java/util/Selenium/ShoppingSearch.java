package util.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShoppingSearch {
	
static WebDriver driver = null;
public static void main(String[] args) throws Exception {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("http://automationpractice.com/index.php");
	driver.findElement(By.id("search_query_top")).sendKeys("dress");
	Thread.sleep(4000);
	
//	driver.findElement(By.xpath("//div[@class=\"ac_results\"]//li[contains(text(), 'Casual')]")).click();

 // In for loop approach
	
List<WebElement> suggList = driver.findElements(By.xpath("//div[@class=\"ac_results\"]//li"));

for(WebElement e: suggList) {
	 
	String text = e.getText();
	if (text.contains("shirts")) {
		e.click();
		break;
	}

}
	
System.out.println(driver.getTitle());
	 
}
	}
