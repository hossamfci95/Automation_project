import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Page {

	protected WebDriver Base_page_driver ;
	
	Base_Page(WebDriver driver){
		
		Base_page_driver =driver ;
	};
	
	
	public void wait_element(WebDriver driver,Duration Time ,By element_name) {
		
		WebDriverWait wait =new WebDriverWait(driver, Time) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(element_name)) ;
	
}
