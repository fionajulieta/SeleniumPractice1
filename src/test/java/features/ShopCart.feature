Feature: Shopping Cart

  @Add-Item-1-to-Shopping-Cart-Normal
  Scenario: Adding item 1 to shopping cart (normal user)
    Given user is in homepage login with username "standard_user" and password "secret_sauce"
    When user click add to cart button for item 1
    And user click shopping cart icon
    Then item 1 are displayed in the shopping cart list

  @Add-Item-2-to-Shopping-Cart-Normal
  Scenario: Adding item 2 to shopping cart (normal user)
    Given user is in homepage login with username "standard_user" and password "secret_sauce"
    When user click add to cart button for item 2
    And user click shopping cart icon
    Then item 2 are displayed in the shopping cart list

  @Add-Item-3-to-Shopping-Cart-Normal
  Scenario: Adding item 3 to shopping cart (normal user)
    Given user is in homepage login with username "standard_user" and password "secret_sauce"
    When user click add to cart button for item 3
    And user click shopping cart icon
    Then item 3 are displayed in the shopping cart list

  @Add-Item-4-to-Shopping-Cart-Normal
  Scenario: Adding item 4 to shopping cart (normal user)
    Given user is in homepage login with username "standard_user" and password "secret_sauce"
    When user click add to cart button for item 4
    And user click shopping cart icon
    Then item 4 are displayed in the shopping cart list

  @Add-Item-5-to-Shopping-Cart-Normal
  Scenario: Adding item 5 to shopping cart (normal user)
    Given user is in homepage login with username "standard_user" and password "secret_sauce"
    When user click add to cart button for item 5
    And user click shopping cart icon
    Then item 5 are displayed in the shopping cart list

  @Add-Item-6-to-Shopping-Cart-Normal
  Scenario: Adding item 6 to shopping cart (normal user)
    Given user is in homepage login with username "standard_user" and password "secret_sauce"
    When user click add to cart button for item 6
    And user click shopping cart icon
    Then item 6 are displayed in the shopping cart list

  @Add-Item-1-to-Shopping-Cart-Problem
  Scenario: Adding item 1 to shopping cart (problem user)
    Given user is in homepage login with username "problem_user" and password "secret_sauce"
    When user click add to cart button for item 1
    And user click shopping cart icon
    Then item 1 are displayed in the shopping cart list

  @Add-Item-2-to-Shopping-Cart-Problem
  Scenario: Adding item 2 to shopping cart (problem user)
    Given user is in homepage login with username "problem_user" and password "secret_sauce"
    When user click add to cart button for item 2
    And user click shopping cart icon
    Then item 2 are displayed in the shopping cart list

  @Add-Item-3-to-Shopping-Cart-Problem
  Scenario: Adding item 3 to shopping cart (problem user)
    Given user is in homepage login with username "problem_user" and password "secret_sauce"
    When user click add to cart button for item 3
    And user click shopping cart icon
    Then item 3 are displayed in the shopping cart list

  @Add-Item-4-to-Shopping-Cart-Problem
  Scenario: Adding item 4 to shopping cart (problem user)
    Given user is in homepage login with username "problem_user" and password "secret_sauce"
    When user click add to cart button for item 4
    And user click shopping cart icon
    Then item 4 are displayed in the shopping cart list

  @Add-Item-5-to-Shopping-Cart-Problem
  Scenario: Adding item 5 to shopping cart (problem user)
    Given user is in homepage login with username "problem_user" and password "secret_sauce"
    When user click add to cart button for item 5
    And user click shopping cart icon
    Then item 5 are displayed in the shopping cart list

  @Add-Item-6-to-Shopping-Cart-Problem
  Scenario: Adding item 6 to shopping cart (problem user)
    Given user is in homepage login with username "problem_user" and password "secret_sauce"
    When user click add to cart button for item 6
    And user click shopping cart icon
    Then item 6 are displayed in the shopping cart list
