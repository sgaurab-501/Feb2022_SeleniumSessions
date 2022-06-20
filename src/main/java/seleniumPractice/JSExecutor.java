package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSExecutor {

static WebDriver driver = null;	
	public static void main(String[] args) throws Exception {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.shine.com/");
		
	// script -- java
	// browser -- javascript
// javascript code -- with selenium + java -- JSExecutor
	
	 
	driver.findElement(By.xpath("//div[@class='modal_notification__rwztg']/button")).click();
	
	JScriptUtil jsu = new JScriptUtil(driver);
	
	String title = jsu.getTitleByJS();
	System.out.println(title);

//	Thread.sleep(2000);	
//	jsu.refreshByJs();
	
	driver.get("https://www.google.com/");
	}
	
}
