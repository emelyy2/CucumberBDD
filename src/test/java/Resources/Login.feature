Feature: Login Test

  @smoke
  Scenario: Login Test
    Given I Navigate To TNB Login Page
    When I Enter Username As "admin"
    And I Enter Password As "password"
    And I Click The Login Button
    Then I Should Log Into The Application Successfully