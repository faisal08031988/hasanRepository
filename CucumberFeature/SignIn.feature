
@login
Feature: amazon login feature test

  Scenario: user able to login with valid information
    Given user on amazon homepage 
    When user enter "<email>"
    And user enter "<password>" in box
    And user click on login
    Then user login successfully
    Examples: 
      | email | password |
      | 45484 |    545   |
     
