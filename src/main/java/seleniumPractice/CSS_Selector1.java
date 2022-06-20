package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_Selector1 {

	static WebDriver driver = null;
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
    
	driver.get("https://app.hubspot.com/login");
	
// input[class*='login-email'] -- css contains
// input[class^='form-control'] -- css starts with
// button[class$='private-button--default'] -- css ends with	
	
// parent to child
// div.google-login-wrapper > a.google-sign-in > span.buttonText
	
// form#loginForm > input --- 0 (only direct child elements)
// form#loginForm input --- 3 (direct + indirect child elements)
	
// div.page div -- 24
// div.papge > div -- 2
	
// child to parent: not supported by css
	
// following sibling in css
	
// div.private-form__input-wrapper + div
	
// ui.footer-nav > li:nth-of-type(2)	
	
	
	}
}
