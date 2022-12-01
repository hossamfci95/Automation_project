import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Home_page ;
import pages.Register_Page ;

import dev.failsafe.internal.util.Assert;


public class Register_test extends Register_Page {
	Home_page Home ;
	Register_Page myregister=new Register_Page() ;
	
	WebDriver driver ;
	
	
	File file =    new File("data\\TestData.xls");
    
    //Create an object of FileInputStream class to read excel file
    FileInputStream inputStream = new FileInputStream(file);
    
    //Creating workbook instance that refers to .xls file
    HSSFWorkbook wb=new HSSFWorkbook(inputStream);
    
    //Creating a Sheet object using the sheet Name
    HSSFSheet sheet=wb.getSheet("STUDENT_DATA");
	
	//@Test(dataProvider="test_data")
	@Test
public void Register(String fname,String Lname,int day ,int month ,int year,String email,String company, String password,String confirm) {
	
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		myregister.click_Register();
		myregister.insert_fname("hossam");
		myrgister.insert_gender();
		myregister.insert_Lname("hassan");
		myregister.insert_day(1);
		myrgister.insert_month(1);
		myregister.insert_year(2022);
		myregister.insert_email("hossam@hotmail.com");
		myregister.insert_company("youxel");
		myregister.insert_news();
		myregister.insert_password("123456");
		myregister.insert_confirm_password("123456")
		myregister.click_register();
		
	
	String success = driver.findElement(By.linkText("My account")).getText();
	Assert.assertequals(success,"My account");
	
	@DataProvider
	
	public String 
	
	
	
}
}
