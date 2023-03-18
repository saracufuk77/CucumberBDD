@testingNow
Feature: Searching existing employees
  Background:
    And user logs in with valid admin credentials
    * user navigates to the employee list page



  Scenario: Search for an employee by id
#    Given user is on the exelenter webpage         //This line can be replaced with the Hooks
    * user enters an existing employee id in the id-search field
    When user clicks on the search button
    Then the employee information is displayed on the employee list table


    Scenario: Search for an employee by name
#      Given user is on the exelenter webpage
#      And user logs in with valid admin credentials    <===this is no longer needed because of the Background
#      And user navigates to the employee list page   <===this is no longer needed because of the Background
      And user enters an existing employee name in the employee name-search field
      When user clicks on the search button
      Then the employee information is displayed on the employee list table

#      Tip1: Ideally, declarative approach (shorter, behaivor-driven) is preferred for writing steps in Gherkin.
#            In rare scenarios , we do need imperative style (longer, detailed, procedural-driven)
#      Tip2: Try to keep your steps within 7-8 OR less steps, shorter is better. If more than 7 steps, break it into smallersteps
#      Remember SMART and INVEST criteria in testing: