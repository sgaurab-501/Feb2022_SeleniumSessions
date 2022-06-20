package seleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath1 {

static WebDriver driver = null;
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://www.opencart.com/index.php?route=account/register");
	
//	By uname = By.xpath("(//input[@class='form-control'])[1]");

// contains with attributes
//htmltag[contains(@attr,'value')]
// whenever you have dynamic attributes
// input id = 'email_122'
// input id = 'email_444'

// input[contains(@id,'email')]
	
// contains() with text();
	
// fetch all the links that contain a particular text e.g. Amazon
// htmltag[contains(text(),'value')]
	
	
	
	
	
By uname = By.xpath("(//input[@class='form-control'])[position()=1]");	
By email = By.xpath("(//input[@class='form-control'])[last()-2]");
	
By firstName = By.xpath("//input[@type='text' and contains(@placeholder,'First')]");


}
	
}
