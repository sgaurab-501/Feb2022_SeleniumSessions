package seleniumPractice2;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	String name = "abc";
@Test(priority = 1,  expectedExceptions = {NullPointerException.class, ArithmeticException.class})
public void searchTest() {
	System.out.println("Refrigerator");
//	int i=9/0;

ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
obj = null;
System.out.println(obj.name); //NullPointerException

}

@Test(expectedExceptions = Exception.class)
public void print() {
	System.out.println(name);
}

}