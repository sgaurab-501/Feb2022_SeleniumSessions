package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {

	static WebDriver driver = null;
	
	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	ChromeOptions opt = new ChromeOptions();
//--disable-notifications	
	opt.addArguments("--disable-notifications");
	
	driver = new ChromeDriver(opt);
	driver.get("https://www.myntra.com/");
	By forMen = By.xpath("//div[@class='desktop-navLink']/a[@href='/shop/men']");
	
	Actions act = new Actions(driver);
	
	WebElement mensList = getElement(forMen);
	
	act.moveToElement(mensList).build().perform();
	
     Thread.sleep(4000);	
	
	driver.findElement(By.partialLinkText("Sweatshirts")).click();
	
	}
public static WebElement getElement(By locator) {
	return driver.findElement(locator);
}

}
