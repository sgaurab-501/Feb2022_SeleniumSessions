package seleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JScriptUtil {
	
	WebDriver driver;
	
	
	public JScriptUtil(WebDriver driver) {
		this.driver = driver;
	}
	public String getTitleByJS() {
     
	JavascriptExecutor js = (JavascriptExecutor) driver;
	return js.executeScript("return document.title").toString();
	
	}

public void refreshByJs() {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeAsyncScript("history.go(0)");
	
}


}