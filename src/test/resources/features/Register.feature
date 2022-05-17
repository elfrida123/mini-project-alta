@register
Feature: Register
  As a user, I want to create new account
  So that I can login to the website

  @valid_register
  Scenario: Registration with valid data
    Given I am on the registration page
    When I fill the field Nama Lengkap with valid format
    And I fill the field Email with valid format
    And I fill the field Password with valid password
    And click the Register button
    Then I am on the login page

  @invalid_register
  Scenario Outline: Registration with invalid data
    Given I am on the registration page
    When I fill the field "<NamaLengkap>" Nama Lengkap
    And I fill the field "<Email>" Email
    And I fill the field "<Password>" Password
    And click the Register button
    Then get error message
    Examples:
      | NamaLengkap                           | Email                 | Password    |
      | 097361==i                             | elfrida@gmail.com     | Akucantik   |
      | Elfrida Tampubolon                    | %gmail.com            | Akucantik   |
      | Elfrida Tampubolon                    | elfrida123@gmail.com  | Akucantik   |
      | elfrida@gmail.comelfrida121@gmail.com | elfrida@gmail.com     | Akucantik   |
      | q                                     | @                     | r           |
      | elfrida!!88                           | elfrida@gmail.com     | elfrida$$12 |
      | ELfRidA                               | elfrida@gmail.com     |HgaklsOPH    |


