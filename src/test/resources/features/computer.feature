Feature: Computer Page
  As a user
  I want to verify computer page functionality
@sanity
  Scenario: verify User Should Navigate To ComputerPage Successfully
    Given I am on homepage
    When I click on Computer tab
    Then I should navigate on computer page successfully
@smoke
  Scenario: verify User Should Navigate To DesktopsPage Successfully
    Given I am on homepage
    When I click on Computer tab
    And I click on Desktops link
    Then I should navigate to desktops page successfully
@regression
  Scenario Outline: verify That User Should Build Your Own Computer And Add Them To Cart Successfully
    Given I am on homepage
    When  I click on Computer tab
    And I click on Desktops link
    And I should navigate to desktops page successfully
    And I click on the product name "Build your own computer"
    And I select processor "<processor>"
    And I select RAM "<ram>"
    And I select HDD "<hdd>"
    And I select OS "<os>"
    And I select software "<software>"
    And I click on add to cart button
    Then I should see product has been added to your shopping cart and get confirmation message
    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |


