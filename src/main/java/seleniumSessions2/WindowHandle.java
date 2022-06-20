package seleniumSessions2;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	static WebDriver driver = null;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//      driver.manage().window().maximize();
        
		driver.get("https://www.freshworks.com/");
	By fbLink = By.className("icon-facebook");
	driver.findElement(fbLink).click();
// child window
	
// Window Handler API	
 List<WebElement> links = driver.findElements(By.tagName("a"));
	Set<String> handles =  driver.getWindowHandles();
	
   Iterator<String> itr = handles.iterator();
     
   String prntId = itr.next();
   System.out.println("Parent Window ID: "+prntId);
   
   String childId = itr.next();
   System.out.println("Child Window ID: "+childId);
     
  // switch to child window
   
   driver.switchTo().window(childId);
  System.out.println(driver.getTitle());

  driver.close();
  
 driver.switchTo().window(prntId);
 System.out.println("Parent Window Title: "+ driver.getTitle()); 

	
	
	
	}
}