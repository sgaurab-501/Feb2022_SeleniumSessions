package seleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionTick {


	static WebDriver driver = null;
	
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://designsystem.digital.gov/components/checkbox/");
	
WebElement box1 = driver.findElement(By.xpath("//div[@class='usa-checkbox']/input[@id='check-historical-douglass']"));
	Actions act = new Actions(driver);
	
	
	
	
}

}