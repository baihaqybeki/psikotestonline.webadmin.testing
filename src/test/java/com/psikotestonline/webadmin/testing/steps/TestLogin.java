package com.psikotestonline.webadmin.testing.steps;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.psikotestonline.webadmin.testing.pages.Login;
import com.psikotestonline.webadmin.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin {
	
	private static WebDriver driver;
	private Login login = new Login();
	private static ExtentTest extentTest;
	
	public TestLogin() {
		driver = Hook.driver;
		extentTest = Hook.extentTest;
	}
	
	@When("^Navigate to login page$")
	public void navigate() {
		driver.get(Constants.url);
		extentTest.log(LogStatus.PASS, "Navigate to login page");
	}
	
	@And("^enter \"([^\"]*)\" as username dan \"([^\"]*)\" as pasword$")
	public void fillForm(String username, String password) {
		login.login(username, password);
		extentTest.log(LogStatus.PASS, "enter "+ username + " as username dan " + password + " as pasword");
		
	}
	
	@And("^click button signin$")
	public void clickBtn() {
		login.clickBtn();
		extentTest.log(LogStatus.PASS, "click button signin");
		
	}
	
	@Then("^appear popup greeting \"([^\"]*)\"$")
	public void validateGreeting(String expect) {
		String actual = login.getMessage();
		assertTrue(actual.contains(expect));
		extentTest.log(LogStatus.PASS, "appear popup greeting \"([^\"]*)\"");
	}
}