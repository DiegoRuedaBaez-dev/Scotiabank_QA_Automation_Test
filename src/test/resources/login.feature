Feature: Login Functionality

  Background:
    Given I am on the SauceDemo login page

  Scenario Outline: Login attempts for multiple user types
    When I enter username "<user>"
    And I enter password "<password>"
    And I click the login button
    Then I should see "<result>"

    Examples:
      | user               | password      | result                         |
      | standard_user      | secret_sauce  | inventory page is displayed    |
      | locked_out_user    | secret_sauce  | locked out error is shown      |
      | problem_user       | secret_sauce  | inventory page is displayed    |
      | performance_glitch_user | secret_sauce | inventory page is displayed |
      | error_user         | secret_sauce  | inventory page is displayed    |
      | visual_user        | secret_sauce  | inventory page is displayed    |
