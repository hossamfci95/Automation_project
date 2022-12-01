import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dev.failsafe.internal.util.Assert;
import pages.Home_page ;
import pages.Login_Page ;

@test
public class Login_test  extends Login_Page {

	Login_Page mylogin=new Login_Page() ;
	
	WebDriver driver ;
	
	public void Login() {
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
		mylogin.insert_email("hossam@hotmail.com");
		mylogin.insert_password("123456");
		mylogin.click_remember();
		mylogin.click_login();
		String success = driver.findElement(By.linkText("My account")).getText();
		Assert.assertequals(success,"My account");
		
	}
}
