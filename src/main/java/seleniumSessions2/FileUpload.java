package seleniumSessions2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	static WebDriver driver = null;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        
		driver.get("https://www.filemail.com/share/upload-file");
	
		WebElement fileUpload = driver.findElement(By.xpath("//div[@class='uploader-btn-wrap']/label/input[@type='file']"));
	     fileUpload.sendKeys("C:\\Users\\lenovo\\Pictures\\Window 10 Key.JPG");
		
		
}
}