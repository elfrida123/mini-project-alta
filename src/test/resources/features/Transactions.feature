Feature: Transactions

  @pay-item
  Scenario: Pay the items
    Given I am on the home page
    When I select the product which want to pay
    And I click button Bayar
    Then I am on the transaction page

  @view-transactions-rows-5
  Scenario: View all transactions per page 5
    Given I am on the transaction page for view all transaction page 5
    When I click icon dropdown in rows per page
    Then I select 5

  @invalid-view-transactions-rows-5
  Scenario: Invalid view all transactions per page 5
    Given I am on the transaction page for view all transaction page 5
    When I click icon dropdown in rows per page

  @view-transactions-rows-10
  Scenario: View all transactions per page 10
    Given I am on the transaction page for view all transaction page 10
    When I click icon dropdown in rows per page
    Then I select 10

  @invalid-view-transactions-rows-10
  Scenario: Invalid view all transactions per page 10
    Given I am on the transaction page for view all transaction page 10
    When I click icon dropdown in rows per page

  @view-transactions-rows-15
  Scenario: View all transactions per page 15
    Given I am on the transaction page for view all transaction page 15
    When I click icon dropdown in rows per page
    Then I select 15

  @invalid-view-transactions-rows-15
  Scenario: Invalid view all transactions per page 15
    Given I am on the transaction page for view all transaction page 15
    When I click icon dropdown in rows per page

  @valid-produk-asc
  Scenario: View all transaction filtering by Produk ascending
    Given I am on the transaction page for filtering by Produk ascending
    When I click icon dropdown in field Produk

  @valid-produk-desc
  Scenario: View all transaction filtering by Produk descending
    Given I am on the transaction page for filtering by Produk descending
    When I click icon dropdown descending in field Produk

  @valid-harga-ascending
  Scenario: View all transaction filtering by Harga ascending
    Given I am on the transaction page for filtering by Harga ascending
    When I click icon dropdown in field Harga

  @valid-harga-descending
  Scenario: View all transaction filtering by Harga descending
    Given I am on the transaction page for filtering by Harga descending
    When I click icon dropdown descending in field Harga

  @valid-banyaknya-ascending
  Scenario: View all transaction filtering by Banyaknya ascending
    Given I am on the transaction page for filtering by Banyaknya ascending
    When I click icon dropdown ascending in field Banyaknya

  @valid-banyaknya-descending
  Scenario: View all transaction filtering by Banyaknya descending
    Given I am on the transaction page for filtering by Banyaknya descending
    When I click icon dropdown in field Banyaknya

  @valid-subtotal-ascending
  Scenario: View all transaction filtering by Sub-total ascending
    Given I am on the transaction page for filtering by Sub-total ascending
    When I click icon dropdown ascending in field Sub-total

  @valid-subtotal-descending
  Scenario: View all transaction filtering by Sub-total descending
    Given I am on the transaction page for filtering by Sub-total descending
    When I click icon dropdown in field Sub-total