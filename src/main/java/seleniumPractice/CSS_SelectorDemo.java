package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_SelectorDemo {

// CSS is not an attribute
// id --> #id
// class --> .classname
// tagname.classname

//tagname.classname#id
// #id.classname
// tagname#id.classname
//.classname#id
	

static WebDriver driver = null;
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
//	By.cssSelector("#email");
		
// using attribute name
//tag[attr='value']
	
// By.cssSelector("button[type='submit']")	
// input.inputtext#pass

	
// Multiple classes
	
//tag.c1.c2.c3......cn

// By.class("inputtext _55r1 _6luy _9npi"); // cannot use multiple class name under single classname locator

By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"); // correct format as multiple class names can be used with the xpath

// button[type='submit'][name='login'][id='u_0_d_Xx'] // multiple attributes can be used in css





	

}
}
