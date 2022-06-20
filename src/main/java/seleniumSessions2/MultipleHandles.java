package seleniumSessions2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleHandles {

static WebDriver driver = null;
	
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://in.nec.com/");
	String prntId = driver.getWindowHandle();
    System.out.println(driver.getTitle());
    
    Thread.sleep(4000);
	
	driver.findElement(By.xpath("//ul[@class='list']//a/img[@alt='Facebook']")).click();
	driver.findElement(By.xpath("//ul[@class='list']//a/img[@alt='Twitter']")).click();
	driver.findElement(By.xpath("//ul[@class='list']//a/img[@alt='LinkedIn']")).click();
	driver.findElement(By.xpath("//ul[@class='list']//a/img[@alt='YouTube']")).click();
	
	Set<String> handles = driver.getWindowHandles();
	
	Iterator<String> itr = handles.iterator();
    
    while(itr.hasNext()) {
    	String winId = itr.next();
        if(winId!=prntId) {
        driver.switchTo().window(winId);	
        String text = driver.getTitle();
        System.out.println(text);
        driver.close();     
        }
        
        driver.switchTo().window(prntId);
        
        }
    
    
    }
}

