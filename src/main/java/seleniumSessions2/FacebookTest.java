package seleniumSessions2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest {
	
	WebDriver driver = null;
	
	
@BeforeMethod	
public void setup() {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
}

@Test
public void pageTitleTest() {
	
String title = driver.getTitle();	
System.out.println(title);	
Assert.assertEquals(title, "Myntra");

	
}
@Test
public void urlTest() {
	String url = driver.getCurrentUrl();
System.out.println(url);


}
	
@Test
public void searchTest() {
	Assert.assertTrue(driver.findElement(By.id("email")).isDisplayed());
}

@AfterMethod
public void tearDown() {
	 
driver.close();	


}
}
