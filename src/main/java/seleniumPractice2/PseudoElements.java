package seleniumPractice2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PseudoElements {
static WebDriver driver = null;
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://demo.opencart.com/index.php?route=account/register");
    
// ::before, ::after --> css pseudo classes 	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
//window.getComputedStyle(document.querySelector("label[for='input-firstname']"),'::beore').getPropertyValue('content')	
	
}
	
}
