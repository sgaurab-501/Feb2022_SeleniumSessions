package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeLaunch {

public static void main(String[] args) {
	
WebDriverManager.edgedriver().setup();

WebDriver driver = new EdgeDriver();

driver.get("https://www.google.com/");
String title = driver.getTitle();
System.out.println(title);

//Validation/Checkpoint/act vs exp result

if (title.equalsIgnoreCase("google")) {
	
	System.out.println("correct title");
}
else {
	System.out.println("incorrect title");
}

// Automation steps (Selenium) + Validation/Checkpoint (Java/TestNG Assertions) -----> Automation Testing


}
}
