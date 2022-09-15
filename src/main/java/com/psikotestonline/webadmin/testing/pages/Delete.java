package com.psikotestonline.webadmin.testing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.psikotestonline.webadmin.testing.driver.DriverSingleton;

public class Delete {
private WebDriver driver;
	
	public Delete () {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath= "//span[normalize-space()='Remove Activity']")
	private WebElement removeActivity;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[2]/div[6]/table/tbody/tr[1]/td[10]/div/table/tbody/tr[1]/td/div/img")
	private WebElement chooseDelete;
	
	@FindBy(xpath = "/html/body/div[8]/div[3]/div/button[1]/span")
	private WebElement yesDelete;
	
	@FindBy (xpath = "//*[@id=\"nikita-form-dialog\"]/p")
	private WebElement popUpDelete;
	
	@FindBy (xpath = "/html/body/div[8]/div[3]/div/button/span")
	private WebElement okPopUpDelete;
	
	
	public void clickRemoveActivity() {
		removeActivity.click();
	}
	
	public void clickChooseDelete() {
		chooseDelete.click();
	}
	public void clickYesDelete() {
		yesDelete.click();
	}
	public String getPopUpDelete() {
		return popUpDelete.getText();
	}
	public void clickOkPopUpUpdate() {
		okPopUpDelete.click();
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
