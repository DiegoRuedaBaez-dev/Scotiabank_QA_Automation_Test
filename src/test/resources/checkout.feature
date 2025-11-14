Feature: Checkout process

  Background:
    Given I navigate to the login page

  Scenario Outline: Checkout flow for multiple user types
    When I log in using "<user>" with password "secret_sauce"
    And I add a product to the cart
    And I go to the cart
    And I click Checkout
    And I enter first name "Diego"
    And I enter last name "Rueda"
    And I enter postal code "050001"
    And I continue checkout
    Then I should see the checkout overview page
    And the user "<user>" should be able to complete the order

    Examples:
      | user                      |
      | standard_user             |
      | problem_user              |
      | performance_glitch_user   |
      | error_user                |
      | visual_user               |
