package seleniumSessions2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectUtil {

 static WebDriver driver = null;
 public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
By cntDrop = By.xpath("//Select[@name='Country']/option");	
WebElement cntList = driver.findElement(cntDrop); 

Select slct = new Select(cntList);


}
	

}
