Feature: Logout Feature



  #Predefined steps
  Background:
    Given User is on Login Page of ecommerce application
    When user enters email "tr90wq@eample.com" and password "Password@123"
    And user clicks on Login Button
    Then user should be redirected to the Dashboard Page



  @logout
  Scenario: logout Test
    When user clicks on logout button on home Page
    Then user shoud be redirected to the Login Page


    #Don;t run login steps before logout -Vijay query