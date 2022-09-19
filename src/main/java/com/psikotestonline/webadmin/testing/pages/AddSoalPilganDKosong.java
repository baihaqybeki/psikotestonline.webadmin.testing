package com.psikotestonline.webadmin.testing.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.psikotestonline.webadmin.testing.driver.DriverSingleton;

public class AddSoalPilganDKosong {

	private WebDriver driver;
	
	public AddSoalPilganDKosong () {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	//editsoal pilgan tc pertama
	@FindBy(xpath="/html/body/div[8]/div[3]/div/button")
	private WebElement okBtn;
	
	@FindBy(xpath="//h3[@id='ui-id-9']")
	private WebElement task;
	
	@FindBy(xpath = "//span[normalize-space()='Modul']")
	private WebElement modul;
	
	@FindBy(xpath = "//input[@id='tl_dis_agree--52808_text']")
	private WebElement boxSearch;
	
	@FindBy(xpath = "//span[normalize-space()='Search']")
	private WebElement btnSearch;
	
	@FindBy(xpath= "//*[@id=\"--_text\"]")
	private WebElement addSoalPilgan;
	
	@FindBy(xpath = "/html/body/div[9]/div[1]/div/a[3]/span")
	private WebElement maximizeToEdit;
	
	@FindBy(xpath="/html/body/div[9]/div[2]/div/div[4]/div[6]/table/tbody/tr/td[7]/div/table/tbody/tr[1]/td[1]/div/img")
	private WebElement editSoalPilgan;
	
	@FindBy (xpath="//textarea[@id='tl_template_script_edit--53087_text']")
	private WebElement txtEditSoalPilgan;
	
	@FindBy(xpath = "//*[@id=\"tl_template_script_edit--53087_text\"]")
	private WebElement kunciJawabanPilgan;
	
	@FindBy(xpath = "//*[@id=\"53105_query\"]/span")
	private WebElement updateSoalPilgan;
	
	@FindBy (xpath = "//*[@id=\"nikita-form-dialog\"]/p")
	private WebElement popUpUpdateSoalPilgan;
	
	@FindBy (xpath = "/html/body/div[8]/div[3]/div/button/span")
	private WebElement okUpdateSoalPilgan;
	
	
	public void clickOk() {
		delay(3);
		okBtn.click();
	}
	public void clickModul() {
		modul.click();
	}
	
	public void clickTask() {
		task.click();
	}
	
	public void clickAddSoalPilgan() {
		addSoalPilgan.click();
	}
	
	public void searchSoal(String boxSearch) {
		this.boxSearch.sendKeys(boxSearch);
	}
	public void clickBtnSearch() {
		btnSearch.click();
	}
	
	public void clickMaximizeToEdit() {
		delay(2);
		maximizeToEdit.click();
	}
	
	public void clickEditSoalPilgan() {
		delay(2);
		editSoalPilgan.click();
	}
	//jawaban a
	public void chooseKunciJawaban() {
		Select kunciJawabanPilgan = new Select (driver.findElement(By.id("tl_template_script_edit--53104_text")));
		kunciJawabanPilgan.selectByIndex(1);
	}
	public void clickUpdateSoalPilgan() {
		updateSoalPilgan.click();
	}
	
	public void clickTxtEditSoalPilgan() {
		this.txtEditSoalPilgan.clear();
	}
	
	
	public String getPopUpUpdateSoalPilgan() {
		return popUpUpdateSoalPilgan.getText();
	}
	
	public void clickOkUpdateSoalPilgan() {
		okUpdateSoalPilgan.click();
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