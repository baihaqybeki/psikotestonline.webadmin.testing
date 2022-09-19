package com.psikotestonline.webadmin.testing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.psikotestonline.webadmin.testing.driver.DriverSingleton;

public class SearchRemoveActivity {
private WebDriver driver;
	
	public SearchRemoveActivity () {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/div[8]/div[3]/div/button")
	private WebElement okBtn;
	
	@FindBy(xpath="//input[@id='tl_remove_activity--53435_text']")
	private WebElement boxSearchRA;
	
	@FindBy(xpath = "//span[normalize-space()='Search']")
	private WebElement searchRA;
	
	@FindBy(xpath = "//span[normalize-space()='Remove Activity']")
	private WebElement removeActivity;
	
	@FindBy(xpath = "//*[@id=\"tl_remove_activity--53429\"]/div[8]")
	private WebElement msgShowPage;
	
	public void clickOk() {
		delay(3);
		okBtn.click();
	}
	public void clickRemoveActivity() {
		removeActivity.click();
	}

	
	public void typeBoxSearchRA(String boxSearchRA) {
		this.boxSearchRA.sendKeys(boxSearchRA);
	}
	
	public void clickSearchRA() {
		searchRA.click();
	}
	public String getMsgShowPage() {
		return msgShowPage.getText();
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










