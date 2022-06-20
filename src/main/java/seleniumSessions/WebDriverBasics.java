package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// WebDriver: automation tool / library
// test client: TestNG -- test cases
// PHP: PHPUnit, C#, NUnit, Python: Pytest, JS: Jasmine, Mocha
// cross browser: chrome, firefox, edge, safari, opera, ie
// open source: free 
// OS: Mac, Windows, Linux
// Selenium is only for web automation: It does not support any desktop application
// It should not be used for performance testing as well
// java, c#, ruby, golang, python
public class WebDriverBasics {
	
public static void main(String[] args) {

// setup binary file: chromedriver.exe -- mac/win/linux
// Google --> Chromium
	
 System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
 
 // ChromeDriver is a class, driver is the interface type object reference variable
 WebDriver driver = new ChromeDriver();
 
 driver.get("https://www.google.com/");// launch chrome
 String title = driver.getTitle();// launch url
System.out.println(title);// get the title

//Validation/checkpoints/actual vs expected result

if (title.equalsIgnoreCase("google")) {
	
System.out.println("correct title");	
}
else {
	System.out.println("incorrect title");
}

//Automation steps(written with selenium) + validation/checkpoint(written with java) --> Automation testing

String url = driver.getCurrentUrl();
System.out.println(url);

driver.quit();//close the browser
}
}
