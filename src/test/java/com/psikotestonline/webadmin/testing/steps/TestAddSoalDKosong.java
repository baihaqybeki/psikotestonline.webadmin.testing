package com.psikotestonline.webadmin.testing.steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.psikotestonline.webadmin.testing.pages.Login;
import com.psikotestonline.webadmin.testing.pages.AddSoalPilganDKosong;
import com.psikotestonline.webadmin.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAddSoalDKosong {
 
	public static WebDriver driver;
	private static ExtentTest extentTest;
	private Login login = new Login();
	private AddSoalPilganDKosong addSoalPilganDKosong = new AddSoalPilganDKosong();
	
	public TestAddSoalDKosong() {
		driver = Hook.driver;
		extentTest = Hook.extentTest;
	}
	@When("navigate dashboard page 1")
	public void navigate_dashboard_page_1() {
		driver.get(Constants.url);
		login.login("developer","23");
		login.clickBtn();
		login.clickOk();
		extentTest.log(LogStatus.PASS, "navigate dashboard page");
	}
	
	@And("click button task")
	public void click_button_task() {
		addSoalPilganDKosong.clickTask();
		extentTest.log(LogStatus.PASS, "click button task");
	}
	
	@And("click button modul")
	public void click_button_modul() {
		addSoalPilganDKosong.clickModul();
		extentTest.log(LogStatus.PASS, "click button modul");
		scroll(400);
		delay(2);
	}
	@And("choose type modul pilihan ganda and click button yellow")
	public void choose_type_modul_pilihan_ganda_and_click_button_yellow() {
		addSoalPilganDKosong.searchSoal("Matematika Pilihan ganda");
		addSoalPilganDKosong.clickBtnSearch();
		delay(1);
		addSoalPilganDKosong.clickAddSoalPilgan();
		extentTest.log(LogStatus.PASS, "choose type modul pilihan ganda and click button yellow");
		
	} 
	
	@And("select soal to be edited with click button green")
	public void select_soal_to_be_edited_with_click_button_green() {
		delay(2);
		addSoalPilganDKosong.clickMaximizeToEdit();
//		Actions act = new Actions(driver);
//				act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		scroll(400);
		delay(2);
		addSoalPilganDKosong.clickEditSoalPilgan();
		extentTest.log(LogStatus.PASS, "select soal to be edited with click button green");
	}
	
	@And("replace kunci jawaban pilih to a and update soal")
	public void And_replace_kunci_jawaban_pilih_to_a_and_update_soal() {
		delay(2);
		addSoalPilganDKosong.chooseKunciJawaban(); 
		delay(2);
		addSoalPilganDKosong.clickTxtEditSoalPilgan();
		delay(2);
		extentTest.log(LogStatus.PASS, "And replace kunci jawaban pilih to a and update soal");
	}
	
	@And("click button update")
	public void click_button_update() {
		addSoalPilganDKosong.clickUpdateSoalPilgan();
		extentTest.log(LogStatus.PASS, "click button update");
	}
	
	@Then("appear popup")
	public void Then_appear_popup() {
		delay(2);
		assertEquals(addSoalPilganDKosong.getPopUpUpdateSoalPilgan(), "Data Berhasil Di Update");
		extentTest.log(LogStatus.PASS, "appear popup");
	}
	@Then("appear popup invalid")
	public void Then_appear_popup_invalid() {
		delay(2);
		assertEquals(addSoalPilganDKosong.getPopUpUpdateSoalPilgan(), "Mohon lengkapi data");
		extentTest.log(LogStatus.PASS, "appear popup invalid");
	}
	
	static void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + vertical + ")");
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
//delay(1);
//driver.switchTo().alert().accept();
//String txtPopUp = driver.switchTo().alert().getText();
//delay(1);
//driver.switchTo().alert().dismiss();
//System.out.println(addSoalPilganDKosong.getPopUpUpdateSoalPilgan());
//System.out.println(txtPopUp);
//String txt = addSoalPilganDKosong.getPopUpUpdateSoalPilgan();
//assertTrue(txt.contains("Berhasil"));

//		String actual = addSoalPilganDKosong.getPopUpUpdateSoalPilgan();
//assertTrue(actual.contains(expect));
//
//addSoalPilganDKosong.clickOkUpdateSoalPilgan();