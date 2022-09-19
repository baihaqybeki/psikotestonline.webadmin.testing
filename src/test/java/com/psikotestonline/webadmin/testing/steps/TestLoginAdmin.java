package com.psikotestonline.webadmin.testing.steps;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.psikotestonline.webadmin.testing.pages.LoginAdmin;
import com.psikotestonline.webadmin.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestLoginAdmin {
	
	private static WebDriver driver;
	private LoginAdmin loginAdmin = new LoginAdmin();
	private static ExtentTest extentTest;
	
	public TestLoginAdmin() {
		driver = Hook.driver;
		extentTest = Hook.extentTest;
	}
	
	@When("^Navigate to login page in auth admin$")
	public void navigate() {
		driver.get(Constants.url);
		extentTest.log(LogStatus.PASS, "Navigate to login page in auth admin");
	}
	
	@And("^enter \"([^\"]*)\" as username dan \"([^\"]*)\" as password in auth admin$")
	public void fillForm(String username, String password) {
		loginAdmin.loginAdmin(username, password);
		extentTest.log(LogStatus.PASS, "enter "+username+" as username dan "+password+" as password in auth admin");
	}
	
	@And("^click button signin in auth admin$")
	public void clickBtn() {
		loginAdmin.clickBtnAdmin();
		extentTest.log(LogStatus.PASS, "click button signin in auth admin");
	}
	

	@Then("^appear popup greeting \"([^\"]*)\" in auth admin$")
	public void validateGreeting(String expect) {
		String actual = loginAdmin.getMessageAdmin();
		assertTrue(actual.contains(expect));
		extentTest.log(LogStatus.PASS, "appear popup greeting "+expect+" in auth admin");
	}
}