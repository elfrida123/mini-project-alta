Feature: Categories
  As a user, i want to select categories product
  So that I can see the product by the selected

  @select-categories
  Scenario: Select category products
    Given I am on the home page for select categories
    When I click select categories
    Then I select the categories

  @invalid-select-categories
  Scenario: Select category products invalid
    Given I am on the home page for select categories
    When I click select categories

  @add-to-cart
  Scenario: Add product to cart
    Given I am on the home page for add product to cart
    When I select the product which want add to the cart
    Then I click icon buy

  @give-ratings
  Scenario: Give rating's product
    Given I am on the home page for give rating's product
    When I select the product which want to give rating
    And I click button Detail
    Then I click icon star

  @invalid-give-ratings
  Scenario: Give rating's product
    Given I am on the home page for give rating's product
    When I select the product which want to give rating
    Then I click button Detail

