package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath2 {

static WebDriver driver = null;
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	By helpLink = By.xpath("((//div[@class='navFooterLinkCol navAccessibility']/ul)[last()]/li)[last()]/a");
String helpText = driver.findElement(helpLink).getText();

// text() function
// htmltag[text()='value']
// text() is not an attribute so we need not write @ symbol
// label[text()='First Name']

By saleLink = By.xpath("//h2[@class='as-title-block-left']/span[contains(text(),'Summer Sale')]");

// contains() with attribute

// htmltag[contains(@attr,'value']

By primeLink = By.xpath("//div[@id='navSwmHoliday']/a[contains(@href,'video')]");

By amazonLink = By.xpath("//a[contains(text(),'Amazon')]");

// contains with text() and attribute

//htmltag[contains(text(),'value') and contains(@attr,'value')]

By browsingList = By.xpath("//div[@class='a-column a-span8']/h2[contains(text(),'Inspired') and contains(@class,'carousel')]");

// starts-with;

By frequentList = By.xpath("//h2[@class='as-title-block-left']/span[starts-with(text(),'Frequently')]");





}
	
}
