Feature: Main Menu
  Testing presence of the all menus on the admin homepage

#  @dashboard
#  Scenario: Dashboard menu view for Admin User
#    When user logs in with valid admin credentials
#    Then user should see dashboard menu displayed
#      | Admin | PIM | Leave | Time | Recruitment | My Info | Performance | Dashboard | Directory | Maintenance | Buzz |

#  you can also sort menus vertically
  @dashboard
  Scenario: Dashboard menu view for Admin User
    When user logs in with valid admin credentials
    Then user should see dashboard menu displayed
      | Admin       |
      | PIM         |
      | Leave       |
      | Time        |
      | Recruitment |
      | My Info     |
      | Performance |
      | Dashboard   |
      | Directory   |
      | Maintenance |
      | Buzz        |
