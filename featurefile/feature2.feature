Feature: Login page
 Scenario Outline: Successful login with credentials
    Given Users opens the application
    When User clicks on signin link
    And User enters username as "<username>" and "<password>"
    Then Message displayed as Login Successful
    
    Examples: 
      | username  | password |
      | lalitha | password123 |
      | ABCEDF1 | abcedf1 |