Feature: This feature will be registering new user

  Scenario: Register new user
    Given user is on homepage
    When user clicks on signup button
    Then user is taken to prospect register page "https://www.abcmouse.com/abc/prospect-register/"
    Then user enters email "johnwick@gmail.com" and clicks submit button
    Then user is taken to subscription page "https://www.abcmouse.com/abc/subscription/"

