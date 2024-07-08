Feature: Ebay advanced search page

  @P2
  Scenario: Ebay logo on advanced search page
    Given I am on Ebay advanced search page
    When I click on Ebay logo
    Then I am navigated to Ebay homepage

  @P6
  Scenario: Advanced search an item
    Given I am on advanced search page
    When I search an item
      | keyword      |   exclude     |   min   | max |
      | vivo mobiles |   refurbished |   20    |  30 |
