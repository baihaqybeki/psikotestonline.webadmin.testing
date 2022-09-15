Feature: Login Super Admin

  Scenario: Valid credential
    When Navigate to login page
    And enter "developer" as username dan "23" as pasword
    And click button signin
    Then appear popup greeting "Welcome"
    
   Scenario: Valid credential with ignore letter case
    When Navigate to login page
    And enter "dEveLoPEr" as username dan "23" as pasword
    And click button signin
    Then appear popup greeting "Username atau password"
    
  Scenario: Invalid username
    When Navigate to login page
    And enter "develover" as username dan "23" as pasword
    And click button signin
    Then appear popup greeting "Username atau password"
   
  Scenario: Invalid password
    When Navigate to login page
    And enter "developer" as username dan "32" as pasword
    And click button signin
    Then appear popup greeting "Username atau password"
    
  Scenario: Null username
    When Navigate to login page
    And enter "" as username dan "23" as pasword
    And click button signin
    Then appear popup greeting "Username atau password"
    
  Scenario: Null password
    When Navigate to login page
    And enter "developer" as username dan "" as pasword
    And click button signin
    Then appear popup greeting "Username atau password"