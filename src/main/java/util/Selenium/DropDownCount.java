package util.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownCount {

	
	static WebDriver driver = null;
	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();	
		
	driver = new ChromeDriver();
	driver.get("https://twitter.com/");
	
	driver.findElement(By.partialLinkText("/i/flow/signup")).click();
	By dropDown = By.className("r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-18jsvk2 r-1loqt21 r-37j5jr r-1inkyih r-rjixqe r-crgep1 "
			+ "r-1wzrnnt r-1ny4l3l r-t60dpp r-xd6kpl r-1pn2ns4 r-ttdzmv");
	
	ElementUtil elu = new ElementUtil(driver);
	
	int drop_count = elu.getElementsCount(dropDown);
	
	System.out.println("Dropdown on page: "+drop_count);
	
	
	}
}
