package com.psikotestonline.webadmin.testing.pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.psikotestonline.webadmin.testing.driver.DriverSingleton;

public class AddUserManagement {
	
	private WebDriver driver;
	
	public AddUserManagement() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"ui-id-7\"]")
	private WebElement userManageTab;
	
	@FindBy(xpath="//*[@id=\"tele_menu--52831\"]")
	private WebElement adminTab;
	
	@FindBy(xpath="//span[normalize-space()='Add']")
	private WebElement addBtnDashboard;
	
	@FindBy(id="tl_agent_editable-14-51730_text")
	private WebElement fullNameForm;
	
	@FindBy(id="tl_agent_editable-14-51736_text")
	private WebElement telephone;
	
	@FindBy(xpath="//*[@id=\"tl_agent_editable-14-51740_text\"]")
	private WebElement username;
	
	@FindBy(id="tl_agent_editable-14-51741_text")
	private WebElement password;
	
	@FindBy(xpath="//span[normalize-space()='Save']")
	private WebElement btnSave;
	
	@FindBy(xpath="/html/body/div[8]/div[3]/div/button[2]")
	private WebElement btnYes;
	
	@FindBy(id="tl_user_management--51690_text")
	private WebElement searchFormAdmin;
	
	@FindBy(xpath="//span[normalize-space()='Search']")
	private WebElement searchBtn;
	
	@FindBy(id="tl_user_management--51688_table")
	private WebElement tableUserAdmin;
	
	@FindBy(xpath="//*[@id=\"nikita-form-dialog\"]/p")
	private WebElement negativePopUp;
	
	
	
//	@FindBy(id="tl_agent_editable-14-51733_text")
//	private Select supervisor;
//	
	
	public void clickManage() {
		userManageTab.click();
	}
	
	public void clickAdminTab() {
		adminTab.click();
	}
	
	public void clickAddDash() {
		delay(1);
		addBtnDashboard.click();
	}
	
	public void fillForm(String privileges, String supervisor) {
		fullNameForm.sendKeys("User Baru");
		choosePrivileges(privileges);
		chooseSupervisor(supervisor);
		telephone.sendKeys("14045");
		username.sendKeys("newuser");
		password.sendKeys("password");
	}
	
	public void fillFormWithoutUsername(String privileges, String supervisor) {
		choosePrivileges(privileges);
		chooseSupervisor(supervisor);
		telephone.sendKeys("14045");
		username.sendKeys("newuser");
		password.sendKeys("password");
	}
	
	public void clickBtnSave() {
		delay(1);
		btnSave.click();
	}
	
	public void clickYesBtn() {
		delay(1);
		btnYes.click();
	}
	
	public void choosePrivileges(String privileges) {
		Select privilegesOpt = new Select (driver.findElement(By.id("tl_agent_editable-14-51731_text")));
		
		if(privileges.equalsIgnoreCase("Admin")) {
			privilegesOpt.selectByIndex(1);
		} else if (privileges.equalsIgnoreCase("")) {
			privilegesOpt.selectByIndex(2);
		} else if (privileges.equalsIgnoreCase("null")) {
			privilegesOpt.selectByIndex(0);
		}
	}
	
	public void chooseSupervisor(String supervisor) {
		Select supervisorOpt = new Select (driver.findElement(By.id("tl_agent_editable-14-51733_text")));
		
		if(supervisor.equalsIgnoreCase("developer")) {
			supervisorOpt.selectByIndex(1);
		} else if(supervisor.equalsIgnoreCase("null")) {
			supervisorOpt.selectByIndex(0);
		}
	}
	
	public boolean validateUser() {
		Select showPage = new Select(driver.findElement(By.xpath("//*[@id=\"tl_user_management--51688_show_text\"]")));
		showPage.selectByValue("500");
		
		delay(1);
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,150);", "");
		
		int temp = 0;
		
		List<WebElement> totalRows =tableUserAdmin.findElements(By.tagName("tr"));
		int rowsCount = totalRows.size();
		
		for (int row=0; row<rowsCount;row++) {
			List<WebElement> columns_row = totalRows.get(row).findElements(By.tagName("td"));
			
			 int columns_count = columns_row.size();
//             System.out.println("Number of cells In Row "+row+" are "+columns_count);
             
             for (int column=0; column<columns_count; column++){
            	 String celtext = columns_row.get(column).getText();
//                 System.out.println("Cell Value Of row number "+row+" and column number "+column+" Is "+celtext); 
                 if (celtext.equalsIgnoreCase("user baru")) {
                	 temp++;
                 }
             }
		}
		
		if (temp>0) {
			return true;
		}else {return false;}

	}
	
	public String getPopUpMessage() {
		delay(2);
		return this.negativePopUp.getText();
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


