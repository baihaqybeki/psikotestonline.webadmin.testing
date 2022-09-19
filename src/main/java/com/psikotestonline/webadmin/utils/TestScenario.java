package com.psikotestonline.webadmin.utils;

public enum TestScenario {
		
	T1("Valid credential"),
	T2("Valid credential with ignore letter case"),
	T3("Invalid username"),
	T4("Invalid password"),
	T5("Null username"),
	T6("Null password"),
	T329("View existing report"),
	T330("View unexisting report"),
	T331("Export existing report"),
	T332("Export unexisting report"),
	T343("Search existing report by complete nik"),
	T344("Search existing report by uncomplete nik"),
	T345("Search existing report by wrong nik"),
	T346("Search existing report by complete name fill with Uppercase"),
	T347("Search existing report by uncomplete name fill with Uppercase"),
	T348("Search existing report by complete name fill with Sentence case"),
	T349("Search existing report by uncomplete name fill with Sentence case"),
	T350("Search existing report by complete name fill with lowercase"),
	T351("Search existing report by uncomplete name fill with lowercase"),
	T352("Search existing report by complete name fill with capitalize each world"),
	T353("Search existing report by uncomplete name fill with capitalize each world"),
	T354("Search existing report by complete name fill with Toggle case"),
	T374("Delete existing report");
	private String testName;
	
	TestScenario(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
