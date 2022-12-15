@tag
Feature: Final project Bdd

#  @tag1
#  Scenario: logging  in Application
#    Given Application will open in chrome
#    Then Enter registered email and password and login
#    And Add items to cart
#    And Add address
#    And proceed to payment
#    And checking cart items

#  @tag1
#  Scenario: logging  in Application
#    Given Application will open in chrome
#    Then Enter registered email and wrong password and login
#

#  @tag1
#  Scenario: Signing  in Application
#    Given Application will open in chrome
#    Then Entered new email and new  password and create a user



  @tag1
  Scenario: adding and seeing reviews  in Application
    Given Application will open in chrome
    Then Enter registered email and password and login
    And See Review and then add a new review
    And to check new review is reflected



