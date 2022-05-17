Feature: Cart

  @add-quantity
  Scenario: Add item quantity
    Given I am on the home page
    When I select the product which want to add quantity
    Then I click icon add

  @reduce-quantity
  Scenario: Reduce item quantity
    Given I am on the home page
    When I select the product which want to reduce quantity
    Then I click icon minus

