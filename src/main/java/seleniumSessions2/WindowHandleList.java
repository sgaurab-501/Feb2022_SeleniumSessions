package seleniumSessions2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleList {

static WebDriver driver = null;
public static void main(String[] args) throws Exception {

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://www.freshersworld.com/");
By facebook = By.xpath("//div[@class='inline-block margin-top-13']/a[@href='https://www.facebook.com/freshersworld']");
By tubeId = By.xpath("//div[@class='inline-block margin-left-9 margin-top-13']/a[@href='https://www.youtube.com/freshersworld']");
By linkedin = By.xpath("//div[@class='inline-block margin-left-9 margin-top-13']/a[@href='https://www.linkedin.com/company/freshersworld-com']");
By twitter = By.xpath("//div[@class='inline-block margin-left-9 margin-top-13']/a[@href='https://twitter.com/freshersworld']"); 

clickLink(facebook);
clickLink(twitter);
clickLink(linkedin);
clickLink(tubeId);


Set<String> handles = driver.getWindowHandles();

//set to List

List<String> winList = new ArrayList<String>(handles);

String prntWindow = winList.get(0);
String child1 = winList.get(1);
String child2 = winList.get(2);;
String child3 = winList.get(3);
String child4 = winList.get(4);

switchWindow(child1);
System.out.println(driver.getTitle());

driver.close(); // close the child window

switchWindow(child2);
getPageTitle(child1);
driver.close();


switchWindow(child3);
getPageTitle(child3);
driver.close();

switchWindow(child4);
getPageTitle(child4);
driver.close();

switchWindow(prntWindow);

Thread.sleep(4000);
driver.close(); // close the parent window

}
public static void clickLink(By locator) {
	driver.findElement(locator).click();
}

public static void switchWindow(String id) {
	driver.switchTo().window(id);
}
public static void getPageTitle(String id) {
	System.out.println(driver.getTitle());
	
}


}