Feature:Add User Test feature
  As a User, I should be able to check Login Test features

  Background: User is on Login Page
    When      User enters Username "Admin"
    And       User enters password "admin123"
    Then      User clicks on login button


   @smoke @sanity @regression
  Scenario: User should be able to login successfully
    And User verifies "Dashboard" text


   @regression
  Scenario: User should be able to logout successfully
    And     User clicks on profile logo
    Then    User mouse hover on logout and click
    And     User verifies "Login" text is displayed