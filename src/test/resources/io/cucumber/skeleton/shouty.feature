Feature: Menu item leads to appropriate page

  Scenario: User click on a menu item and goes to appropriate page
    Given user enter the site
    When  the user clicks on the "Docs" section
    And the user clicks on the "Gherkin Syntax" item
    Then the page with "Gherkin Syntax" in the title is displayed