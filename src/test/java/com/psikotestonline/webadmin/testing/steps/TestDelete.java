package com.psikotestonline.webadmin.testing.steps;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.psikotestonline.webadmin.testing.pages.AddSoalPilganDKosong;
import com.psikotestonline.webadmin.testing.pages.Delete;
import com.psikotestonline.webadmin.testing.pages.Login;
import com.psikotestonline.webadmin.testing.pages.Report;
import com.psikotestonline.webadmin.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDelete {
	public static WebDriver driver;
	private static ExtentTest extentTest;
	private Login login = new Login();
	private AddSoalPilganDKosong addSoalPilganDKosong = new AddSoalPilganDKosong();
	private Report report = new Report();
	private Delete delete = new Delete();
	
	public TestDelete() {
		driver = Hook.driver;
		extentTest = Hook.extentTest;
	}
	@When("navigate dashboard page 374")
	public void navigate_dashboard_page_374() {
		driver.get(Constants.url);
		login.login("developer","23");
		login.clickBtn();
		login.clickOk();
		extentTest.log(LogStatus.PASS, "navigate dashboard page 374");
	}
	@And("click button report 374")
	public void click_button_report_374() {
		report.clickReport();
		extentTest.log(LogStatus.PASS, "click button report 374");
	}
	@And("click remove activity 374")
	public void click_remove_activity_374() {
		delete.clickRemoveActivity();
		extentTest.log(LogStatus.PASS, "click remove activity 374");
	}
	@And("click button delete that existing report 374")
	public void click_button_delete_that_existing_report_374() {
		delete.clickChooseDelete();
		extentTest.log(LogStatus.PASS, "click button delete that existing report 374");
	}
	@And("click button yes 374")
	public void click_button_yes_374() {
		delay(2);
		delete.clickYesDelete();
	}
	@Then("appear popup 374")
	public void appear_popup_374() {
		delay(2);
		assertEquals(delete.getPopUpDelete(),"Data berhasil dihapus!");
		extentTest.log(LogStatus.PASS, "appear popup 374");
	}
	static void delay(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

}
}
}






















