Feature: Login Admin

  Scenario: Valid credential in auth admin
    When Navigate to login page in auth admin
    And enter "beki" as username dan "SssOoo*01" as password in auth admin
    And click button signin in auth admin
    Then appear popup greeting "Welcome" in auth admin
    
   Scenario: Valid credential with ignore letter case (auth admin)
    When Navigate to login page in auth admin
    And enter "BeKi" as username dan "SssOoo*01" as password in auth admin
    And click button signin in auth admin
    Then appear popup greeting "Username atau password" in auth admin
    
  Scenario: Invalid username (auth admin)
    When Navigate to login page in auth admin
    And enter "bekki" as username dan "SssOoo*01" as password in auth admin
    And click button signin in auth admin
    Then appear popup greeting "Username atau password" in auth admin
   
  Scenario: Invalid password (auth admin)
    When Navigate to login page in auth admin
    And enter "beki" as username dan "32" as password in auth admin
    And click button signin in auth admin
    Then appear popup greeting "Username atau password" in auth admin
    
  Scenario: Null username (auth admin)
    When Navigate to login page in auth admin
    And enter "" as username dan "SssOoo*01" as password in auth admin
    And click button signin in auth admin
    Then appear popup greeting "Username atau password" in auth admin
    
  Scenario: Null password (auth admin)
    When Navigate to login page in auth admin
    And enter "beki" as username dan "" as password in auth admin
    And click button signin in auth admin
    Then appear popup greeting "Username atau password" in auth admin