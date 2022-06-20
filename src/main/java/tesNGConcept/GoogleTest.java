package tesNGConcept;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	@Test(priority=1)
	public void googleTitleTest() {
	driver.get("https://www.google.com/");
	String title = driver.getTitle();
	System.out.println(title);
	
	Assert.assertEquals(title, "Google");
	
	}

	@Test(priority=2)
	public void googleUrlTest() {
  String url = driver.getCurrentUrl();
  System.out.println(url);
	AssertJUnit.assertEquals(url, "https://www.google.com/");
			
	}
	
	
}
