package seleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasket {

static WebDriver driver = null;
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://www.bigbasket.com/");
	
	doSearchByCategory("Vegetables", "Sprouts", "Salads", "Jackfruit");
	String title = driver.getTitle();
	System.out.println(title);
	
}
	public static void doSearchByCategory(String l1, String l2, String l3, String l4) throws Exception {
		
	Actions act = new Actions(driver);
	
	WebElement cat = driver.findElement(By.cssSelector("a.meganav-shop"));
	
	act.moveToElement(cat).perform();
	Thread.sleep(1000);
	
	act.moveToElement(driver.findElement(By.partialLinkText(l1))).perform();
	Thread.sleep(1000);
	
	act.moveToElement(driver.findElement(By.partialLinkText(l2))).perform();
	Thread.sleep(1000);
	
	act.moveToElement(driver.findElement(By.partialLinkText(l3))).perform();
	Thread.sleep(1000);
	
	act.moveToElement(driver.findElement(By.partialLinkText(l4))).click().build().perform();
	Thread.sleep(1000);
		
	}
}
