package seleniumSessions3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {

// Implicitly wait: dynamic wait
// global wait
//  it will be applied on all web elements by default
// it cannot be used for the custom wait
// not applicable for non web elements: url, title, alert, page loading
	
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // selenium 4.x method
// e1,e2,e3,e4....en
		driver.get("https://mail.aol.com/"); 	
WebElement loginForm =	driver.findElement(By.id("login-username-form"));
		
driver.switchTo().frame(loginForm);
driver.findElement(By.xpath("//div[@class='input-group']/input[@class='phone-no']")).sendKeys("user@aol.com");

	}
	
	
}
