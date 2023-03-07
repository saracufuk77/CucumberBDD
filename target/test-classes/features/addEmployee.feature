Feature: Add new employee
  Scenario: Add with first name and last name
    Given user is on the exelenter webpage
    And user logs in with valid admin credentials
    * user navigates to the add employee list page
    When user add a new employee by entering firstname and lastname
    Then new employee information is displayed in the personal details page

  Scenario: Add without employee ID
    Given user is on the exelenter webpage
    And user logs in with valid admin credentials
    * user navigates to the add employee list page
    * user delete the employee id field
    When user add a new employee by entering firstname and lastname
    Then new employee information is displayed in the personal details page

  Scenario: Add with login credentials
    Given user is on the exelenter webpage
    And user logs in with valid admin credentials
    * user navigates to the add employee list page
    When user add a new employee with login credentials
    Then new employee information is displayed in the personal details page