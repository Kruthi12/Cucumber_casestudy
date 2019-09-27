Feature: Signup page

  Scenario: Successful signup
    Given User opens the application
    When User clicks on signup link
    And User enters username as "ABCEDF1"
    And User enters firstname as "ABC"
    And User enters lastname as "DEF"
    And User enters password as "abcedf1"
    And User enters confirm_password as "abcedf1"
    And User enters gender as "Female"
    And User enters email as "abc@gmail.com"
    And User enters mobile as 1234567890
    And User enters dob as "12/10/2019"
    And User enters address as "Bangalore"
    And User enters security question as 1
    And User enters answer as "Violet"
    Then Message displayed signup successful