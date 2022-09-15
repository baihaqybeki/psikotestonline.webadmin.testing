
Feature: Delete Report Psikotest

  Scenario: Delete existing report 374
	When navigate dashboard page 374
	And click button report 374
	And click remove activity 374
	And click button delete that existing report 374
	And click button yes 374
	Then appear popup 374

