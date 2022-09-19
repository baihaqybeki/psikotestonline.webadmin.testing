package com.psikotestonline.webadmin.testing.steps;

import org.openqa.selenium.WebDriver;

import com.psikotestonline.webadmin.testing.pages.Login;
import com.psikotestonline.webadmin.testing.pages.Logout;
import com.psikotestonline.webadmin.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogout {
	
	private static WebDriver driver;
	private Login login = new Login();
	private Logout logout = new Logout();
	private static ExtentTest extentTest;
	
	public TestLogout() {
		driver = Hook.driver;
		extentTest = Hook.extentTest;
	}
	
	@When("navigate to dashboard page for logout super admin")
	public void navigate() {
		driver.get(Constants.url);
		login.login("developer", "23");
		login.clickBtn();
		login.clickOk();
		extentTest.log(LogStatus.PASS, "navigate to dashboard page for logout super admin");
	}
	
	@When("navigate to dashboard page for logout admin")
	public void navigateAdmin() {
		driver.get(Constants.url);
		login.login("beki", "SssOoo*01");
		login.clickBtn();
		login.clickOk();
		extentTest.log(LogStatus.PASS, "navigate to dashboard page for logout admin");
	}
	
	
	@And("click button profile for logout super admin")
	public void logoutAccount() {
		logout.logout();
		extentTest.log(LogStatus.PASS, "navigate to dashboard page for logout super admin");
	}
	
	@And("click button profile for logout admin")
	public void logoutAccountAdmin() {
		logout.logout();
		extentTest.log(LogStatus.PASS, "click button profile for logout admin");
	}
	
	@Then("validate page for logout super admin")
	public void validatePage() {
		logout.getTextFrame();
		extentTest.log(LogStatus.PASS, "validate page for logout super admin");
	}
	
	@Then("validate page for logout admin for logout admin")
	public void validatePageAdmin() {
		logout.getTextFrame();
		extentTest.log(LogStatus.PASS, "validate page for logout admin");
		
	}
}
