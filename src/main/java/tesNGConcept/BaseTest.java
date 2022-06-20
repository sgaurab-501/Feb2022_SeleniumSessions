package tesNGConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

// TestNG, JUnit --> Java unit testing framework
// pytest, unittest --> python
// NUnit --> c#
// Mocha, Jasmine --> Javascript


public class BaseTest {

public static WebDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//	   driver.get("https://opensource-demo.orangehrmlive.com/");

	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}	

// CRUD
// create a user: abc
// update the user --> create user --> user id --> update user --> check user is updated
// delete the user --> create user --> user id --> delete user --> check user is deleted
// get the user --> create user --> user id --> get the user
	
	
}
