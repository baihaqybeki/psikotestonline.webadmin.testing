package com.psikotestonline.webadmin.testing.steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (tags = "", 
				features={"src/test/resources/features/1.Report.feature",
						"src/test/resources/features/2.SearchRemoveActivity.feature",
						"src/test/resources/features/3.Delete.feature"},
				
				glue="com.psikotestonline.webadmin.testing.steps",
				plugin={"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests{

}
