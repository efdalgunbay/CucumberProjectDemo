@Demo
Feature: Demo Feature


  Scenario: TC 100 Filter In Stock
    Given User clicks Search box on Home Page
    When Writes the name of the product he wants to search
    Then Click the search button
    And In stock checkbox in product listing, clicks
    Then Checks that only items in stock are listed

  Scenario: TC 101 Filter In Opportunities
    Given User clicks Search box on Home Page
    When Writes the name of the product he wants to search
    Then Click the search button
    And Clicks the Deals checkbox in the product listing
    Then Checks that only Deals products are listed

  Scenario: TC 102 Filter Brand
    Given User clicks Search box on Home Page
    When Writes the name of the product he wants to search
    Then Click the search button
    And Brand checkbox ticks in product listing
    Then Checks that only selected branded products are listed

  Scenario: TC 103 Remove Filter
    Given User clicks Search box on Home Page
    When Writes the name of the product he wants to search
    Then Click the search button
    Given Makes any selections other than In Stock and discounted selections in the product listing
    When Click the x next to the selection made in the Clear filters section
    Then Checks that the selection made is cleared


  Scenario: TC 104 Ascending Sort
    Given User clicks Search box on Home Page
    And Writes the name of the product he wants to search
    And Click the search button
    When Click on Highest Price in Smart Sort in product listing
    Then Checks that items are sorted from high to low price

  Scenario: TC 105 Sort Descending
    Given User clicks Search box on Home Page
    And Writes the name of the product he wants to search
    And Click the search button
    When Click on the Lowest Price selection in Smart Sort in the product listing
    Then Checks that items are sorted from low to high price

  Scenario: TC 106 Entering an Incorrect Number
    And Enter an invalid number in Your Mobile Number
    And Click the Sign In button
    Then An error message appears when an invalid number is entered

  Scenario: TC 107 Incorrect OTP Input
    And Enter a valid number in Your Mobile Number
    And Click the Sign In button
    And Enters an invalid Otp code in the SMS Confirmation Code section
    When Click the OK button
    Then Invalid SMS confirmation error message appears

  Scenario: TC 108 Number Field Left Empty
    And Click the Sign In button
    Then Please enter phone number text is displayed

  Scenario: TC 109 Product Search
    And  User Enters Search Word in Search
    Then User Sees Product Types Searched For


  Scenario: TC 110 Search Button Control
    And User Enters Search Word in Search
    And Clicks on Search User Button
    Then Sees Product Types Searched For


  Scenario: TC 111 Popular Search
    And  User Enters Search Word in Search
    And Clicks on Search User Button
    Then User Sees Popular Title


  Scenario: TC 112 Searching Field is Empty
    Given User clicks Search box on Home Page
    And Doesn't type anything in the search box
    When Clicks on Search User Button
    Then Checks whether a call can be made


  Scenario: TC 113 Single Letter Search
    Given User clicks Search box on Home Page
    And User Enters a Single Letter to Search in Search
    When Clicks on Search User Button
    Then Checks whether a call can be made