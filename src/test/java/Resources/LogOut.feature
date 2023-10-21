Feature: Log Out Button is working

  @smoke
  Scenario: Log Out Button is working
    Given User log Into The TNB
    When User Is On The Home Page
    And User Check Log Out Button Is Displayed
    And User Click Log Out
    Then User Should Be Successfully Logged Out