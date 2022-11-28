package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddContactPage extends BasePage {
	WebDriver driver;
	public void AddContactPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement fullNameElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement companyElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]") WebElement emailElement;
	
	public void insertFullName(String fullName) {
		fullNameElement.sendKeys(fullName + generatedRandomNum(999));
	}
	public void selectCompany(String company) {
		selectFromDropdown(companyElement, company);
	}
	public void insertEmail(String email) {
		emailElement.sendKeys(generatedRandomNum(999) + email);
	}
	
}
