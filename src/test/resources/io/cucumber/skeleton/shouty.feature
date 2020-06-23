Feature: Menu item leads to appropriate page

  Scenario Outline: User click on a menu item and goes to appropriate page
    Given user enter the site
    When  the user clicks on the "Docs" section
    And the user clicks on the "<title>" item
    Then the page with "<title>" in the title is displayed
    Examples:
      | title          |
      | Gherkin Syntax |
      | Installation   |