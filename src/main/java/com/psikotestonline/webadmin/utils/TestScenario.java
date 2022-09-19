package com.psikotestonline.webadmin.utils;

public enum TestScenario {
		
	T1("Valid credential"),
	T2("Valid credential with ignore letter case"),
	T3("Invalid username"),
	T4("Invalid password"),
	T5("Null username"),
	T6("Null password"),
	T7("Valid credential in auth admin"),
	T8("Valid credential with ignore letter case (auth admin)"),
	T9("Invalid username (auth admin)"),
	T10("Invalid password (auth admin)"),
	T11("Null username (auth admin)"),
	T12("Null password (auth admin)"),
	T13("Add user management"),
	T14("Add new user without fill full name"),
	T15("Add existing user"),
	T16("Logout sebagai Super Admin"),
	T17("Logout sebagai Admin");
	
	private String testName;
	
	TestScenario(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
