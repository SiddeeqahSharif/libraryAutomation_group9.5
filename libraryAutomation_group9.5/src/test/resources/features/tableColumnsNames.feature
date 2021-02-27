
@columnNames
Feature:As a students, I should be able to see tables with default info

  Scenario: Table columns names
    Given User is on the library login page
    When User enters correct student "student1Username" and "student1Password"
    And User clicks the sign-in button
    Then I should see following column names:
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |

