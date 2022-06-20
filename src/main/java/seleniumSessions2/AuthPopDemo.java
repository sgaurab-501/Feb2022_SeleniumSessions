package seleniumSessions2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopDemo {

// Pop-up is coming with username and password field
	
	static WebDriver driver = null;
	
	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
//	driver.get("https://the-internet.herokuapp.com/");
//	driver.findElement(By.xpath("https://the-internet.herokuapp.com/")).click();
  
	String uname = "admin";
	String pwd = "admin";
 
	driver.get("https://"+uname+":"+pwd+"@the-internet.herokuapp.com/basic_auth");
	
	
	
	}
	
}
