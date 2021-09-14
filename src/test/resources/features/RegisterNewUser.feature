@End2End
Feature: This feature will be registering new user

  Scenario: Register new user
    Given user is on homepage
    When user clicks on signup button
    And user is taken to prospect register page "https://www.abcmouse.com/abc/prospect-register/"
    And user enters email and clicks submit button
    And user is taken to subscription page "https://www.abcmouse.com/abc/subscription/"
    Then on subscription page "Become a Member!" is displayed

