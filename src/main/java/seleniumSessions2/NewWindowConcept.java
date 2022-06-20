package seleniumSessions2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowConcept {
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.wisdomjobs.com/freshers-world");
		String prnt = driver.getWindowHandle(); // parent window handle
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(prnt);
		
		
		
		
		
		
		
		
	}
	

}
