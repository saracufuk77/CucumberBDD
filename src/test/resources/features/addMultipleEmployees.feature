Feature: Adding Multiple Employees
  To perform Data Driven Testing in Cucumber we use Scenario Outline.

  Background:
    Given user logs in with valid admin credentials
    And user navigates to the add employee page

  @addMultiple
  Scenario Outline: Adding multiple employees
    When user enters employee's "<first name>" "<middle name>" and "<last name>"
    And user clicks on the save button
    Then new employee "<full name>" is added successfully.
    Examples:
      | first name | middle name | last name | full name             |
      | Yusuf      | Mahmut      | Tuncer    | Yusuf Mahmut Tuncer   |
      | John       | Benjamin    | Toshack   | John Benjamin Toshack |
      | Barack     | Husein      | Obama     | Barack Husein Obama   |
      | William    | Bradley     | Pitt      | William Bradley Pitt  |
      | Hasan      | Huseyin     | Ali       | Hasan Huseyin Ali     |

# 2.nd way: Adding multiple users using Cucumber Datatable.
  @dataTable
  Scenario: Adding multiple employees
    When user enters employee's fullname and clicks on save button
      | FirstName | MiddleName | LastName |
      | Arianna   | A.         | Star     |
      | Marianna  | B.         | Sun      |
      | Carianna  | C.         | Galaxy   |
    Then employee is added successfully

# 3.rd way: from Excel
  @excel
  Scenario: Adding multiple employees from Excel
    When user enters employee data from the "Employee" sheet
    Then new employee is added successfully using Excel import

