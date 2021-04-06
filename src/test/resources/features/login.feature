Feature: Login Test
  I want to login to Ebay

	@web
  Scenario Outline: Title of your scenario outline
    Given I am on the Ebay Home Page
    When I enter the <userId> and <password>
    Then I should be able to login successfully

    Examples: 
      | userId  | password | 
      | testerlifealways@gmail.com |     nsdl@12345 | 
      | testerlifealways@gmail.com |     nsdl@12345 | 
