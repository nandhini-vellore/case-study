
Feature: Testme app cucumber case study
Background: launch browser
Given Browser must be installed by user
When User enters AUT URL in browser
Then Application must open in the browser

 @Registration
  Scenario: Registering new user in Testme
   Given the home page of Testme app must be launched
   When  User enters valid username as "Aishuu"
   And enters Firstname as "Aishwarya"
   And enters Lastname as "Rajesh"
   And  enters password as "987654321"
   And enters confirm password as "987654321"
   And selects the gender female
   And enters email id as "abc@gmail.com"
   And enters mobile number as "9876543210"
   And enters DOB as "04/05/1997"
   And enters adress as "5 New colony"
   And selects the security question
   And enters the answer for the security question as "Blue"
   Then Registration successfull
  @Login
   Scenario Outline: Loging in with registered username using outline
    Given User must be registered
    When User logins using "<username>" and "<password>"
    Then User must be in home page 
    Examples:
    |username|  |password|
    |AlexUser|  |Alex@123|
    
  @Search
   Scenario: User searches the product without typing the whole product name
   Given User is already logged in
   When User types the first four characters of the product 
   Then User gets all appropriate results to purchase
   
  @Payment
   Scenario: User moves to cart without adding the item
    Given user is logged in 
    When user search a particular product and try to proceed the payment without adding item
    Then TestMeApp doesnt display cart icon
 
 
   
 
