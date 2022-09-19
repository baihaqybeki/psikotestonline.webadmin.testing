package com.psikotestonline.webadmin.testing.pages;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.psikotestonline.webadmin.testing.driver.DriverSingleton;

public class Report {
	private WebDriver driver;
	public Report() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	//view exiting report
	@FindBy(xpath="/html/body/div[8]/div[3]/div/button")
	private WebElement okBtn;
	
	@FindBy(xpath="//h3[@id='ui-id-11']")
	private WebElement report;
	
	@FindBy(xpath = "//span[normalize-space()='Report']")
	private WebElement reportReport;
	
	@FindBy(xpath ="//input[@id='tl_report_setuju--51772_text']")
	private WebElement dateFrom;
	
	@FindBy(xpath = "//input[@id='tl_report_setuju--51780_text']")
	private WebElement dateUntil;
	
	@FindBy (xpath ="//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")
	private WebElement toAgust;
	
	@FindBy (xpath ="//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")
	private WebElement toJuly;
	
	@FindBy (xpath ="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]/a")
	private WebElement date1;
	
	@FindBy (xpath ="//a[text()='1']")
	private WebElement date1July;
	
	@FindBy (xpath="//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")
	private WebElement july2022;
	
	
	@FindBy (xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[1]/a")
	private WebElement date18;
	
	@FindBy (xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[5]/a")
	private WebElement date29;
	
	@FindBy (xpath ="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[6]/a")
	private WebElement date30;
	
	@FindBy (xpath="//span[normalize-space()='View']")
	private WebElement view;
	
	@FindBy (xpath="//span[normalize-space()='Export']")
	private WebElement export;
	
	public void clickOk() {
		delay(3);
		okBtn.click();
	}
	public void clickReport() {
		report.click();
	}
	
	public void clickJuly() {
		july2022.click();
	}
	
	public void clickReportReport() {
		reportReport.click();
	}
	public void clickDateFrom() {
		dateFrom.click();
	}
	public void clickDateUntil() {
		dateUntil.click();
	}
	public void clickToAgust() {
		toAgust.click();
	}
	public void clickToJuly() {
		toJuly.click();
	}
	public void clickDate1(){
		date1.click();
	}
	
	public void clickDate18() {
		date18.click();
	}

	public void clickDate29() {
		date29.click();
	}
	
	public void clickDate1July() {
		july2022.click();
		date1July.click();
	}
	
	public void clickDate30() {
		date30.click();
	}
	public void clickView() {
		view.click();
	}

	public void clickExport() {
		export.click();
	}
	public boolean isFileDownloaded(String downloadPath, String fileName) {
		  File dir = new File(downloadPath);
		  File[] dirContents = dir.listFiles();

		  for (int i = 0; i < dirContents.length; i++) {
		      if (dirContents[i].getName().equals(fileName)) {
		          // File has been found, it can now be deleted:
		          dirContents[i].delete();
		          return true;
		      }
		          }
		      return false;
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
