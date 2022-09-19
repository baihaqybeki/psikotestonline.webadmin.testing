package com.psikotestonline.webadmin.testing.steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.psikotestonline.webadmin.testing.pages.AddUserManagement;
import com.psikotestonline.webadmin.testing.pages.Login;
import com.psikotestonline.webadmin.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAddUser {
	
	private static WebDriver driver;
	private Login login = new Login();
	private AddUserManagement addUser = new AddUserManagement();
	private static ExtentTest extentTest;
	
	public TestAddUser() {
		driver = Hook.driver;
		extentTest = Hook.extentTest;
	}
	
	@When("^navigate dashboard page$")
	public void navigateDashboard() {
		driver.get(Constants.url);
		login.login("developer", "23");
		login.clickBtn();
		login.clickOk();
		extentTest.log(LogStatus.PASS, "navigate dashboard page");
	}
	
	@And("^click user management menu$")
	public void userManage() {
		addUser.clickManage();
		extentTest.log(LogStatus.PASS, "click user management menu");
	}
	
	@And("^click admin menu$")
	public void clickAdmin() {
		addUser.clickAdminTab();
		extentTest.log(LogStatus.PASS, "click admin menu");
	}
	
	@And("^click add button$")
	public void clickAdd() {
		addUser.clickAddDash();
		extentTest.log(LogStatus.PASS, "click add button");
	}
	
	@And("^fill user data form without full name with \"([^\"]*)\" as privileges and \"([^\"]*)\" as supervisor$")
	public void fillDataWithoutUsername(String privileges, String supervisor) {
		addUser.fillFormWithoutUsername(privileges, supervisor);
		extentTest.log(LogStatus.PASS, "fill user data form without full name with "+privileges+" as privileges and "+supervisor+" as supervisor");
	}
	
	@And("^fill user data form with \"([^\"]*)\" as privileges and \"([^\"]*)\" as supervisor$")
	public void fillForm(String privileges,String supervisor) {
		addUser.fillForm(privileges, supervisor);
		extentTest.log(LogStatus.PASS, "fill user data form with "+privileges+" as privileges and "+supervisor+" as supervisor");
	}
	
	@And("^fill user data form with full name with \"([^\"]*)\" as privileges and \"([^\"]*)\" as supervisor$")
	public void fillFormDuplicate(String privileges,String supervisor) {
		addUser.fillForm(privileges, supervisor);
		extentTest.log(LogStatus.PASS, "fill user data form with "+privileges+" as privileges and "+supervisor+" as supervisor");
	}
	
	@And("^click button save$")
	public void clickSave() {
		addUser.clickBtnSave();
		extentTest.log(LogStatus.PASS, "click button save");
	}
	
	
	@And("^click yes button on confirmation dialog box")
	public void clickYes() {
		addUser.clickYesBtn();
		extentTest.log(LogStatus.PASS, "click yes button on confirmation dialog box");
	}
	
	@Then("^user added to table$")
	public void validate() {
		assertTrue(addUser.validateUser());
		extentTest.log(LogStatus.PASS, "user added to table");
	}
	
	@Then("^user appear popup message \"([^\"]*)\"")
	public void validatePopUP(String expect) {
		String actual = addUser.getPopUpMessage();
		assertEquals(actual,expect);
		extentTest.log(LogStatus.PASS, "user appear popup message "+expect);
		
	}
	
	
}
