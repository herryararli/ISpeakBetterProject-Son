Feature: Home Page Test

  Scenario: Test HomePage URL
    Given user is on the HomePage
    When get homepage url
    Then verify if url is expected

  Scenario:Test HomePage title
    Given user is on the HomePage
    When get homepage title
    Then verify if title is expected

  Scenario: Test Contact button
    Given user is on the HomePage
    When Test Contact button
    Then See Contact page

  Scenario: Test login button
    Given user is on the HomePage
    When Test login button
    Then See login page

  Scenario: Test AppStore text link
    Given user is on the HomePage
    When Test AppStore button
    Then See AppStore page
