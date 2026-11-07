Feature: longest substring length

  Scenario: abcabcbb shows length 3
    Given the user navigates to the input page
    Then the user should see the brand title "Agrichain" on the input page
    And the user should see the login link "Login" on the input page
    And the user should see the register link "Register" on the input page
    When the user enters the "abcabcbb" in the string input
    And the user clicks on the Submit button
    Then the user should see the result page
    And the user should see the brand title "Agrichain" on the result page
    And the user should see the output label "Output is:"
    And the user should see the output value "123"
    And the user should see the back to home text "Back to Home"