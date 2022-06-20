package tesNGConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginNegativeTest extends BaseTest {

	@Test
	public void titleTest() {
	driver.get("http://demowebshop.tricentis.com/login");
   String title = driver.getTitle();
	System.out.println(title);		
	}
	
	@Test
	public void urlTest() {
    String url = driver.getCurrentUrl();
    System.out.println(url);
    
	}

@Test
public void loginTest() throws Exception {
	
Thread.sleep(1500);

driver.switchTo().frame(0);
driver.findElement(By.id("Email")).sendKeys("user@gmail.com");
//
////driver.findElement(By.xpath("/html/body//form//input[@id='Email']")).sendKeys(username);
//driver.findElement(By.id("Password")).sendKeys("abcd123");

String msg = driver.findElement(By.xpath("//div[@class='message-error']/div/span")).getText();
System.out.println(msg);
Assert.assertTrue(msg.contains("account has been deactivated"));


}
@Test
public Object[][] getLoginData() {
	
	return new Object[][] {
		{"user@gmail.com", "user@123"},
		{"user@yahoo.com", "pass@123"},
		{"user@aol.com", "abcd@1234"},
	};
	
}

}
	
