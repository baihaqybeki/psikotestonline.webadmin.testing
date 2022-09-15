package com.psikotestonline.webadmin.testing.steps;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.psikotestonline.webadmin.testing.pages.LoginAdmin;
import com.psikotestonline.webadmin.utils.Constants;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLoginAdmin {
	
	private static WebDriver driver;
	private LoginAdmin loginAdmin = new LoginAdmin();
	
	public TestLoginAdmin() {
		driver = Hook.driver;
	}
	
	@When("^Navigate to login page (auth admin)$")
	public void navigate() {
		driver.get(Constants.url2);
	}
	
	@And("^enter \"([^\"]*)\" as username dan \"([^\"]*)\" as pasword (auth admin)$")
	public void fillForm(String username, String password) {
		loginAdmin.login(username, password);
	}
	
	@And("^click button signin (auth admin)$")
	public void clickBtn() {
		loginAdmin.clickBtn();
	}
	
	@Then("^appear popup greeting \"([^\"]*)\" (auth admin)$")
	public void validateGreeting(String expect) {
		String actual = loginAdmin.getMessage();
		assertTrue(actual.contains(expect));
	}
}