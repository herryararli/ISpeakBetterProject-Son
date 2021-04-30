Feature: SignupPage Feature
    Scenario:Go SignupPage
     Given user is on  HomePage
     When user clicks sign up
     Then  verify if links opens correct page

    Scenario:Test if Sign in link works
      Given user is on  HomePage
      When user clicks sign up
      And user clicks sign in
      Then user sees sign in section

      Scenario:Test if Facebook Text link works properly
        Given user is on  HomePage
        When user clicks sign up
        And user clicks Facebook link
        Then user is on the Facebook page

       Scenario:Test if Google Text link works properly
        Given user is on  HomePage
        When user clicks sign up
        And user clicks Google link
        Then user is on the Google+ page

       Scenario:Check if Terms and Conditions selectable
        Given user is on  HomePage
        When user clicks sign up
        Then user select Terms and Conditions

        Scenario:Verify  if  Sign up warning Text is visible
           Given user is on  HomePage
           When user clicks sign up
           And user clicks Sign up link
           Then user see the warning message






