Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario: Sunday isn't Friday
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"
    
   Scenario: Finding some cheese
   	Given I am on the Google search page
   	When I search for "Cheese!"
   	Then the page title should start with "cheese"
   	
	Scenario Outline: Successful Login with Valid Credentials
 		Given User is on Home Page
 		When User Navigate to LogIn Page
 		And User enters "<username>" and "<password>"
 		Then Message displayed Login Successfully

	Examples:
    | username   | password |
    | testuser_1 | Test@153 |
    | testuser_2 | Test@153 |   	
