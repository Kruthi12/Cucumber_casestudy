Feature: Can't proceed for payment page
  Scenario: The one where the user moves to cart without adding any item in it
    Given Alex has registered into TestMeApp
    When Alex search a particular product
    And Try to proceed to payment without adding any item in the cart
    Then TestMeApp does'nt display the cart icon