package util.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageCount {
	
// find the total no. of images on the page -- print count of links
// print the src/alt of each image on the console
	
static	WebDriver driver = null;
public static void main(String[] args) {
	
	

WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");

//List <WebElement> imgList = driver.findElements(By.tagName("img"));
//System.out.println("Total no. of images: "+imgList.size());

//for(WebElement e: imgList) {
//	
//	String srcVal = e.getAttribute("src");
//	String altVal = e.getAttribute("alt");
//	String htVal = e.getAttribute("height");
//	
//	System.out.println(srcVal);
//	System.out.println(altVal);
//    System.out.println(htVal);

By images = By.tagName("img");
By links = By.tagName("a");

int img_count = getElementsCount(images);
int link_count = getElementsCount(links);


System.out.println("Image count: "+img_count);
System.out.println("Links count: "+link_count);    
    
}


public static int getElementsCount(By locator) {
	
return driver.findElements(locator).size();
}
public static List<WebElement> getElements(By locator){
	
	return driver.findElements(locator);
}
}

