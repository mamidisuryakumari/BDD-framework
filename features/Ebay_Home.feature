Feature: Ebay home page scenarios

  @P1
  Scenario: Advanced search link
    Given I am on Ebay home page
    When I click on advanced link
    Then I navigte to search page

  @P3
  Scenario: Search items count
    Given I am on ebay homepege
    When I search for "vivo mobiles"
    Then I validate 20 search item present

  @P4
  Scenario: Search an item in category
    Given I am on ebay homepege
    When I search for 'soap' in baby 'category'

  @P7
  Scenario Outline: 
    Given I am on  homepege
    When I click on '<link>'
    Then I validate that page navigates to '<url>' and title contains '<title>'

    Examples: 
      | link          | url                                         | title     |
      | linkdin       | https://www.linkedin.com/company/orangehrm/ | orangehrm |
      
