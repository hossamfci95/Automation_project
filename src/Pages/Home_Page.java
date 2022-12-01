import org.openqa.selenium.By;

public class Home_Page extends Base_Page{
	
	
	public Home_Page(WebDriver driver) {
		super (driver) ;
	}

	private By Register_Link =By.linkText("Register");
	private By Login_Link =By.linkText("Login");
	
	
	public void click_Register () {
		wait_element(driver,20,Register_Link);
		Base_page_driver.findElement(Register_Link).click();
	};
	
	public void click_Login () {
		wait_element(driver,20,Login_Link);
		Base_page_driver.findElement(Login_Link).click();
	};
}
