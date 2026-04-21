Feature: Login Feature
  #Gherkin
  #Given - User's Present condition
  #When - Actions performed by the user
  #Then -Validates the Scenario:

  ##Commmon steps in backgroud
  Background:
    Given User is on Login Page of ecommerce application

  @validlogin  @login
  Scenario: Valid Login Test
    When user enters email "tr90wq@eample.com" and password "Password@123"
    And user clicks on Login Button
    Then user should be redirected to the Dashboard Page


  @Invalidlogin  @login
  Scenario Outline: InValid Login Test
    When user enters invalid email "<email>" and password "<password>"
    And user clicks on Login Button
    Then user should remains on same login Page

    Examples:
      | email             | password  |
      | vijay@gmail.com   | Test@1234 |
      | sachin@master.com | Test@1234 |


    #3 . Data Table  --> Framework development
  #4 . Json Data ----> Framework development