package seleniumPractice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocator1 {

static WebDriver driver = null;
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://demo.opencart.com/index.php?route=account/register");
	
	
	
	
	
	
}
}
