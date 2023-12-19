Feature: Register Feature
  As a user, I want to register into the nop commerce website

  @sanity
  Scenario: verify User Should Navigate To RegisterPage Successfully
    Given I am on homepage
    When I click on register link
    Then I should navigate on register page successfully and I should see the text "Register"

  @smoke
  Scenario: verify That FirstName LastName Email Password And ConfirmPassword Fields Are Mandatory
    Given I am on homepage
    When  I click on register link
    And I click on register button
    Then I should verify the error message "First name is required."
    And I should verify the error message "Last name is required."
    And I should verify the error message "Email is required."
    And I should verify the error message "Password is required."
    And I should verify the error message "Password is required."

  @regression
  Scenario Outline: User should create account successfully
    Given I am on homepage
    When I click on register link
    And I click on radio button "<gender>"
    And I enter "<first name>" in first name field
    And I enter "<last name>" in last name field
    And I select "<day>" from day dropdown
    And I select "<month>" from month dropdown
    And I select "<year>" from year dropdown
    And I enter "<email id>" in Email id field
    And I enter "<password>" in password field
    And I User enter "<confirm password>" in confirm password field
    And I click on register button again
    Then I should navigate to the Home page successfully and get message "Your registration completed"

    Examples:
      | gender | first name | last name | day | month   | year | email id                | password  | confirm password |
      | Female | Khyati     | Savla     | 1   | January | 1989 | khyatisavla01@gmail.com | khyati123 | khyati123        |
      | Male   | Sanket     | Savla     | 2   | March   | 1987 | sanketsavla01@gmail.com | sanket123 | sanket123        |
      | Male   | Jiyan      | Savla     | 3   | April   | 2017 | jiyansavla01@gmail.com  | jiyan123  | jiyan123         |

