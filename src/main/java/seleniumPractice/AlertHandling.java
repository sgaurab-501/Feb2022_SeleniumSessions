package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	static WebDriver driver = null;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(4000);
     driver.findElement(By.xpath("//div[@class='wzrk-alert wiz-show-animate']/div[@class='wzrk-button-container']/button[@class='No thanks']")).click();
     
     System.out.println(driver.getTitle());
	
     driver.close();
     
     
	}
	
	
	
}
