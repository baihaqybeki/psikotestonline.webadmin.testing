package com.psikotestonline.webadmin.testing.steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.psikotestonline.webadmin.testing.driver.DriverSingleton;
import com.psikotestonline.webadmin.utils.Constants;
import com.psikotestonline.webadmin.utils.TestScenario;
import com.psikotestonline.webadmin.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook {
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
	public static ExtentReports reports = new ExtentReports("target/extent-reports.html");
	
	@Before
	public void setup() {
		DriverSingleton.getInstance(Constants.Chrome);
		driver = DriverSingleton.getDriver();
		TestScenario[] tests = TestScenario.values();
		extentTest = reports.startTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
	}
	
	@AfterStep
	public void getResultStatus(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			String screenshotPath = Utils.getScreenshot(driver, scenario.getName().replace(" ", "_"));
			extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
					+extentTest.addScreenCapture(screenshotPath));;
		}
	}
	
	@After
	public void closeObject() {
		reports.endTest(extentTest);
		reports.flush();
		
		delay(3);
		DriverSingleton.closeObjectInstance();
	}
	
//	@AfterAll
//	public static void closeBrowser() {
//		delay(3);
//		DriverSingleton.closeObjectInstance();
//	} 
	
	static void delay(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
