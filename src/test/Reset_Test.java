import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import pages.Home_page ;
import pages.Reset_Password;

public class Reset_Test extends Reset_Password{
	
Reset_Password myreset=new Reset_Password() ;
	
@test
public void reset() {
	
	driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/passwordrecovery");
	
	myreset.insert_email("hossam@hotmail.com");
	myreset.click_recover();

	String success = driver.findElement(By.className("content")).getText();
	Assert.assertequals(success,"Email with instructions has been sent to you.");
}

}
