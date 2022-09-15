Feature: Login Admin

  Scenario: Valid credential (auth admin)
    When Navigate to login page (auth admin)
    And enter "beki" as username dan "SssOoo*01" as pasword (auth admin)
    And click button signin (auth admin)
    Then appear popup greeting "Welcome" (auth admin)
    
   Scenario: Valid credential with ignore letter case (auth admin)
    When Navigate to login page (auth admin)
    And enter "BeKi" as username dan "SssOoo*01" as pasword (auth admin)
    And click button signin (auth admin)
    Then appear popup greeting "Username atau password" (auth admin)
    
  Scenario: Invalid username (auth admin)
    When Navigate to login page (auth admin)
    And enter "bekki" as username dan "SssOoo*01" as pasword (auth admin)
    And click button signin (auth admin)
    Then appear popup greeting "Username atau password" (auth admin)
   
  Scenario: Invalid password (auth admin)
    When Navigate to login page (auth admin)
    And enter "beki" as username dan "32" as pasword (auth admin)
    And click button signin (auth admin)
    Then appear popup greeting "Username atau password" (auth admin)
    
  Scenario: Null username (auth admin)
    When Navigate to login page (auth admin)
    And enter "" as username dan "SssOoo*01" as pasword (auth admin)
    And click button signin (auth admin)
    Then appear popup greeting "Username atau password" (auth admin)
    
  Scenario: Null password (auth admin)
    When Navigate to login page (auth admin)
    And enter "beki" as username dan "" as pasword (auth admin)
    And click button signin (auth admin)
    Then appear popup greeting "Username atau password" (auth admin)