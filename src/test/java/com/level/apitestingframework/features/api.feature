Feature: API Testing

  Scenario: Test GET request
    Given I set GET employee service api endpoint
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And response contains a list of employees

  Scenario: Test POST request
    Given I set POST employee service api endpoint
    And I set request body
    When I send POST HTTP request
    Then I receive valid HTTP response code 201
    And response contains the newly created employee

  Scenario: Test PUT request
    Given I set PUT employee service api endpoint
    And I set request body
    When I send PUT HTTP request
    Then I receive valid HTTP response code 200
    And response contains the updated employee

  Scenario: Test DELETE request
    Given I set DELETE employee service api endpoint
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 200
    And the employee is deleted
