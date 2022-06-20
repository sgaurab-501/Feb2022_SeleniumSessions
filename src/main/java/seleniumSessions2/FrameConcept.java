package seleniumSessions2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameConcept {
	
//Browser --> Page elements
// ---> Frame ---> elements
	
	static WebDriver driver = null;
	
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

// 1) frame
// 2) iframe
	
WebElement frame1 = driver.findElement(By.id("frame1"));

	driver.switchTo().frame(frame1);
//	driver.switchTo().frame("frame1");

	WebElement frame3 = driver.findElement(By.id("frame3")); // we need to locate the inside frame after switching to outside frame then only it would work
	driver.switchTo().frame(frame3);
	WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
	checkbox.click();

	driver.switchTo().defaultContent(); // come back to the main page
	
WebElement frame2 = driver.findElement(By.id("frame2"));	

driver.switchTo().frame(frame2);

WebElement option = driver.findElement(By.tagName("b"));

System.out.println(option.getText());
}	
}
