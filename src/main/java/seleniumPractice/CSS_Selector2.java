package seleniumPractice;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_Selector2 {

	static WebDriver driver = null;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.freshersworld.com/");
		
// div.jobs_by_categoery_list1 ul li:nth-of-type(2) -- specific index
				
// div.jobs_by_courses_list1 ul li:nth-of-type(n) -- all values
	
//	input#keyword,input[placeholder='Keyword']	
	
// input#keyword, select[name='course'],input[id='job_location']
		
List<WebElement> fields = driver.findElements(By.cssSelector("input#keyword,"
		+"select[name='course'],"+"input[id='job_location']"));	

System.out.println(fields.size());

// xpath                             css
// 1. syntax is complex         simple
// 2. performance                good  
// 3. backward traversing       not possible
// 4. sibling                   immediate forward sibling only
// 5. ancestor tag               no
// 6. comma not available       yes
// 7. index better              nth-of-type with limited options
// 8. Web table: better handling   not much options available
// 9. SVG elements: yes           NA
// 10. shadow dom: NA            yes
// 11. Relative locators
	}
}
