package com.psikotestonline.webadmin.testing.steps;

import org.openqa.selenium.WebDriver;

import com.psikotestonline.webadmin.testing.pages.Login;
import com.psikotestonline.webadmin.testing.pages.Report;
import com.psikotestonline.webadmin.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestExport {

	
	public static WebDriver driver;
	private static ExtentTest extentTest;
	private Login login = new Login();
	private Report report = new Report();

	public TestExport() {
		driver = Hook.driver;
		extentTest = Hook.extentTest;
	}
	@When("navigate dashboard page 331")
	public void navigate_dashboard_page_331() {
		driver.get(Constants.url);
		login.login("developer","23");
		login.clickBtn();
		login.clickOk();
		extentTest.log(LogStatus.PASS, "navigate dashboard page 331");
	}
	@And("click button report 331")
	public void click_button_report_331() {
		report.clickReport();
		extentTest.log(LogStatus.PASS, "click button report 331");
	}
	@And("click button report above remove activity 331")
	public void click_button_report_above_remove_activity_331() {
		report.clickReportReport();
		extentTest.log(LogStatus.PASS, "click button report above remove activity 331");
	}
	@And("choose the date that existing report 331")
	public void choose_the_date_that_existing_report_331() {
		delay(2);
		report.clickDateFrom();
		delay(2);
		report.clickDate1();
		delay(2);
		report.clickDateUntil();
		report.clickDate18();
		extentTest.log(LogStatus.PASS, "choose the date that existing report 331");
	}
	
	@And("click button export 331")
	public void click_button_export_331() {
		report.clickExport();
		extentTest.log(LogStatus.PASS, "click button export 331");
	}
	@Then("data automatically downloaded 331")
	public void data_automatically_downloaded_331() {
		extentTest.log(LogStatus.PASS, "data automatically downloaded 331");
		report.isFileDownloaded("C:\\Users\\Nandi\\Downloads", "exportreport (5).xls");
	}
	@When("navigate dashboard page 332")
	public void navigate_dashboard_page_332() {
		driver.get(Constants.url);
		login.login("developer","23");
		login.clickBtn();
		login.clickOk();
		extentTest.log(LogStatus.PASS, "navigate dashboard page 332");
	}
	@And("click button report 332")
	public void click_button_report_332() {
		report.clickReport();
		extentTest.log(LogStatus.PASS, "click button report 332");
	}
	@And("click button report above remove activity 332")
	public void click_button_report_above_remove_activity_332() {
		report.clickReportReport();
		extentTest.log(LogStatus.PASS, "click button report above remove activity 332");
	}
	@And("choose the date that unexisting report 332")
	public void choose_the_date_that_unexisting_report_332() {
		report.clickDateFrom();
		delay(2);
		report.clickDate29();
		delay(2);
		report.clickDateUntil();
		report.clickDate30();
		report.clickView();
		extentTest.log(LogStatus.PASS, "choose the date that unexisting report 332");
	}
	
	@And("click button export 332")
	public void click_button_export_332() {
		report.clickExport();
		extentTest.log(LogStatus.PASS, "click button export 332");
	}
	@Then("data automatically downloaded 332")
	public void data_automatically_downloaded_332() {
		extentTest.log(LogStatus.PASS, "data automatically downloaded 332");
		report.isFileDownloaded("C:\\Users\\Nandi\\Downloads", "exportreport (6).xls");
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
