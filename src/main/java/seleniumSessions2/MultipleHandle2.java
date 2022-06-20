package seleniumSessions2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleHandle2 {

static WebDriver driver = null;

public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();

	driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
	
	
// 2nd method	
	driver.findElement(By.xpath("//ul[@class='social-links']/li/a[@class='facebook icon-facebook']")).click();

	Set<String> handles = driver.getWindowHandles();
	Iterator<String> itr = handles.iterator();
	String prntId = itr.next();
	String childId = itr.next();
	
// switch to child window
	
	driver.switchTo().window(childId);
	driver.close();
	driver.switchTo().window(prntId);
	driver.close();
	
	
}
	
}
