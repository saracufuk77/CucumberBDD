@testingNow @regression
Feature: Searching existing employees

  Background:
    And user logs in with valid admin credentials
    * user navigates to the employee list page

  @searchEmployee
  Scenario: Search for an employee by id
    And user enters an existing employee id "0909" in the id-search field
    When user clicks on the search button
    Then the employee information is displayed on the employee list table

  @searchEmployee
  Scenario: Search for an employee by name
    And user enters an existing employee name "Zeynep Demir" in the employee name-search field
    When user clicks on the search button
    Then the employee information is displayed on the employee list table
