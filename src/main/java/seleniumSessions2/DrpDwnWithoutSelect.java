package seleniumSessions2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrpDwnWithoutSelect {
	static WebDriver driver = null;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
	List<String> values = new ArrayList<String>();	
		By countryList = By.xpath("//Select[@name='Country']/option");
	List<WebElement> countries = driver.findElements(countryList);

	System.out.println("----------Text-------------");	 
	 for(WebElement e: countries) {
	   
	 String text = e.getText(); 
	 values.add(text);

	 System.out.println(text); 
	if(text.contains("India")) {
	e.click();
		break;
	}
	 }
		
		
		
	}

}
