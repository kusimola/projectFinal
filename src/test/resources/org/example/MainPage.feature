Feature: Main page
    These tests will verify the functionality of the Software testing Course site

  Scenario: Testing "Start the enrollment" button
      Given I am on the Software testing course website
      When I push the "Start the enrollment" button
      Then the sign up page should appear

  Scenario: Testing "Read more" button of Learning the Fundamentals category
      Given I am on the Software testing course website
      When I push the Fundamentals "Read more" button
      Then the Fundamentals page should appear

  Scenario: Testing Sign up - Personal Information
      Given I am on the sign up page of the Software testing course website
      When I fill in the form with valid data
      And click next button
      Then the Contact information page should appear

    Scenario: Testing Sign up - Personal Information - negative
        Given I am on the sign up page of the Software testing course website
        When I fill in the First Name field with "imola"
        And I fill in the Last Name field with ""
        And I fill in the Username field with "kusImola"
        And I fill in the Password field with "123456"
        And I fill in the Confirm password field with "123456"
        And click next button
        Then the Personal information page should appear

    Scenario: Testing Sign up - Personal Information - negative
        Given I am on the sign up page of the Software testing course website
        When I fill in the First Name field with "imola"
        And I fill in the Last Name field with ""
        And I fill in the Username field with "kusImola"
        And I fill in the Password field with "123456"
        And I fill in the Confirm password field with "654321"
        And click next button
        Then the Personal information page should appear


    Scenario: Testing Sign up - Personal Information - negative
        Given I am on the sign up page of the Software testing course website
        When I fill in the First Name field with "imola"
        And I fill in the Last Name field with "kus"
        And I fill in the Username field with "kusImola"
        And I fill in the Password field with ""
        And I fill in the Confirm password field with "123456"
        And click next button
        Then the Personal information page should appear

    Scenario: Testing Sign up - Contact information
        Given I am on the sign up page of the Software testing course website
        When I fill in the Email field with "johndoe@yahoo.com"
        And I fill in the Phone field with "0526987635"
        And I fill in the Country field with "Romania"
        And I fill in the City field with "Brasov"
        And I fill in the PostCode field with "600600"
        And click Contact informations next button
        Then the Course Options page should appear

    Scenario: Testing Sign up - Contact information - negative
        Given I am on the sign up page of the Software testing course website
        When I fill in the Email field with "johndoe@yahoo.com"
        And I fill in the Phone field with "0526987635"
        And I fill in the Country field with "Romania"
        And I fill in the City field with "Brasov"
        And I fill in the PostCode field with ""
        And click Contact informations next button
        Then the Contact information page should appear

    Scenario Outline: Click multiple buttons FAQ section
        Given I am on the Software testing course website
        When I click the <first> button
        And I click the <second> button
        Then the <first> button should be closed
        And the <second> should be expanded

        Examples:
            | first | second |
            | 1     | 2      |
            | 3     | 4      |


    Scenario Outline: Click multiple buttons FAQ section
        Given I am on the Software testing course website
        When I click the <first> button
        Then the <first> button should expand and the page dynamically rearrange itself

        Examples:
            | first |
            | 2     |
            | 5     |

  Scenario Outline: Click multiple buttons FAQ section
      Given I am on the Software testing course website
      When I click <first> button that is already expanded
      Then the <first> button should revert back to the initial state

          Examples:
              | first |
              | 1 |
              | 4 |


