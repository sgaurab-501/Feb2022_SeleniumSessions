package seleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils implements Util {

	public WebDriver driver;
public WebDriver init_driver(String browserName)	{

	//cross browser logic
System.out.println("Browser Name is: "+browserName);	
if (browserName.equalsIgnoreCase(CHROME_BROWSER)) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
}	
else if (browserName.equalsIgnoreCase(FIREFOX_BROWSER)) {
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
}
else if (browserName.equalsIgnoreCase(EDGE_BROWSER)) {
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
}
else {
	System.out.println("Please pass the right browser name: "+ browserName);
}

return driver;
}
	
	@Override
	public void navigateUrl(String url) {
if (url==null) {
	return;
}
if (url.isEmpty()) {
	return;
}
if (url.indexOf("http")==-1 || url.indexOf("https")==-1) {
System.out.println("Please pass the right url, http(s) is missing......");
	return;
	
}
driver.get(url);
	}

	@Override
	public String getPageTitle() {
 String title = driver.getTitle();
 return title;
	
	}

	@Override
	public String getPageUrl() {
 String url= driver.getCurrentUrl();
 return url;		
	}

	@Override
	public String getPageSource() {
	String src = driver.getPageSource();	
	return src;	
	}

	@Override
	public void closeBrowser() {

	driver.close();
		
	}

	@Override
	public void quitBrowser() {
	driver.quit();
		
	}

	@Override
	public void navigateUrl(URL url) {
	
	driver.navigate().to(url);
		
	}

	
	
}
