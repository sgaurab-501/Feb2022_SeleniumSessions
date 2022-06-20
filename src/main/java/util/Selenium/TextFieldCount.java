package util.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextFieldCount {

static WebDriver driver = null;	
public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://fluentforms.com/forms/contact-form-demo/");
	
	By txtfield = By.className("ff-el-form-control");
	ElementUtil elu = new ElementUtil(driver);
 int txt_count = elu.getElementsCount(txtfield);
	
	System.out.println("Text field count: "+ txt_count);
	
	
}		
}
