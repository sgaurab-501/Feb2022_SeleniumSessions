package seleniumPractice2;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 5)
	public void createUserTest() {
	
	System.out.println("create user test");	
	}
	
}
