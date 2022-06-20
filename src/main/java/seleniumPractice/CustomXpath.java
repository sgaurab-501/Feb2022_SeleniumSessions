package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath {

// xpath: address of the element in DOM
// absolute xpath: /html/body/div[1]/div[2]....
// relative xpath: custom xpath: 
	
// html tag[@attribute='value']
	static WebDriver driver = null;
	
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.zoho.com/forms/");
	
//	By name = By.xpath("//input[@id=\"input-email\"]");
		
By cmpname = By.xpath("//input[@class='sgnemail' and @name='r_account.account_name']");			
	
By email = By.xpath("//input[@class='sgnemail' and @name='email']");

By signUp = By.xpath("//input[@type='submit' and @value='Sign Up for Free']");

//htmltag[contains(text(),'value') and contains(@attr,'value')] // Always use @ with an attribute name e.g. @id, @class, @href etc. in xpath


}
} 