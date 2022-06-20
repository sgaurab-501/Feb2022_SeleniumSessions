package seleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddExtension {

	static WebDriver driver = null;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");	
		driver = new ChromeDriver(opt);
	
		driver.get("https://chrome.google.com/webstore/detail/google-translate/aapbdbdomjkkjkaonfhkkikfgjllcleb");
		Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@class='g-c-Hf']/div/div[contains(text(),'Add')]")).click();
//	    driver.switchTo().alert().dismiss(); // NoAlertPresentException
        
        
	}
	
	
}
