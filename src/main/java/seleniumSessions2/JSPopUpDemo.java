package seleniumSessions2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSPopUpDemo {

static WebDriver driver = null;
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
 
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.name("proceed")).click();
	
	Thread.sleep(4000);
	
// Akert ckass is used only for Hava scruot pop-up
// cannot inspect the element
// pop up is coming because of alert
// It will freeze the page as well
// It might have some text on it
	
Alert alert = driver.switchTo().alert();
	
String text = alert.getText();
System.out.println(text);	

alert.accept(); // click on OK button ?? accept the alert 
// Pop up methods
// alert("msg")
// prompt("please enter user id")
// confirm("are you sure?")


}
}
