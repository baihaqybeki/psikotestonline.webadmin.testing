package com.psikotestonline.webadmin.testing.steps;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.psikotestonline.webadmin.testing.pages.AddSoalPilganDKosong;
import com.psikotestonline.webadmin.testing.pages.Login;
import com.psikotestonline.webadmin.testing.pages.Report;
import com.psikotestonline.webadmin.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestReport {

	public static WebDriver driver;
	private static ExtentTest extentTest;
	private Login login = new Login();
	private Report report = new Report();

	public TestReport() {
		driver = Hook.driver;
		extentTest = Hook.extentTest;
	}
	@When("navigate dashboard page 329")
	public void navigate_dashboard_page_329() {
		driver.get(Constants.url);
		login.login("developer","23");
		login.clickBtn();
		login.clickOk();
		extentTest.log(LogStatus.PASS, "navigate dashboard page 329");
	}
	@And("click button report 329")
	public void click_button_report_329() {
		report.clickReport();
		extentTest.log(LogStatus.PASS, "click button report 329");
	}
	@And("click button report above remove activity 329")
	public void click_button_report_above_remove_activity_329() {
		report.clickReportReport();
		extentTest.log(LogStatus.PASS, "click button report above remove activity 329");
	}
	@And("choose the date that existing report 329")
	public void choose_the_date_that_existing_report_329() {
		report.clickDateFrom();
		delay(2);
		report.clickDate1();
		delay(2);
		report.clickDateUntil();
		report.clickDate13();
		extentTest.log(LogStatus.PASS, "click button report above remove activity");
	}
	@And("click button view 329")
	public void click_button_view_329() {
		delay(2);
		report.clickView();
		extentTest.log(LogStatus.PASS, "click button view 329");
	}
	@Then("data displayed 329")
	public void data_displayed() {
		//assertTrue(report.validateTableExistingReportView());
		List <WebElement> col = driver.findElements(By.xpath("//*[@id=\"tl_report_setuju--51776_table\"]"));
        System.out.println("No of cols are : " +col.size()); 
        extentTest.log(LogStatus.PASS, "data displayed 329");
	}
	
	@When("navigate dashboard page 330")
	public void navigate_dashboard_page_330() {
		driver.get(Constants.url);
		login.login("developer","23");
		login.clickBtn();
		login.clickOk();
		extentTest.log(LogStatus.PASS, "navigate dashboard page 330");
	}
	@And("click button report 330")
	public void click_button_report_330() {
		report.clickReport();
		extentTest.log(LogStatus.PASS, "click button report 330");
	}
	@And("click button report above remove activity 330")
	public void click_button_report_above_remove_activity_330() {
		report.clickReportReport();
		extentTest.log(LogStatus.PASS, "click button report above remove activity 330");
	}
	@And("choose the date that unexisting report 330")
	public void choose_the_date_that_unexisting_report_330() {
		report.clickDateFrom();
		delay(2);
		report.clickDate29();
		delay(2);
		report.clickDateUntil();
		report.clickDate30();
		extentTest.log(LogStatus.PASS, "choose the date that unexisting report 330");
	}
	@And("click button view 330")
	public void click_button_view_330() {
		delay(2);
		report.clickView();
		extentTest.log(LogStatus.PASS, "click button view 330");
	}
	@Then("data not displayed 330")
	public void data_not_displayed() {
		//assertTrue(report.validateTableExistingReportView());
		List <WebElement> col = driver.findElements(By.xpath("//*[@id=\"tl_report_setuju--51776_table\"]"));
        System.out.println("No of cols are : " +col.size()); 
        extentTest.log(LogStatus.PASS, "data displayed 330");
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

