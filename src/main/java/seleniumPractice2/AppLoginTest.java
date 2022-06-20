package seleniumPractice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppLoginTest {
	
	WebDriver driver;
	
@BeforeTest
public void saetup()
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.opencart.com/index.php?route=account/login");
}

@Test
public void titleTest() {
	String title = driver.getTitle();
	System.out.println("Page title is: "+title);
Assert.assertEquals(title, "Account Login");

}

@Test
public void urlTest() { // best practice to write one assertion per test
	
String url = driver.getCurrentUrl();
System.out.println(url);

Assert.assertTrue(url.contains("account/login"));

}
	@AfterTest
	public void tearDown() throws Exception {
	Thread.sleep(1500);
	driver.close();	
		
	}
	
	
}
