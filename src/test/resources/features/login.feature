@login
Feature:Login tests
  Background:
#    Given user is on the exelenter webpage  ===> We have hook now and it will deal with this line. We do not even background

  @smoke
  Scenario: Valid user login test
#    Given user is on the exelenter webpage
    When user logs in with valid admin credentials
    Then welcome message is displayed in dashboard page

    @smoke
  Scenario: Valid username invalid password test
#    Given user is on the exelenter webpage
    When user pass the valid username and invalid password
    Then login error message for invalid password is displayed in loginpage

      @regression @smoke
  Scenario: Valid username empty password test
#    Given user is on the exelenter webpage
    When user pass the valid username and empty password
    Then login error message for empty password is displayed in loginpage
