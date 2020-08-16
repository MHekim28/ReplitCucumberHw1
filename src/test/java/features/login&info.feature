Feature: login into AutomationPractice Webpage
  Scenario: Successfully login into AutomationPractice Webpage
    Given Navigate to: http://automationpractice.com/index.php
    When Click on first sign in button
    Then Enter the Email Address and Password
    And Click on sign in button
    Then Click on the " My personal information "
    When I change the Name to " TT "
    And I change the password to "gY1aB9xQ2xB4sG4d"
    Then Click on the save button
    Then Verify the name it is not " SS "
    Then go back to account page again
    Then Click on the " My personal information "
    When I change the Name to " SS "
    And I change the password to "gY1aB9xQ2xB4sG4d"
    Then Click on the save button
    Then Verify the name is "SS BB"