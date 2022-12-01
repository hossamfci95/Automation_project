import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Registration {
	static WebDriver driver;
	@Test
	public void test() {
		
		driver.findElement(By.linkText("Register")).click();
	}
	
	
	
	@BeforeClass
	public static void open_browser(){
		
		
		System.setProperty("webdriver.chromedriver", ".\\drivers\\chromedriver.exe");
		
		
	}
	
	/*@AfterClass
	public static void close_browser(){
		
		
		driver.close();
	}
*/
}
