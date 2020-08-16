Feature: login into AutomationPractice Webpage
  Scenario: Successfully login into AutomationPractice Webpage
    Given Navigate to:  http://automationpractice.com/index.php
    When Click on first sign in button
    Then Enter the Email Address and Password
    And Click on sign in button