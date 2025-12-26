Feature: Order Management

  Scenario: Placing a new order
    Given user "John Doe" is logged in
    When "John Doe" adds "Laptop (1500.00)" to the cart
    And "John Doe" adds "Mouse (50.00)" to the cart
    Then the total order amount should be 1550.00
    And the order should contain "Laptop" and "Mouse"