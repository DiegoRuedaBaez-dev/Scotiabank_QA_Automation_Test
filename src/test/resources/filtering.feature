Feature: Product Filtering

  Background:
    Given I am logged in as "standard_user"

  Scenario: Sort products from low to high
    When I select filter "Price (low to high)"
    Then products should be ordered from lowest to highest

  Scenario: Sort products from high to low
    When I select filter "Price (high to low)"
    Then products should be ordered from highest to lowest

  Scenario: Sort products A to Z
    When I select filter "Name (A to Z)"
    Then products should be ordered alphabetically ascending

  Scenario: Sort products Z to A
    When I select filter "Name (Z to A)"
    Then products should be ordered alphabetically descending
