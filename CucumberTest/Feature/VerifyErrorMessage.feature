#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag
Feature: Verify error Message
	I want to use this template for my feature file

@tag1
Scenario:Verify Entering Different Phone no. error Message
Given I am on Facebook Home Page
When I input my valid Phone No.
	And input different phone no in next field
	And I click on Phone no and re enter phone No. field
Then Message displayed Your emails or mobile numbers do not match. Please try again.
	And Vrify the error message showed up as it should be.
	And Browser will close.
	


