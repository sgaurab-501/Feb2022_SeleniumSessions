package seleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendkeysWithCharSequence {

	static WebDriver driver = null;
	
	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://formsmarts.com/registration-form-demo");
	
	
	String str1 = "Ram";
	String str2 = "admin";
	StringBuilder str3 = new StringBuilder("automation");
	StringBuffer str4 = new StringBuffer("practice");
	
WebElement frm = driver.findElement(By.xpath("//iframe[@class='fs_embed']"));	
	driver.switchTo().frame(frm);
	
	
	driver.findElement(By.xpath("//input[@id='u_YNm_45390']")).sendKeys(str1+" "+str2+" "+str3+" "+str4);
	
	
	}
	
}
