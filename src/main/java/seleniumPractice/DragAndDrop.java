package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	static WebDriver driver = null;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	driver.get("https://jqueryui.com/droppable/");	
	
	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(frame);
	
	WebElement sourceEle = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement targetEle = driver.findElement(By.xpath("//div[@id='droppable']"));
	
	
	
	Actions act = new Actions(driver);
	act.clickAndHold(sourceEle)
	.moveToElement(targetEle)
	.release()
	.build()
    .perform();
	
	
	}
	
}
