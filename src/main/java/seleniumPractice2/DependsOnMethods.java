package seleniumPractice2;

import org.testng.annotations.Test;

public class DependsOnMethods {

// AAA rule - Tests should be written independently	
	@Test
	public void homePageTest() {
    System.out.println("home page test");
	int i=9/0;
	}
	
	@Test(dependsOnMethods = "homePageTest")
	public void searchTest() {
	System.out.println("search test");	
		
	}

	@Test(dependsOnMethods = "homePageTest")
	public void addToCartTest() {
	System.out.println("add to cart test");
		
	}
	
	
}