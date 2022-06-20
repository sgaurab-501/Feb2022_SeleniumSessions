package tesNGConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageNegativeTest extends BaseTest{

	@Test
	public void titleTest() {
	driver.get("https://mail.aol.com/");
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
	
Thread.sleep(3000);	

WebDriverWait wait; 





driver.switchTo().frame(0);
driver.findElement(By.cssSelector("input.phone-no")).sendKeys("user@aol.com");
driver.findElement(By.name("signin")).click();

String msg = driver.findElement(By.xpath("//div[@class='writeup sml-txt description']")).getText();
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
