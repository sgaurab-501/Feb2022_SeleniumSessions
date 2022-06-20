package seleniumPractice2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JSUtil {

	WebDriver driver;
	
	public JSUtil(WebDriver driver) {
	this.driver = driver;	
		
	}
	
public String getTitleByJavascript() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
  return js.executeAsyncScript("return document.title").toString();
    	
	
}

public void refresPageByJS() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeAsyncScript("history.go(0)").toString();


}
public void  backByJS() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeAsyncScript("history.go(-1)").toString();

}

public void forwardByJS() {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeAsyncScript("history.go(1)").toString();
	
	
	}
public void  generateAlert(String message) {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeAsyncScript("alert('"+message+"')").toString();
	
}

public String getInnerText() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
  return js.executeAsyncScript("return document.documentElement.innerText").toString();


}
}
