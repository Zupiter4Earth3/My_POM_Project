package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	@Test
	public void userShouldBeAbleToLogin() {
		driver = BrowserFactory.init();
		
//		LoginPage loginPage1 = new LoginPage();// POM recommends not to use like this to create object:
		
		LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickSignInButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver,DashboardPage.class);
		dashboardPage.validateDashboardPage("Dashboard");
		
		BrowserFactory.tearDown();
	}

}
