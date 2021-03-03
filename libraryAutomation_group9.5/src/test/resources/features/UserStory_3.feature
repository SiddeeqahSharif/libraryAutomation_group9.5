@Modules

Feature: As a user, I should be able to  see several modules once I login.

  Background:

    Given User is on the library login page

  Scenario: Librarian should see several modules when logged in
    When User enters correct librarian "librarianUsername" and "librarianPassword"
    And User clicks the sign-in button
    Then Librarian should see the following Modules

      |Dashboard   |
      | Books       |
      | Borrowing Books |

  Scenario: Student should see several modules when logged in
    When User enters correct student "student1Username" and "student1Password"
    And User clicks the sign-in button
    Then Student should see following Modules

      | Books       |
      | Borrowing Books |