package util.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinks {

	static WebDriver driver = null;
	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://www.freshersworld.com/");
	By footer = By.xpath("//div[@class='menu-footer display-flex']//ul[@class='list-grp']//a");
	
	clickOnElement(footer, "Railway Recruitment");
	
		}

	public static void clickOnElement(By locator, String value)
{
	
List<WebElement> eleList = driver.findElements(locator);

for(WebElement e: eleList) {
	
	String text = e.getText();
		
	if(text.contains(value)) {
		e.click();
     System.out.println("You have clicked on: "+ text);	
		break;
		
	}

        
}

	
	
	
}

}
