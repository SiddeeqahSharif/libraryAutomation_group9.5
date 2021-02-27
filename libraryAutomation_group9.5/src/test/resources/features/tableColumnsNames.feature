
@wip
Feature:As a students, I should be able to see tables with default info

  Scenario: Table columns names
    When I login as student
    Given I should land on hompage
    Then I should see following column names:
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |

