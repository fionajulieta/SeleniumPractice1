Feature: Login

  @login-valid-email-valid-username
  Scenario: Login with valid email and valid password
    Given user is in login page
    When user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    Then user will be directed to homepage with url "https://www.saucedemo.com/v1/inventory.html"

  @login-valid-email-invalid-username
  Scenario: Login with valid email and invalid password
    Given user is in login page
    When user input username "standard_user"
    And user input password "abcde"
    And user click login button
    Then login page will display error message: "Epic sadface: Username and password do not match any user in this service"

  @login-invalid-email-valid-username
  Scenario: Login with invalid email and invalid password
    Given user is in login page
    When user input username "standard_userssss"
    And user input password "secret_sauce"
    And user click login button
    Then login page will display error message: "Epic sadface: Username and password do not match any user in this service"

  @login-locked-out-user-account
  Scenario: Login with a locked-out user account
    Given user is in login page
    When user input username "locked_out_user"
    And user input password "secret_sauce"
    And user click login button
    Then login page will display error message: "Epic sadface: Sorry, this user has been locked out."