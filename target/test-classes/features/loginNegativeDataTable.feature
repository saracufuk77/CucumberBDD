Feature: Negative Login Tests with Datatables
  Description: We conduct negative tests for login functionality using Datatable

  Scenario:
    When user enters login credentials
      | Username        | Password         | ErrorMessage             |
      | Admin           | invalidPass      | Invalid credentials      |
      | invalidUserName | Exelent2022Sdet! | Invalid credentials      |
      |                 | Exelent2022Sdet! | Username cannot be empty |
      | Admin           |                  | Password cannot be empty |
    Then login negative tests are successfull