@login
Feature: Login
  As a user, I want to login
  So that I can see my dashboard

  @valid_login
  Scenario: Login successful
    Given I am on the login page
    When I input valid email
    And I input valid password
    And click login button
    Then I am on the home page

  @invalid_login
  Scenario Outline: Login unsuccessful
    Given I am on the login page
    When I input "<email>" email
    And I input "<password>" password
    And click login button
    Then I'm get message error
    Examples:
        | email             | password     |
        | elfrida@gmail.com | Aku          |
        | elfrida@.com      | Akucantik88@ |
        | elfrida@gmail.com |              |
        | elfrida@.com      |              |
        |                   | Akucantik88@ |
        |                   | Aku          |