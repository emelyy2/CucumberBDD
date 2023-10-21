
  Feature: Verify Add Money Button is displayed

    @smoke
    Scenario: Verify Add Money Button is Displayed

      Given I log Into The TNB
      When I Am On The Home Page
      Then I Should See Add Money Button Is Displayed