package seleniumSessions2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleHandle3 {

	static WebDriver driver = null;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.orangehrm.com/hris-hr-software-demo/");


//	By fblink = By.cssSelector("a.facebook.icon-facebook");
//	By linkedin = By.cssSelector("a.linkedin.icon-linkedin");
//	By twitter = By.cssSelector("a.twitter.icon-twitter");
//	By youtube = By.cssSelector("a..icon-youtube");

   By fblink = By.xpath("//ul[@class='social-links']/li/a[@href='https://www.facebook.com/OrangeHRM']");
   By twitter = By.xpath("//ul[@class='social-links']/li/a[@href='https://www.linkedin.com/company/orangehrm/']");
   By linkedin = By.xpath("//ul[@class='social-links']/li/a[@href='https://twitter.com/orangehrm']");
   By youtube = By.xpath("//ul[@class='social-links']/li/a[@href='https://www.youtube.com/user/orangehrm']");
		   


String fbId = openWindow(fblink);
getWindowTitle(fbId);
driver.navigate().back();

String linkedId = openWindow(linkedin);
getWindowTitle(linkedId);
driver.navigate().back();

String twitId = openWindow(twitter);
getWindowTitle(twitId);
driver.navigate().back();

String tubeId = openWindow(youtube);
getWindowTitle(tubeId);
driver.navigate().back();

	}

public static String getHandle(By locator){
	
	String handle = driver.getWindowHandle();
 return handle;

}

public static void closeWindow(String id)
{
driver.switchTo().window(id);
driver.close();
}
public static void getWindowTitle(String id) {
	driver.switchTo().window(id);
	System.out.println(driver.getTitle());
}

public static String openWindow(By locator) {
	driver.findElement(locator).click();
	return getHandle(locator);
}

}


