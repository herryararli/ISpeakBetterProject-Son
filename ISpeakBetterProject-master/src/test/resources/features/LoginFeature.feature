Feature: Login Feature
  Scenario: Valid login
    Given user will be on login page
    When user click login button
    When user enter correct email
    And user enter correct password
    And user click sig in button
    Then User verify login page

Scenario: Use dictionary
  Given  user will be on online Student page
  When user click login button
  When user enter correct email
  And user enter correct password
  And user click sig in button
  When user click dictionary button
  When user select language
  And  user enter word
  And user click search
  Then user verify search page

  Scenario: User Send Message
    Given  user will be on online Student page
    When user click login button
    When user enter correct email
    And user enter correct password
    And user click sig in button
    When user click messages button
    And user click compose  button
    When user chooses whom to message
    And user enter title
    And  user enter message
    And user click Send button
    Then user see The message has been sent successfuly   message

Scenario: User Search Vocabulary in Vocabulary Basket
  Given  user will be on online Student page
  When user click login button
  When user enter correct email
  And user enter correct password
  And user click sig in button
  When  user click Show Vocabulary Basket button
  And user enter word  in input text
  And user click search  button
  Then User sees search results

  Scenario: User redeem demo class
    Given  user will be on online Student page
    When user click login button
    When user enter correct email
    And user enter correct password
    And user click sig in button
    When user click redeem demo class button
    And  user enter Referral Code
    And user click Next button
    Then User click close Button
