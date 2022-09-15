package com.psikotestonline.webadmin.utils;

public enum TestScenario {
		
	T1("Valid credential"),
	T2("Valid credential with ignore letter case"),
	T3("Invalid username"),
	T4("Invalid password"),
	T5("Null username"),
	T6("Null password"),
	T7("Edit soal type modul pilihan ganda, soal kosong, opsi jawaban d kosong, kunci jawaban a");
	
	private String testName;
	
	TestScenario(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
