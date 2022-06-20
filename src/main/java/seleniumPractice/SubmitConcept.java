package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitConcept {

	static WebDriver driver = null;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
    driver.get("http://automationpractice.com/index.php");
		
// NoSuchElementException
		
List<WebElement> options = driver.findElements(By.className("abc"));
	System.out.println(options.size());	// Empty list --> 0
		
// driver.findElement(By.xpath("abd")).click(); // NoSuchElementException

//	driver.findElement(By.xpath("@//div[@class='abc']")).click(); // InvalidSelectorException	

  // ElementNotInteractableException --> actions
  // ElementClickInterceptedException --> click method from actions class
	
// IllegalStateException --> chromedriver.exe file path is not mentioned
// InvalidArgumentException --> https: is missing from url 
	
	
	
	}
}
