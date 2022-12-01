import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page {

public Register_Page(WebDriver driver) {
		
		
		
		super(driver);
	}

	
	private By email =By.id("Email");
	private By password =By.id("Password");
	private By remember =By.id("RememberMe");
	
	private By Login_button =By.className("button-1 login-button");
	
	
public void insert_email(string myemail) {
		
		
		wait_element(Base_page_driver,20,email);
		Base_page_driver.findElement(email).clear();

		Base_page_driver.findElement(email).sendkeys(myemail);
	}
	
public void insert_fname(string mypassword) {
		
		
		wait_element(Base_page_driver,20,first_Name);
		Base_page_driver.findElement(first_Name).clear();
		Base_page_driver.findElement(password).sendKeys(mypassword);
		
		
	}
public void click_remember() {
	
	
	Base_page_driver.findElement(remember).click();
}

public void click_login() {
	
	
	
	Base_page_driver.findElement(Login_button).click();
}
	
}
