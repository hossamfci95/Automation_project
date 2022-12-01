import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select

import dev.failsafe.internal.util.Assert;
import pages.Home_page ;
import pages.Search_Page;


public class Search_test extends Search_Page{
	
	
	driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	Search_Page mysearch=new Search_Page() ;
	
	@Test
	
	public void search() {
	
	mysearch.insert_search("Desktops");
	mysearch.click_search() ;
	

	String success = driver.findElement(By.linkText("Desktops")).getText();
	Assert.assertequals(success,"Desktops");
	}
	
	@Test
	
	public void select_currency() {
	
		Select drpCountry = new Select(driver.findElement(By.id("customerCurrency")));
		drpCountry.selectByVisibleText("Euro");
		
		
	}
	
	@Test
	
	public void select_category() {


		driver.findElements(By.className("menu-toggle"))[1].click();
		driver.findElement(By.linkText("Camera & photo" )).click();

		Camera & photo 
		
		
	}
	
	
	
	

}
