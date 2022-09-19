Feature: Logout Super Admin

  Scenario: Logout sebagai Super Admin
    When navigate to dashboard page for logout super admin
    And click button profile for logout super admin
    Then validate page for logout super admin
    
  Scenario: Logout sebagai Admin
    When navigate to dashboard page for logout admin
    And click button profile for logout admin
    Then validate page for logout admin