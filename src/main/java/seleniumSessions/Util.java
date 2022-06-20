package seleniumSessions;

import java.net.URL;

public interface Util {

String CHROME_BROWSER = "chrome";
String FIREFOX_BROWSER = "firefox";
String EDGE_BROWSER = "edge";
	
	public void navigateUrl(String url);
	public void navigateUrl(URL url);
	
	public String getPageTitle();
	public String getPageUrl();
	public String getPageSource();
	public void closeBrowser();
	public void quitBrowser();
	
}
