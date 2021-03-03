@11
Feature:As a user, I should be able to see my User management tables columns names

  Background:
    Given User is on the library login page
    When User enters correct student "librarianUsername" and "librarianPassword"
    And User clicks the sign-in button


  Scenario Outline: User should see management table columns names

    When the user click users module
    Then the user should see the following "<columnNames>"

    Examples:
      |columnNames|
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |

