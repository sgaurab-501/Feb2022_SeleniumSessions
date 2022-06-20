package seleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

public class AmazonTest {

public static void main(String[] args) {
	
BrowserUtils brutil = new BrowserUtils();
brutil.init_driver("chrome");
brutil.navigateUrl("https://www.amazon.in/");

URL url;
try {
	url = new URL("https://www.amazon.in/");
	brutil.navigateUrl(url);
} catch (MalformedURLException e) {
	
	e.printStackTrace();
}


String actTitle = brutil.getPageTitle();
System.out.println(actTitle);

if (actTitle.contains("Amazon")) {
	System.out.println("correct title");
}
else {
	System.out.println("incorrect title");
}
	
System.out.println(brutil.getPageSource().contains("Actionable Analytics"));
System.out.println(brutil.getPageUrl().contains("https://www.amazon.in/"));
brutil.closeBrowser();

}
}

