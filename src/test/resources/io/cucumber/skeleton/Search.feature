Feature: As a user I want to get ability to use Docs page

  @search
  Scenario: User wants to find all that is connected with «Announces»
    Given user enter the site
    When  the user enters "Announces" request in Search field
    And filter the search results with "Blog" param
    And open first link with Open Source
    Then the page with "Article Name" is opening