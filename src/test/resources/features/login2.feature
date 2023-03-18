@login2
Feature: Login Test
  Description: This is where you describe your feature, in more details.

#  This is declarative style
  Scenario: valid admin login
    When admin user logs in with valid credentials
    Then admin user logs in successfully
@smoke
  Scenario: valid ess login
    When ess user logs in with valid credentials
    Then ess user logs in successfully

  Scenario Outline:
    When  user enters a valid "<username>" and a valid "<password>"
    And user clicks on the login button
    Then user logs in successfully and the "<message>" is displayed
#    Then user logs in successfully and a message is displayed as "<Welcome UserFirstName>"
    Examples:
      | username | password |message  |
      | Admin | Exelent2022Sdet! | Welcome Admin |
      | EssUser | Ess@2023 | Welcome John |

    #similar to DataProvider in TestNG