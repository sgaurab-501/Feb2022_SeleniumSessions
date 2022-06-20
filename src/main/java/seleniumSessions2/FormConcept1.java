package seleniumSessions2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormConcept1 {

static WebDriver driver = null;

public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://www.formsite.com/templates/human-resources/employment-application-form/");
	driver.findElement(By.xpath("//div[@id='imageTemplateContainer']/img")).click();
	
	
	
}
	
}
