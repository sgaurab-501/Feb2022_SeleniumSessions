package seleniumSessions;

import org.openqa.selenium.WebDriver;

public class OpencartRegister {

public static void main(String[] args) {
	
	BrowserUtils brUtil = new BrowserUtils();

	WebDriver driver =  brUtil.init_driver("chrome");
	   brUtil.navigateUrl("https://www.opencart.com/index.php?route=account/register");	
	   System.out.println(brUtil.getPageTitle());
	   System.out.println(brUtil.getPageUrl());
	   
// String Locators
	
 String uname = "username";	   
 String fname = "firstname";
 String lname = "lastname";
 String email = "email";
	   
 ElementUtil elu = new ElementUtil(driver);
 
 elu.doSendKeys(elu.getBy("name", uname), "skumar111");
 elu.doSendKeys(elu.getBy("name", fname), "Shyam");
elu.doSendKeys(elu.getBy("name", lname), "Kumar");
elu.doSendKeys(elu.getBy("name", email), "skumar@gmail.com");


}
}
