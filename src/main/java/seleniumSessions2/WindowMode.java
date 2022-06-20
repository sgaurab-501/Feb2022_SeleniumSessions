package seleniumSessions2;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowMode {

static WebDriver driver = null;

public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//    driver.manage().window().fullscreen();
    
	Dimension dim = new Dimension(500, 700);
	
	
//    driver.manage().window().setSize(500);
	
	driver.get("https://www.bing.com/");
	
	
}
	
}
