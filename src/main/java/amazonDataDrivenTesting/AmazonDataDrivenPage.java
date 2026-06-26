package amazonDataDrivenTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonDataDrivenPage {
	
	WebDriver driver;
	 
	public void amazonDataDrivenPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	 }
	
	@FindBy(xpath="//div[@class='nav-search-field ' ]//descendant::input[@name='field-keywords']")
	private WebElement search;

	
	// Getter
	public WebElement getSearch() {
		return search;
	}
	
	// Setter
	public void setSearch(WebElement search) {
		this.search=search;
	}
}
