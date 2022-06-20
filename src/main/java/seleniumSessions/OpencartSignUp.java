package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpencartSignUp {
	
public static void main(String[] args) {
	
	BrowserUtils brUtil = new BrowserUtils();

	WebDriver driver =  brUtil.init_driver("chrome");
	   brUtil.navigateUrl("https://www.opencart.com/index.php?route=account/register");	
	   System.out.println(brUtil.getPageTitle());
	   System.out.println(brUtil.getPageUrl());
	   
// By Locator object repository
  
	By uname = By.name("username"); 
	By fname = By.name("firstname");
	By lname = By.name("lastname");
    By email = By.name("email");
    
 ElementUtil elu = new ElementUtil(driver);   
 elu.doSendKeys(fname, "Mohan");
 elu.doSendKeys(lname, "Kumar");
 elu.doSendKeys(uname, "mohan_kumar111");
 elu.doSendKeys(email, "mohan@aol.com");



}	
}
