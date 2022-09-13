package com.psikotestonline.webadmin.testing.steps;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.psikotestinline.webadmin.testing.pages.AddUserManagement;
import com.psikotestinline.webadmin.testing.pages.Login;
import com.psikotestonline.webadmin.utils.Constants;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAddUser {
	
	private static WebDriver driver;
	private Login login = new Login();
	private AddUserManagement addUser = new AddUserManagement();
	
	public TestAddUser() {
		driver = Hook.driver;
	}
	
	@When("^navigate dashboard page$")
	public void navigateDashboard() {
		driver.get(Constants.url);
		login.login("developer", "23");
		login.clickBtn();
		login.clickOk();
	}
	
	@And("^click user management menu$")
	public void userManage() {
		addUser.clickManage();
	}
	
	@And("^click admin menu$")
	public void clickAdmin() {
		addUser.clickAdminTab();
	}
	
	@And("^click add button$")
	public void clickAdd() {
		addUser.clickAddDash();
	}
	
	@And("^fill user data form with \"([^\"]*)\" as privileges and \"([^\"]*)\" as supervisor$")
	public void fillForm(String privileges,String supervisor) {
		addUser.fillForm(privileges, supervisor);
	}
	
	@And("^click yes button on confirmation dialog box")
	public void clickYes() {
		addUser.clickYesBtn();
	}
	
	@Then("^user added to table$")
	public void validate() {
		assertTrue(addUser.validateUser());
	}
	
	
}
