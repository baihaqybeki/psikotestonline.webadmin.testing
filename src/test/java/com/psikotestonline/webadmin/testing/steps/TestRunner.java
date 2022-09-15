package com.psikotestonline.webadmin.testing.steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (tags = "", 
				features="src/test/resources/features/AddSoalPilganDKosong.feature",
				glue="com.psikotestonline.webadmin.testing.steps",
				plugin={"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests{

}
