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
	
		Select drpCurrency = new Select(driver.findElement(By.id("customerCurrency")));
		drpCurrency.selectByVisibleText("Euro");
		
		
	}
	
	@Test
	
	public void select_category() {


		driver.findElements(By.className("menu-toggle"))[1].click();
		driver.findElement(By.linkText("Camera & photo" )).click();

		Camera & photo 
		
		
	}
	
	
	@Test
	public void select_color() {
		driver.get("https://demo.nopcommerce.com/shoes");
		driver.findElement(By.id("attribute-option-14")) .click();
		
	}
	

	@Test
	public void select_Tag() {
		driver.get("https://demo.nopcommerce.com/shoes");
		driver.findElement(By.className("button-2 product-box-add-to-cart-button")).click();
		
	}
	
	
	@Test
	public void select_wishlist() {
		driver.get("https://demo.nopcommerce.com/shoes");
		driver.findElement(By.className("button-2 add-to-wishlist-button")).click();
		
	}
	
	@Test
	public void select_comparelist() {
		driver.get("https://demo.nopcommerce.com/shoes");
		driver.findElement(By.className("button-2 add-to-compare-list-button")).click();
		
	}
	
	@Test
	public void create_order() {
		driver.get("https://demo.nopcommerce.com/shoes");
		driver.findElement(By.className("button-2 product-box-add-to-cart-button")).click();
		
		driver.get("https://demo.nopcommerce.com/cart");
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		wait(20);
		Base_page_driver.findElement("BillingNewAddress_CountryId").sendKeys("Egypt");
		Base_page_driver.findElement("BillingNewAddress_City").sendKeys("Cairo");
		Base_page_driver.findElement("BillingNewAddress_Address1").sendKeys("home");
		Base_page_driver.findElement("BillingNewAddress_ZipPostalCode").sendKeys("12111");
		Base_page_driver.findElement("BillingNewAddress_PhoneNumber").sendKeys("1234567");

		
		Base_page_driver.findElement("button-1 new-address-next-step-button").click();
		wait(20);
		Base_page_driver.findElement("button-1 payment-method-next-step-button").click();
		wait(20)
		Base_page_driver.findElement("button-1 payment-info-next-step-button").click();
		wait(20)
		Base_page_driver.findElement("button-1 payment-info-next-step-button").click();
		wait(20)

		String success = driver.findElement(By.linkText("Click here for order details.")).getText();
		Assert.assertequals(success,"Click here for order details.");
		
		
		






		

		
	}
	
	
	
		}



	
	

}
