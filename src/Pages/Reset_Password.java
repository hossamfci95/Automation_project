import org.openqa.selenium.By;

public class Reset_Password extends Base_Page{
	
	
	private By email =By.id("Email");
	
	
	private By Recover_button =By.name("send-email");
	
	
public void insert_email(string myemail) {
		
		
		wait_element(Base_page_driver,20,email);
		Base_page_driver.findElement(email).clear();

		Base_page_driver.findElement(email).sendkeys(myemail);
	}

public void click_recover() {
	
	

	Base_page_driver.findElement(email).click();
}

}
