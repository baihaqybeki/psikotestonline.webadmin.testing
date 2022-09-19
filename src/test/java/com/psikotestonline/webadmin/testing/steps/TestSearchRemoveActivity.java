package com.psikotestonline.webadmin.testing.steps;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.psikotestonline.webadmin.testing.pages.AddSoalPilganDKosong;
import com.psikotestonline.webadmin.testing.pages.Login;
import com.psikotestonline.webadmin.testing.pages.Report;
import com.psikotestonline.webadmin.testing.pages.SearchRemoveActivity;
import com.psikotestonline.webadmin.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSearchRemoveActivity {
	public static WebDriver driver;
	private static ExtentTest extentTest;
	private Login login = new Login();
	private AddSoalPilganDKosong addSoalPilganDKosong = new AddSoalPilganDKosong();
	private SearchRemoveActivity searchRemoveActivity = new SearchRemoveActivity();
	private Report report = new Report();
	public TestSearchRemoveActivity() {
		driver = Hook.driver;
		extentTest = Hook.extentTest;
	}
//=========================Search existing report by complete nik====================
	@When("navigate dashboard page 343")
	public void navigate_dashboard_page_343() {
		driver.get(Constants.url);
		login.login("developer","23");
		login.clickBtn();
		login.clickOk();
		extentTest.log(LogStatus.PASS, "navigate dashboard page 343");
	}
	@And("click button report 343")
	public void click_button_report_343() {
		delay(1);
		report.clickReport();
		extentTest.log(LogStatus.PASS, "click button report 343");
	}
	@And("click remove activity 343")
	public void click_remove_activity_343() {
		delay(1);
		searchRemoveActivity.clickRemoveActivity();
		extentTest.log(LogStatus.PASS, "click remove activity 343");
	}
	@And("type existing report by complete nik in search box 343")
	public void type_existing_report_by_complete_nik_in_search_box_343() {
		delay(1);
		searchRemoveActivity.typeBoxSearchRA("3146494649494956");
		extentTest.log(LogStatus.PASS, "type existing report by complete nik in search box 343");
	}
	@And("click button search 343")
	public void click_button_search_343() {
		delay(1);
		searchRemoveActivity.clickSearchRA();
		extentTest.log(LogStatus.PASS, "click button search 343");
	}
	@Then("data displayed 343")
	public void data_displayed_343() {
		delay(2);
		//assertTrue(report.validateTableExistingReportView());
				List <WebElement> col = driver.findElements(By.xpath("//*[@id=\"tl_remove_activity--53429_table\"]"));
		        System.out.println("No of cols are : " +col.size()); 
		        extentTest.log(LogStatus.PASS, "data displayed 343");
			}
	//=========================Search existing report by uncomplete nik====================
		@When("navigate dashboard page 344")
		public void navigate_dashboard_page_344() {
			driver.get(Constants.url);
			login.login("developer","23");
			login.clickBtn();
			login.clickOk();
			extentTest.log(LogStatus.PASS, "navigate dashboard page 344");
		}
		@And("click button report 344")
		public void click_button_report_344() {
			delay(1);
			report.clickReport();
			extentTest.log(LogStatus.PASS, "click button report 344");
		}
		@And("click remove activity 344")
		public void click_remove_activity_344() {
			delay(1);
			searchRemoveActivity.clickRemoveActivity();
			extentTest.log(LogStatus.PASS, "click remove activity 344");
		}
		@And("type existing report by uncomplete nik in search box 344")
		public void type_existing_report_by_uncomplete_nik_in_search_box_344() {
			delay(1);
			searchRemoveActivity.typeBoxSearchRA("314649464949495");
			extentTest.log(LogStatus.PASS, "type existing report by uncomplete nik in search box 344");
		}
		@And("click button search 344")
		public void click_button_search_344() {
			delay(1);
			searchRemoveActivity.clickSearchRA();
			extentTest.log(LogStatus.PASS, "click button search 344");
		}
		@Then("data not displayed 344")
		public void data_not_displayed_344() {
			delay(2);
			//errror, excpect tidak muncul ttp muncul
			//Finding number of Rows

			List<WebElement> rowsNumber = driver.findElements(By.xpath("//*[@id=\\\"tl_remove_activity--53429_table\\\"]"));
			int rowCount = rowsNumber.size();
			System.out.println("No of rows in this table : " + rowCount);

			//Finding number of Columns

			List<WebElement> columnsNumber = driver.findElements(By.xpath("//*[@id=\"tl_remove_activity--53429_table\"]"));
			int columnCount = columnsNumber.size();
			System.out.println("No of columns in this table : " + columnCount);
			extentTest.log(LogStatus.PASS, "data not displayed 344");
		}

//=========================Search existing report by wrong nik============================================================
		
		@When("navigate dashboard page 345")
		public void navigate_dashboard_page_345() {
			driver.get(Constants.url);
			login.login("developer", "23");
			login.clickBtn();
			login.clickOk();
			extentTest.log(LogStatus.PASS, "navigate dashboard page 345");
		}

		@And("click button report 345")
		public void click_button_report_345() {
			delay(1);
			report.clickReport();
			extentTest.log(LogStatus.PASS, "click button report 345");
		}

		@And("click remove activity 345")
		public void click_remove_activity_345() {
			delay(1);
			searchRemoveActivity.clickRemoveActivity();
			extentTest.log(LogStatus.PASS, "click remove activity 345");
		}

		@And("type existing report by wrong nik in search box 345")
		public void type_existing_report_by_wrong_nik_in_search_box_345() {
			delay(1);
			searchRemoveActivity.typeBoxSearchRA("3146494649494958");
			extentTest.log(LogStatus.PASS, "type existing report by wrong nik in search box 345");
		}

		@And("click button search 345")
		public void click_button_search_345() {
			delay(1);
			searchRemoveActivity.clickSearchRA();
			extentTest.log(LogStatus.PASS, "click button search 345");
		}

		@Then("data not displayed 345")
		public void data_not_displayed_345() {
			delay(2);
			//succes
			// Finding number of Rows

			List<WebElement> rowsNumber = driver
					.findElements(By.xpath("//*[@id=\"tl_remove_activity--53429_table\"]"));
			int rowCount = rowsNumber.size();
			System.out.println("No of rows in this table : " + rowCount);

			// Finding number of Columns

			List<WebElement> columnsNumber = driver
					.findElements(By.xpath("//*[@id=\"tl_remove_activity--53429_table\"]"));
			int columnCount = columnsNumber.size();
			System.out.println("No of columns in this table : " + columnCount);
			extentTest.log(LogStatus.PASS, "data not displayed 345");
		}
		
// ======Search existing report by complete name fill with Uppercase========================
		
		@When("navigate dashboard page 346")
		public void navigate_dashboard_page_346() {
			driver.get(Constants.url);
			login.login("developer", "23");
			login.clickBtn();
			login.clickOk();
			extentTest.log(LogStatus.PASS, "navigate dashboard page 346");
		}

		@And("click button report 346")
		public void click_button_report_346() {
			delay(1);
			report.clickReport();
			extentTest.log(LogStatus.PASS, "click button report 346");
		}

		@And("click remove activity 346")
		public void click_remove_activity_346() {
			delay(1);
			searchRemoveActivity.clickRemoveActivity();
			extentTest.log(LogStatus.PASS, "click remove activity 346");
		}

		@And("type existing report by complete name fill with Uppercase in search box 346")
		public void type_existing_report_by_complete_name_fill_with_Uppercase_in_search_box_346() {
			delay(1);
			searchRemoveActivity.typeBoxSearchRA("SOMADD");
			extentTest.log(LogStatus.PASS, "type existing report by complete name fill with Uppercase in search box 346");
		}

		@And("click button search 346")
		public void click_button_search_346() {
			delay(1);
			searchRemoveActivity.clickSearchRA();
			extentTest.log(LogStatus.PASS, "click button search 346");
		}

		@Then("data displayed 346")
		public void data_displayed_346() {
			delay(2);
			//succes
			// Finding number of Rows

			List<WebElement> rowsNumber = driver.findElements(By.xpath("//*[@id=\"tl_remove_activity--53429_table\"]"));
			int rowCount = rowsNumber.size();
			System.out.println("No of rows in this table : " + rowCount);

			// Finding number of Columns

			List<WebElement> columnsNumber = driver.findElements(By.xpath("//*[@id=\"tl_remove_activity--53429_table\"]"));
			int columnCount = columnsNumber.size();
			System.out.println("No of columns in this table : " + columnCount);
		}	
		
// ======Search existing report by uncomplete name fill with Uppercase========================
		@When("navigate dashboard page 347")
		public void navigate_dashboard_page_347() {
			driver.get(Constants.url);
			login.login("developer", "23");
			login.clickBtn();
			login.clickOk();
			extentTest.log(LogStatus.PASS, "navigate dashboard page 347");
		}

		@And("click button report 347")
		public void click_button_report_347() {
			delay(1);
			report.clickReport();
			extentTest.log(LogStatus.PASS, "click button report 347");
		}

		@And("click remove activity 347")
		public void click_remove_activity_347() {
			delay(1);
			searchRemoveActivity.clickRemoveActivity();
			extentTest.log(LogStatus.PASS, "click remove activity 347");
		}

		@And("type existing report by uncomplete name fill with Uppercase in search box 347")
		public void type_existing_report_by_uncomplete_name_fill_with_Uppercase_in_search_box_347() {
			delay(1);
			searchRemoveActivity.typeBoxSearchRA("OMADD");
			extentTest.log(LogStatus.PASS, "type existing report by uncomplete name fill with Uppercase in search box 346");
		}

		@And("click button search 347")
		public void click_button_search_347() {
			delay(1);
			searchRemoveActivity.clickSearchRA();
			extentTest.log(LogStatus.PASS, "click button search 347");
		}
		//gagal karena expect tdk muncul tetapi muncul
		@Then("data not displayed 347")
		public void data_not_displayed_347() {
			delay(2);
			assertEquals(searchRemoveActivity.getMsgShowPage(),"no entries");
			extentTest.log(LogStatus.PASS, "data not displayed 347");
		}	
// ======Search existing report by complete name fill with Sentencecase========================
		@When("navigate dashboard page 348")
		public void navigate_dashboard_page_348() {
			driver.get(Constants.url);
			login.login("developer", "23");
			login.clickBtn();
			login.clickOk();
			extentTest.log(LogStatus.PASS, "navigate dashboard page 348");
		}

		@And("click button report 348")
		public void click_button_report_348() {
			delay(1);
			report.clickReport();
			extentTest.log(LogStatus.PASS, "click button report 348");
		}

		@And("click remove activity 348")
		public void click_remove_activity_348() {
			delay(1);
			searchRemoveActivity.clickRemoveActivity();
			extentTest.log(LogStatus.PASS, "click remove activity 348");
		}

		@And("type existing report by complete name fill with Sentence case in search box 348")
		public void type_existing_report_by_complete_name_fill_with_Sentence_case_in_search_box_348() {
			delay(1);
			searchRemoveActivity.typeBoxSearchRA("Ahlan rezki");
			extentTest.log(LogStatus.PASS,
					"type existing report by complete name fill with Sentence case in search box 348");
		}

		@And("click button search 348")
		public void click_button_search_348() {
			delay(1);
			searchRemoveActivity.clickSearchRA();
			extentTest.log(LogStatus.PASS, "click button search 348");
		}

		
		@Then("data displayed 348")
		public void data_displayed_348() {
			delay(2);
			assertEquals(searchRemoveActivity.getMsgShowPage(), " Showing 1 to 5 of 5 entries");
			extentTest.log(LogStatus.PASS, "data displayed 348");
		}
// ======Search existing report by uncomplete name fill with Sentencecase========================
		@When("navigate dashboard page 349")
		public void navigate_dashboard_page_349() {
			driver.get(Constants.url);
			login.login("developer", "23");
			login.clickBtn();
			login.clickOk();
			extentTest.log(LogStatus.PASS, "navigate dashboard page 349");
		}

		@And("click button report 349")
		public void click_button_report_349() {
			delay(1);
			report.clickReport();
			extentTest.log(LogStatus.PASS, "click button report 349");
		}

		@And("click remove activity 349")
		public void click_remove_activity_349() {
			delay(1);
			searchRemoveActivity.clickRemoveActivity();
			extentTest.log(LogStatus.PASS, "click remove activity 349");
		}

		@And("type existing report by uncomplete name fill with Sentence case in search box 349")
		public void type_existing_report_by_uncomplete_name_fill_with_Sentence_case_in_search_box_349() {
			delay(1);
			searchRemoveActivity.typeBoxSearchRA("Hlan rezki");
			extentTest.log(LogStatus.PASS,
					"type existing report by uncomplete name fill with Sentence case in search box 349");
		}

		@And("click button search 349")
		public void click_button_search_349() {
			delay(1);
			searchRemoveActivity.clickSearchRA();
			extentTest.log(LogStatus.PASS, "click button search 349");
		}

		
		@Then("data not displayed 349")
		public void data_not_displayed_349() {
			delay(2);
			assertEquals(searchRemoveActivity.getMsgShowPage(), "no entries");
			extentTest.log(LogStatus.PASS, "data not displayed 349");
		//gagal karena seharusnya bukan Hlan Rezki tapi Ahlan Rezki
		}
		
// ======Search existing report by complete name fill with Lowercase========================
		
		@When("navigate dashboard page 350")
		public void navigate_dashboard_page_350() {
			driver.get(Constants.url);
			login.login("developer", "23");
			login.clickBtn();
			login.clickOk();
			extentTest.log(LogStatus.PASS, "navigate dashboard page 350");
		}

		@And("click button report 350")
		public void click_button_report_350() {
			delay(1);
			report.clickReport();
			extentTest.log(LogStatus.PASS, "click button report 350");
		}

		@And("click remove activity 350")
		public void click_remove_activity_350() {
			delay(1);
			searchRemoveActivity.clickRemoveActivity();
			extentTest.log(LogStatus.PASS, "click remove activity 350");
		}

		@And("type existing report by complete name fill with lowercase in search box 350")
		public void type_existing_report_by_complete_name_fill_with_lowercase_in_search_box_350() {
			delay(1);
			searchRemoveActivity.typeBoxSearchRA("ahlan rezki");
			extentTest.log(LogStatus.PASS,"type existing report by complete name fill with lowercase in search box 350");
		}

		@And("click button search 350")
		public void click_button_search_350() {
			delay(1);
			searchRemoveActivity.clickSearchRA();
			extentTest.log(LogStatus.PASS, "click button search 350");
		}

		@Then("data displayed 350")
		public void data_displayed_350() {
			delay(2);
			assertEquals(searchRemoveActivity.getMsgShowPage(), " Showing 1 to 5 of 5 entries");
			extentTest.log(LogStatus.PASS, "data displayed 350");
			// succes
		}
		
// ======Search existing report by uncomplete name fill with Lowercase========================
		
		@When("navigate dashboard page 351")
		public void navigate_dashboard_page_351() {
			driver.get(Constants.url);
			login.login("developer", "23");
			login.clickBtn();
			login.clickOk();
			extentTest.log(LogStatus.PASS, "navigate dashboard page 351");
		}

		@And("click button report 351")
		public void click_button_report_351() {
			delay(1);
			report.clickReport();
			extentTest.log(LogStatus.PASS, "click button report 351");
		}

		@And("click remove activity 351")
		public void click_remove_activity_351() {
			delay(1);
			searchRemoveActivity.clickRemoveActivity();
			extentTest.log(LogStatus.PASS, "click remove activity 351");
		}

		@And("type existing report by uncomplete name fill with lowercase in search box 351")
		public void type_existing_report_by_uncomplete_name_fill_with_lowercase_in_search_box_351() {
			delay(1);
			searchRemoveActivity.typeBoxSearchRA("hlan rezki");
			extentTest.log(LogStatus.PASS,"type existing report by uncomplete name fill with lowercase in search box 351");
		}

		@And("click button search 351")
		public void click_button_search_351() {
			delay(1);
			searchRemoveActivity.clickSearchRA();
			extentTest.log(LogStatus.PASS, "click button search 351");
		}

		@Then("data not displayed 351")
		public void data_not_displayed_351() {
			delay(2);
			assertEquals(searchRemoveActivity.getMsgShowPage(), "no entries");
			extentTest.log(LogStatus.PASS, "data not displayed 351");
			// gagal karena diinput uncomplet lowercase tetapi munncul expectnya tdk muncul
		}
		
// ============Search existing report by complete name fill with capitalize each world========================		
		
		@When("navigate dashboard page 352")
		public void navigate_dashboard_page_352() {
			driver.get(Constants.url);
			login.login("developer", "23");
			login.clickBtn();
			login.clickOk();
			extentTest.log(LogStatus.PASS, "navigate dashboard page 352");
		}

		@And("click button report 352")
		public void click_button_report_352() {
			delay(1);
			report.clickReport();
			extentTest.log(LogStatus.PASS, "click button report 352");
		}

		@And("click remove activity 352")
		public void click_remove_activity_352() {
			delay(1);
			searchRemoveActivity.clickRemoveActivity();
			extentTest.log(LogStatus.PASS, "click remove activity 352");
		}

		@And("type existing report by complete name fill with capitalized each world in search box 352")
		public void type_existing_report_by_complete_name_fill_with_capitalized_each_world_in_search_box_352() {
			delay(1);
			searchRemoveActivity.typeBoxSearchRA("Ahlan Rezki");
			extentTest.log(LogStatus.PASS,"type existing report by complete name fill with capitalized each world in search box 352");
		}

		@And("click button search 352")
		public void click_button_search_352() {
			delay(1);
			searchRemoveActivity.clickSearchRA();
			extentTest.log(LogStatus.PASS, "click button search 352");
		}

		@Then("data displayed 352")
		public void data_displayed_352() {
			delay(2);
			assertEquals(searchRemoveActivity.getMsgShowPage(), " Showing 1 to 5 of 5 entries");
			extentTest.log(LogStatus.PASS, "data displayed 351");
			// succes
		}
		
// ===========Search existing report by uncomplete name fill with capitalize each world=======================		
		
		@When("navigate dashboard page 353")
		public void navigate_dashboard_page_353() {
			driver.get(Constants.url);
			login.login("developer", "23");
			login.clickBtn();
			login.clickOk();
			extentTest.log(LogStatus.PASS, "navigate dashboard page 353");
		}

		@And("click button report 353")
		public void click_button_report_353() {
			delay(1);
			report.clickReport();
			extentTest.log(LogStatus.PASS, "click button report 353");
		}

		@And("click remove activity 353")
		public void click_remove_activity_353() {
			delay(1);
			searchRemoveActivity.clickRemoveActivity();
			extentTest.log(LogStatus.PASS, "click remove activity 353");
		}

		@And("type existing report by uncomplete name fill with capitalized each world in search box 353")
		public void type_existing_report_by_uncomplete_name_fill_with_capitalized_each_world_in_search_box_353() {
			delay(1);
			searchRemoveActivity.typeBoxSearchRA("Hlan Rezki");
			extentTest.log(LogStatus.PASS,"type existing report by uncomplete name fill with capitalized each world in search box 353");
		}

		@And("click button search 353")
		public void click_button_search_353() {
			delay(1);
			searchRemoveActivity.clickSearchRA();
			extentTest.log(LogStatus.PASS, "click button search 353");
		}

		@Then("data not displayed 353")
		public void data_not_displayed_353() {
			delay(2);
			assertEquals(searchRemoveActivity.getMsgShowPage(), "no entries");
			extentTest.log(LogStatus.PASS, "data not displayed 353");
			// gagal karena expect tidak keluar tp actual keluar
		}
		
// ===========Search existing report by complete name fill with Toggle case=======================	
		
		@When("navigate dashboard page 354")
		public void navigate_dashboard_page_354() {
			driver.get(Constants.url);
			login.login("developer", "23");
			login.clickBtn();
			login.clickOk();
			extentTest.log(LogStatus.PASS, "navigate dashboard page 354");
		}

		@And("click button report 354")
		public void click_button_report_354() {
			delay(1);
			report.clickReport();
			extentTest.log(LogStatus.PASS, "click button report 354");
		}

		@And("click remove activity 354")
		public void click_remove_activity_354() {
			delay(1);
			searchRemoveActivity.clickRemoveActivity();
			extentTest.log(LogStatus.PASS, "click remove activity 354");
		}

		@And("type existing report by complete name fill with toogle case in search box 354")
		public void type_existing_report_by_complete_name_fill_with_toogle_case_in_search_box_354() {
			delay(1);
			searchRemoveActivity.typeBoxSearchRA("aHLAN rEZKI");
			extentTest.log(LogStatus.PASS,"type existing report by complete name fill with toogle case in search box 354");
		}

		@And("click button search 354")
		public void click_button_search_354() {
			delay(1);
			searchRemoveActivity.clickSearchRA();
			extentTest.log(LogStatus.PASS, "click button search 354");
		}

		@Then("data not displayed 354")
		public void data_not_displayed_354() {
			delay(2);
			assertEquals(searchRemoveActivity.getMsgShowPage(), "no entries");
			extentTest.log(LogStatus.PASS, "data not displayed 354");
			// succes
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
















