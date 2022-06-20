package testNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

// global pre condition
// login page --> normal pre condition
// create a user test + act vs exp result
// logout
// close the browser

 /*
	BS -- connect with db
	BT -- create user
	BC -- launch browser

     	BM -- login to app
	    Test -- home page title
	    AM -- user is logged out

	    BM -- login to app
	   Test -- home page url
	    AM -- user is logged out

	   BM -- login to app
	   Test -- is user logged in?
	   AM -- user is logged out

AC -- close the browser
AT -- delete user
AS	
 
 */
	
@BeforeSuite
public void connectWithDB() {
	
System.out.println("BS -- connect with db");	
	
}

@BeforeTest
public void createUser() {
	
System.out.println("BT -- create user");	
}

@BeforeClass
public void launchBrowser() {
System.out.println("BC -- launch browser");	
}
@BeforeMethod
public void loginToApp() {
	System.out.println("BM -- login to app");
}

@Test
public void bhomePageTitle() {
	System.out.println("Test -- home page title");
	
}
@Test
public void ahomePageUrl() {  // test method is executed alphabetically
	System.out.println("Test -- home page url");
}

@Test
public void isUserLoggedInTest() {
	System.out.println("Test -- is user logged in?");
	
}

@AfterMethod
public void logout() {
	System.out.println("AM -- user is logged out");
}
@AfterClass
public void closeBrowser() {
	System.out.println("AC -- close the browser");
}

@AfterTest
public void deleteUser() {
	System.out.println("AT -- delete user");
}

@AfterSuite
public void disconnectDB() {
	System.out.println("AS -- disconnect from db");
	
}

}