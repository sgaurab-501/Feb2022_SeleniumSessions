package tesNGConcept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest {

	
		@Test(priority=1)
		public void orangeTitleTest() {
		driver.get("https://opensource-demo.orangehrmlive.com/");	
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
		
		}

		@Test(priority=2)
		public void orangeUrlTest() {
      String url = driver.getCurrentUrl();
      System.out.println(url);
		Assert.assertTrue(driver.getCurrentUrl().contains("opensource"));
				
		}
		 

}
