package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMSignUp {

	
	public static void main(String[] args) {
		
	
BrowserUtils brUtil = new BrowserUtils();

WebDriver driver =  brUtil.init_driver("chrome");
   brUtil.navigateUrl("https://www.orangehrm.com/hris-hr-software-demo/");	
   System.out.println(brUtil.getPageTitle());
   System.out.println(brUtil.getPageUrl());
   
// By Locator object repository
   
   By fname = By.name("FirstName");
   By lname = By.name("LastName");
   By email = By.name("Email");	
   By phone = By.name("Contact");	
   
ElementUtil elu = new ElementUtil(driver);	
elu.doSendKeys(fname, "Ram");
elu.doSendKeys(lname, "Kumar");
elu.doSendKeys(email, "ram@gmail.com");
elu.doSendKeys(phone, "123456");
	
//brUtil.quitBrowser();	
	
	
}
}
