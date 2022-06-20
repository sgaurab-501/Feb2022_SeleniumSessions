package tesNGConcept;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class cartTitleTest extends BaseTest {

	@Test(priority=1)
	public void titleTest() {
	driver.get("https://demo.opencart.com/");
	String title = driver.getTitle();
	System.out.println(title);
	
	AssertJUnit.assertEquals(title, "Google");
	
	}

	@Test(priority=2)
	public void urlTest() {
  String url = driver.getCurrentUrl();
  System.out.println(url);
	AssertJUnit.assertEquals(url, "https://www.google.com/");
			
	}
	
	@Test
	public void searchTest() {
		
	Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());
		
		
	}
	
	
	
}
