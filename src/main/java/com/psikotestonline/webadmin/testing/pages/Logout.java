package com.psikotestonline.webadmin.testing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.psikotestonline.webadmin.testing.driver.DriverSingleton;

public class Logout {
	
	private WebDriver driver;
	
	public Logout() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='DEVELOPER']")
	private WebElement logoutBtn;
	
	@FindBy(xpath="/html/body/div[8]/div[3]/div/button[2]")
	private WebElement yaBtn;
	
	@FindBy(xpath="//*[@id=\"ui-id-1\"]")
	private WebElement frameLogin;
	
	public void logout() {
		logoutBtn.click();
		delay(1);
		yaBtn.click();
	}
	
	public String getTextFrame() {
		delay(1);
		return frameLogin.getText();
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
