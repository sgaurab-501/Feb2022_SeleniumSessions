package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling1 {

	static WebDriver driver = null;
	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--disable-notifications");
		
	driver = new ChromeDriver(opt);
	
	
	driver.get("https://www.irctc.co.in/nget/train-search");

	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@class='text-center col-xs-12']/button[@type='submit']")).click();
    
	
	
	System.out.println(driver.getTitle());

	
 
    
    
	}
}
