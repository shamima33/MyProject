Feature: User Login
  As a registered user
  I want to log in to my account on the Iqra Shopping website
  So that I can access my account and make purchases


  Scenario:  Successful login
    Given  I am on the login page
    When  I enter valid user name and password
    And      I click the login Button
    Then    I should be landed to the dashboard.
