
Feature: Search Remove Activity

  Scenario: Search existing report by complete nik
	When navigate dashboard page 343
	And click button report 343
	And click remove activity 343
	And type existing report by complete nik in search box 343
	And click button search 343
	Then data displayed 343
	
	Scenario: Search existing report by uncomplete nik
	When navigate dashboard page 344
  And click button report 344
  And click remove activity 344
  And type existing report by uncomplete nik in search box 344
  And click button search 344
  Then data not displayed 344

  Scenario: Search existing report by wrong nik
	When navigate dashboard page 345
  And click button report 345
  And click remove activity 345
  And type existing report by wrong nik in search box 345
  And click button search 345
  Then data not displayed 345
  
  Scenario: Search existing report by complete name fill with Uppercase
	When navigate dashboard page 346
  And click button report 346
  And click remove activity 346
  And type existing report by complete name fill with Uppercase in search box 346
  And click button search 346
  Then data displayed 346
  
  Scenario: Search existing report by uncomplete name fill with Uppercase
	When navigate dashboard page 347
  And click button report 347
  And click remove activity 347
	And type existing report by uncomplete name fill with Uppercase in search box 347
  And click button search 347
  Then data not displayed 347
  
  Scenario: Search existing report by complete name fill with Sentence case
  When navigate dashboard page 348
  And click button report 348
  And click remove activity 348
  And type existing report by complete name fill with Sentence case in search box 348
  And click button search 348
  Then data displayed 348
  
  Scenario: Search existing report by uncomplete name fill with Sentence case
	When navigate dashboard page 349
	And click button report 349
	And click remove activity 349
	And type existing report by uncomplete name fill with Sentence case in search box 349
	And click button search 349
	Then data not displayed 349
	
	Scenario: Search existing report by complete name fill with lowercase
	When navigate dashboard page 350
  And click button report 350
  And click remove activity 350
  And type existing report by complete name fill with lowercase in search box 350
  And click button search 350
  Then data displayed 350
	
	Scenario: Search existing report by uncomplete name fill with lowercase
	When navigate dashboard page 351
  And click button report 351
  And click remove activity 351
  And type existing report by uncomplete name fill with lowercase in search box 351
  And click button search 351
  Then data not displayed 351
  
  Scenario: Search existing report by complete name fill with capitalize each world
  When navigate dashboard page 352
  And click button report 352
  And click remove activity 352
  And type existing report by complete name fill with capitalized each world in search box 352
  And click button search 352
  Then data displayed 352
  
  Scenario: Search existing report by uncomplete name fill with capitalize each world
  When navigate dashboard page 353
  And click button report 353
  And click remove activity 353
  And type existing report by uncomplete name fill with capitalized each world in search box 353
  And click button search 353
  Then data not displayed 353
  
  Scenario: Search existing report by complete name fill with Toggle case
  When navigate dashboard page 354
  And click button report 354
  And click remove activity 354
  And type existing report by complete name fill with toogle case in search box 354
  And click button search
  Then data not displayed 354
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
  
  
  
  
  
  
  
  
  
  
  
  
  