package seleniumPractice;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath3 {
static WebDriver driver = null;
public static void main(String[] args) throws Exception {
 WebDriverManager.chromedriver().setup();
ChromeOptions opt = new ChromeOptions();
opt.addArguments("--disable-notifications");	
driver = new ChromeDriver(opt);
driver.manage().window().maximize(); 
driver.get("https://www.espncricinfo.com/live-cricket-score");
  
//  driver.get("https://www.espncricinfo.com/");
//  Actions act = new Actions(driver);
  
//  By live = By.xpath("//div[@class='ds-popper-wrapper']/a[contains(text(),'Live')]");
//  WebElement scores = driver.findElement(live);
//  act.moveToElement(scores).build().perform();
//  
//  driver.findElement(By.partialLinkText("Live Scores Home")).click();
  
Thread.sleep(12000);
//  driver.findElement(By.xpath("//div[@class='wzrk-alert wiz-show-animate']/div/button[@id='wzrk-cancel']")).click();
 
 driver.findElement(By.xpath("//div[@class='ds-flex ds-items-center']/p[contains(text(),'Rajasthan')]")).click();
 
 List<WebElement> data = driver.findElements(By.xpath("//span[contains(text(),'DC')]/../../parent::td/following-sibling::td"));
 for(WebElement e: data) {
	 String text = e.getText();
	 System.out.println(text);
 }
}
	
	
	
	
	
//	By forgot = By.xpath("//div[@class='form-group']/div/a[starts-with(text(),'Forgot')]");
	
	
}
