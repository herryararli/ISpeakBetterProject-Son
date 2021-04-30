Feature: ContactPage Feature

  Scenario:Go ContactPage
    Given user is on the ContactPage
    When user clicks contact
    And user send a name
    And user send an Email
    And user select refund
    And user send a message
    And user click contact button
    Then  user get warning message


