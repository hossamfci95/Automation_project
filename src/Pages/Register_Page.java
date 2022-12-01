import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register_Page extends Base_Page {
	
	
	
	public Register_Page(WebDriver driver) {
		
		
		
		super(driver);
	}

	
	private By gender =By.name("Gender");
	private By first_Name =By.id("FirstName");
	private By last_Name =By.id("LastName");
	private By day =By.name("DateOfBirthDay");
	private By month =By.name("DateOfBirthMonth");
	private By year =By.name("DateOfBirthYear");
	private By email =By.id("Email");
	private By company =By.id("Company");
	private By news =By.id("Newsletter");
	private By password =By.id("Password");
	private By confirm_password =By.id("ConfirmPassword");
	private By register_button =By.id("register-button");
	
	
public void insert_gender() {
		
		
		wait_element(Base_page_driver,20,gender);
		Base_page_driver.findElement(gender).click();
	}
	
public void insert_fname(string fname) {
		
		
		wait_element(Base_page_driver,20,first_Name);
		Base_page_driver.findElement(first_Name).clear();
		Base_page_driver.findElement(first_Name).sendKeys(fname);
		
		
	}
public void insert_Lname(string Lname) {
	
	
	wait_element(Base_page_driver,20,last_Name);
	Base_page_driver.findElement(last_Name).clear();
	Base_page_driver.findElement(last_Name).sendKeys(Bday);
}
public void insert_day(int Bday) {
	
	
	wait_element(Base_page_driver,20,day);
	Base_page_driver.findElement(day).clear();
	Base_page_driver.findElement(day).sendKeys(Bday);
}
public void insert_month(int Bmonth) {
	
	
	wait_element(Base_page_driver,20,month);
	Base_page_driver.findElement(month).clear();
	Base_page_driver.findElement(month).sendKeys(Bmonth);
}
public void insert_year(int Byear) {
	
	
	wait_element(Base_page_driver,20,year);
	Base_page_driver.findElement(year).clear();
	Base_page_driver.findElement(year).sendKeys(Byear);
}
public void insert_email(string myEmail) {
	
	
	wait_element(Base_page_driver,20,email);
	Base_page_driver.findElement(email).clear();
	Base_page_driver.findElement(email).sendKeys(myEmail);
}
public void insert_company(string myCompany) {
	
	
	wait_element(Base_page_driver,20,company);
	Base_page_driver.findElement(company).clear();
	Base_page_driver.findElement(company).sendKeys(myCompany);
}

public void insert_news(string ) {
	
	
	wait_element(Base_page_driver,20,news);
	
	Base_page_driver.findElement(news).sendKeys(newsLetter);
}
public void insert_password(string mainPassword) {
	
	
	wait_element(Base_page_driver,20,password);
	Base_page_driver.findElement(password).clear();
	Base_page_driver.findElement(password).sendKeys(mainPassword);
}
public void insert_confirm_password(string confirmP) {
	
	
	wait_element(Base_page_driver,20,confirm_password);
	Base_page_driver.findElement(confirm_password).clear();
	Base_page_driver.findElement(confirm_password).sendKeys(confirmP);
}
public void click_register() {
	
	
	wait_element(Base_page_driver,20,register_button);
	
	Base_page_driver.findElement(register_button).click();
}


	
	
	
	
	
}
