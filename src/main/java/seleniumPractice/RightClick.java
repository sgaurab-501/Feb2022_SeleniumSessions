package seleniumPractice;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

static WebDriver driver = null;

public static void main(String[] args) {
	
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

By icon = By.xpath("//p/span[@class='context-menu-one btn btn-neutral']");
doRightClick(icon);

List<WebElement> options = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]"));

for(WebElement e: options) {
	e.click();
	alertHandle();
	doRightClick(icon);
	
}



}

public static void alertHandle() {

Alert alt = driver.switchTo().alert();
alt.accept();
}

public static void doRightClick(By locator) {
	WebElement clickEle = driver.findElement(locator);
    Actions act = new Actions(driver);
    act.contextClick(clickEle).perform();
   

}

}

