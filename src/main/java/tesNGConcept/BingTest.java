package tesNGConcept;

import org.testng.annotations.Test;

public class BingTest extends BaseTest  {

	@Test
	public void pageTitleTest() {
	driver.get("https://www.bing.com/");
	String title = driver.getTitle();
	System.out.println(title);
	}

	@Test
	public void urlTest() {
	System.out.println(driver.getCurrentUrl());
	}
	 
	
}
