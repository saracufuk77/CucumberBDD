Feature: Adding Multiple Employees
  To perform Data Driven Testing in Cucumber we use Scenario Outline.

  Scenario Outline: Adding multiple employees
    Given user logs in with valid admin credentials
    And user navigates to the add employee page
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


