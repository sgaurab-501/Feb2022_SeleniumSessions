package seleniumSessions3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForBlock {
	static WebDriver driver;
	
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.get("https://mail.yahoo.com/?.intl=us&.partner=ftr&.lang=en-us");
	WebElement loginBlock = driver.findElement(By.cssSelector("div.login-box"));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(loginFrame));
wait.until(ExpectedConditions.visibilityOf(loginBlock));	
    WebElement username = driver.findElement(By.xpath("//div[@class='input-group']/input[@id='login-username']"));
    username.sendKeys("user@yahoo.com");
      
	
	}

	
	
	
}
