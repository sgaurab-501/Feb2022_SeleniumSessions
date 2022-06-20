package seleniumPractice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;

public class RelativeLocator {

static WebDriver driver = null;
public static void main(String[] args) throws Exception {
	
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://www.iqair.com/in-en/india");

Thread.sleep(1500);
driver.findElement(By.xpath("//div[@id='cdk-overlay-0']//div//button/span[contains(text(),'Accept')]")).click();

Thread.sleep(1500);
WebElement city = driver.findElement(By.xpath(" //a[contains(@href,'bahadurgarh')]"));

String airIndex = driver.findElement(with(By.tagName("p")).toRightOf(city)).getText();
System.out.println(airIndex);

String topCity = driver.findElement(with(By.tagName("a")).above(city)).getText();
System.out.println(topCity);


}
}
