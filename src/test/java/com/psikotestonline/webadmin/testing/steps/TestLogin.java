package com.psikotestonline.webadmin.testing.steps;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.psikotestonline.webadmin.testing.pages.Login;
import com.psikotestonline.webadmin.utils.Constants;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin {
	
	private static WebDriver driver;
	private Login login = new Login();
	
	public TestLogin() {
		driver = Hook.driver;
	}
	
	@When("^Navigate to login page$")
	public void navigate() {
		driver.get(Constants.url);
	}
	
	@And("^enter \"([^\"]*)\" as username dan \"([^\"]*)\" as pasword$")
	public void fillForm(String username, String password) {
		login.login(username, password);
	}
	
	@And("^click button signin$")
	public void clickBtn() {
		login.clickBtn();
	}
	
	@Then("^appear popup greeting \"([^\"]*)\"$")
	public void validateGreeting(String expect) {
		String actual = login.getMessage();
		assertTrue(actual.contains(expect));
	}
}