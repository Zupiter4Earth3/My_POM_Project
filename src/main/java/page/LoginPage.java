package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
//	We don't use following two techniques in page object model:
//	WebElement userNameElement = driver.findElement(By.xpath("//*[@id=\"username\"]"));
//	By userNameField = By.xpath("//*[@id=\"username\"]");
	
//	Element List:
	@FindBy(how = How.XPATH,using = "//*[@id=\"username\"]") WebElement userNameElement;
	@FindBy(how = How.XPATH,using = "//*[@id=\"password\"]") WebElement passwordElement;
	@FindBy(how = How.XPATH,using = "/html/body/div/div/div/form/div[3]/button") WebElement signInButtonElement;
	
//Corresponding methods:
//	Individual
	public void insertUserName(String userName) {
		userNameElement.sendKeys(userName);
	}
	public void insertPassword(String password) {
		passwordElement.sendKeys(password);
	}
	public void clickSignInButton() {
		signInButtonElement.click();
	}
//	All in one
	public void login(String userName, String password) {
		userNameElement.sendKeys(userName);
		passwordElement.sendKeys(password);
		signInButtonElement.click();
	}
	
}
