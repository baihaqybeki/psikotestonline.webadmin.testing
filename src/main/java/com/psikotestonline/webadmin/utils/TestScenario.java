package com.psikotestonline.webadmin.utils;

public enum TestScenario {
		
	T1("User valid Login"),
	T2("User invalid Login"),
	T3("user add item");
	
	private String testName;
	
	TestScenario(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
