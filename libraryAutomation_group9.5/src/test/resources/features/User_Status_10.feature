@status
Feature: Verify user status
  Verify that librarian status is visible with dropdown options of active or inactive

  #User will login as a librarian
  Background: User starts on the librarian landing page
    Given User is on the library login page
    When User enters correct librarian "librarianUsername" and "librarianPassword"
    Then User clicks the sign-in button

  Scenario: User sees status options
    Given User click users module
    When User clicks the status dropdown
    And User sees status options
      | ACTIVE   |
      | INACTIVE |





