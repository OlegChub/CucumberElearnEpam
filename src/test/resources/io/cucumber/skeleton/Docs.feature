Feature: As a user I want to get ability to use Docs page

  Scenario: User click on a menu item and goes to appropriate page
    Given user enter the site
    When  the user clicks on the "Docs" section
    And the user clicks on the "Installation" item
    Then there are 9 menu items in the left-side menu
    And left-side menu contains next items
      | Professional Services        |
      | Cucumber                     |
      | Gherkin Syntax               |
      | Behaviour-Driven Development |
      | Community                    |
      | Sponsors                     |
      | Tools                        |
      | Team                         |
      | Terminology                  |
