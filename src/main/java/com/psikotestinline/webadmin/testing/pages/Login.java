package com.psikotestinline.webadmin.testing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.psikotestonline.webadmin.testing.driver.DriverSingleton;

public class Login {
	
	private WebDriver driver;
	
	public Login() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="tl_login-1-51550_text")
	private WebElement username;
	
	@FindBy(id="tl_login-1-51551_text")
	private WebElement password;
	
	@FindBy(xpath="//span[normalize-space()='Sign In']")
	private WebElement btnSignin;
	
	@FindBy(xpath="//*[@id=\"nikita-form-dialog\"]/p")
	private WebElement popUP;
	
	@FindBy(xpath="/html/body/div[8]/div[3]/div/button")
	private WebElement okBtn;
	
	public void login(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
	}
	
	public void clickBtn() {
		btnSignin.click();
	}
	
	public String getMessage() {
		return this.popUP.getText();
	}
	
	public void clickOk() {
		delay(3);
		okBtn.click();
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