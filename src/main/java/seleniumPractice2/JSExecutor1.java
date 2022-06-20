package seleniumPractice2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class JSExecutor1 {

	static WebDriver driver = null;
	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
//	driver.get("https://twitter.com/"); // ScriptTimeoutExcepption
    
	driver.get("https://in.search.yahoo.com/?fr2=inr");
	
	JSUtil jsu = new JSUtil(driver);
	
	
	
	String title = jsu.getTitleByJavascript();
	System.out.println(title);
	
	jsu.refresPageByJS();
	}
	
    

}
