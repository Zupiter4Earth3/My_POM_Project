package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest {
	WebDriver driver;
	@Test
	public void userShouldBeAbleToAddCustomer() {
	driver = BrowserFactory.init();
	LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
	loginPage.insertUserName("demo@techfios.com");
	loginPage.insertPassword("abc123");
	loginPage.clickSignInButton();
	
	DashboardPage dashboardPage = PageFactory.initElements(driver,DashboardPage.class);
	dashboardPage.validateDashboardPage("Dashboard");
	dashboardPage.clickCustomersButton();
	dashboardPage.clickAdddCustomerButton();
	
	AddContactPage addContactPage = PageFactory.initElements(driver,AddContactPage.class);
	addContactPage.insertFullName("Selenium");
	addContactPage.selectCompany("Techfios");
	addContactPage.insertEmail("abc@techfios.com");
	
	}
}
