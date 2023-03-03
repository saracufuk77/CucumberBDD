Feature: Searching existing employees
  Scenario: Search for an employee by id
    Given user is on the exelenter webpage
    And user logs in with valid admin credentials
    * user navigates to the employee list page
    * user enters an existing employee id in the id-search field
    When user clicks on the search button
    Then the employee information is displayed on the employee list table

    Scenario: Search for an employee by name
      Given user is on the exelenter webpage
      And user logs in with valid admin credentials
      And user navigates to the employee list page
      And user enters an existing employee name in the employee name-search field
      When user clicks on the search button
      Then the employee information is displayed on the employee list table

#      Tip1: Ideally, declarative approach (shorter, behaivor-driven) is preferred for writing steps in Gherkin.
#            In rare scenarios , we do need imperative style (longer, detailed, procedural-driven)
#      Tip2: Try to keep your steps within 7-8 OR less steps, shorter is better. If more than 7 steps, break it into smallersteps
#      Remember SMART and INVEST criteria in testing: