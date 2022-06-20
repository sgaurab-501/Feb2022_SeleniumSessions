package seleniumSessions2;

import org.testng.annotations.Test;

public class PriorityBasedTC {

@Test
public void aTest() {
System.out.println("a test");	
	
}
	@Test(priority=2)
	public void bTest() {
		System.out.println("b test");		
	}
	
@Test(enabled=false, priority = 1)
public void cTest() {
	System.out.println("c test");		
}

@Test
public void dTest() {
	System.out.println("d test");	
}

@Test(priority=1)
public void eTest() {
	System.out.println("e test");	
}


}


