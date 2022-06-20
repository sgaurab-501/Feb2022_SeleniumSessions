package seleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandle {

static WebDriver driver = null;
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://www.globalsqa.com/demo-site/datepicker/");
	Thread.sleep(1500);
	
WebElement frame = driver.findElement(By.cssSelector("iframe.lazyloaded"));	
	driver.switchTo().frame(frame);
driver.findElement(By.xpath("//input[@id='datepicker']")).click();
//selectFutureDate("August 2022", "35");
selectPastDate("March 2020", "22");

}



// 15 = dateNum


public static void selectFutureDate(String expMonYear, String dateNum) {
	
	String currMonYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
	System.out.println(currMonYear);	
    WebElement currDate = driver.findElement(By.cssSelector("a.ui-state-highlight"));
    
		
	if(Integer.parseInt(dateNum)>31) {
	System.out.println("wrong date passed......please enter right date");
	return;
	
	}
	
	if(expMonYear.contains("February") && Integer.parseInt(dateNum)>29) {
		System.out.println("wrong date passed......please enter right date");
		return;	
	}
	
	
	
	while(!currMonYear.equalsIgnoreCase(expMonYear)) {
		// click on 'Next' button
	driver.findElement(By.xpath("//a/span[contains(text(),'Next')]")).click();
	currMonYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
	}
		
		driver.findElement(By.xpath("//a[contains(text(),'"+dateNum+"')]")).click();	
			
	}

public static void selectPastDate(String expMonYear, String dateNum) {
	
	String	currMonYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
	while(!currMonYear.equalsIgnoreCase(expMonYear)) {
		// click on 'Next' button
	driver.findElement(By.xpath("//a/span[contains(text(),'Prev')]")).click();
	currMonYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
	}
		
		driver.findElement(By.xpath("//a[contains(text(),'"+dateNum+"')]")).click();	
			
	}



}