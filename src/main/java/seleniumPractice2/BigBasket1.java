package seleniumPractice2;

import org.openqa.selenium.By;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasket1 {
static WebDriver driver = null;

public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
    	driver.get("https://www.bigbasket.com/");

WebElement maincat = driver.findElement(By.cssSelector("a.meganav-shop"));

Actions act = new Actions(driver);
act.moveToElement(maincat).perform();

Thread.sleep(1000);
List<WebElement> l1 = driver.findElements(By.xpath("//ul[@id='navBarMegaNav']/li/a"));


for(WebElement e1: l1 ) {

act.moveToElement(e1).perform();	
String text1 = e1.getText();	
System.out.println(text1);

//List<WebElement> l2 = driver.findElements(By.xpath("//ul[@class='nav nav-pills nav-stacked']/li/a"));

List<WebElement> l2 = driver.findElements(By.xpath("(//ul[contains(@class,'nav-stacked')])[last()]/li/a"));

for(WebElement e2: l2) {
act.moveToElement(e2).perform();
String text2 = e2.getText();
System.out.println(text1);

List<WebElement> l3 = driver.findElements(By.xpath("(//ul[@class='list-unstyled'])[last()-1]/li/a"));

for(WebElement e3: l3) {
	
act.moveToElement(e3).perform();
String text3 = e3.getText();
System.out.println(text2);

//List<WebElement> l4 = driver.findElements(By.xpath("(//ul[@class='list-unstyled'])[last()]/li/a"));
//
//for(WebElement e4: l4) {
//act.moveToElement(e4).perform();
//
//String text4 = e4.getText();
//System.out.println(text4);


}
}
}

}
}