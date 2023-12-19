@regression
Feature:Add User Test feature
  As a User, I should be able to check Add User Test features

  Background: User is on Login Page
    When      User enters Username "Admin"
    And       User enters password "admin123"
    Then      User clicks on login button

  @smoke @sanity
  Scenario: Admin should add user successfully
    When User navigates to add user page
    Then User clicks on Admin tab
    And  User verifies "System Users" Text
    And  User clicks on add button
    Then User verify Text "Add User"
    Then User Select User Role "Admin"
    And  User enters employee name "Lisa  Andrews"
    And  User enters Username "username"
    And  User selects status "Disabled"
    And  User enters password
    And  User enters confirm password
    Then User clicks on save button



  @smoke @regression
  Scenario: Search the user created
    When User clicks on Admin tab
    And  User verifies "System Users" Text
    And  User enters username "Admin"
    Then User clicks on search button




  Scenario: Admin should be able to delete the user successfully
    When User clicks on Admin tab
    And  User verifies "System Users" Text
    And  User clicks on add button
    Then User verify Text "Add User"
    Then User Select User Role "Admin"
    And  User enters employee name "Lisa  Andrews"
    And  User enters password
    And  User enters confirm password
    Then User clicks on save button
    And  User enters username "Admin"
    Then User clicks on search button
    Then User clicks on delete button
    And User clicks on yes pop up delete button                                        |

  Scenario Outline: User should be able to see error message when logging in using invalid credentials
    Given User is on login page
    When User enter Username "<username>"
    And  User enter Password "<password>"
    And  User clicks on login button
    Then User verifies error Text "<errorMessage>"

    Examples:
      | username          | password | errorMessage        |
      |                   |          | Required            |
      | test123@gmail.com |          | Required            |
      |                   | test123  | Required            |
      | test123@gmail.com | test123  | Invalid credentials |