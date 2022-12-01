import org.openqa.selenium.By;

public class Search_Page extends Base_Page{
	
	
	private By search_field =By.id("small-searchterms");
	
	private By button =By.className("button-1 search-box-button");
	

	
public void insert_search(string mysearch) {
		
		
		wait_element(Base_page_driver,20,search_field);
		Base_page_driver.findElement(search_field).clear();
		Base_page_driver.findElement(search_field).sendKeys(mysearch);
		
		
	}
	
public void click_search() {
	
	
	wait_element(Base_page_driver,20,gender);
	Base_page_driver.findElement(button).click();
}

}
