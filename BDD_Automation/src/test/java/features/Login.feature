Feature: Application login

 Scenario: Home page default login
    Given User is landing page
    When user enters the username "Shah" and password "1234"
    Then user navigate to dashboard
    And cards are displayed "true"

    

 Scenario: Home page default login
    Given User is landing page
    When user enters the username "Kunal" and password "5678"
    Then user navigate to dashboard
    And cards are displayed "false"