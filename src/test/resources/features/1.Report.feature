Feature: Report Psikotest Online
  Scenario: View existing report
 When navigate dashboard page 329
 And click button report 329
 And click button report above remove activity 329
 And choose the date that existing report 329
 And click button view 329
 Then data displayed 329

Scenario: View unexisting report
 When navigate dashboard page 330
 And click button report 330
 And click button report above remove activity 330
 And choose the date that unexisting report 330
 And click button view 330
 Then data not displayed 330
 
 Scenario: Export existing report
 When navigate dashboard page 331
 And click button report 331
 And click button report above remove activity 331
 And choose the date that existing report 331
 And click button export 331
 Then data automatically downloaded 331
 
 Scenario: Export unexisting report
 When navigate dashboard page 332
 And click button report 332
 And click button report above remove activity 332
 And choose the date that unexisting report 332
 And click button export 332
 Then data automatically downloaded 332