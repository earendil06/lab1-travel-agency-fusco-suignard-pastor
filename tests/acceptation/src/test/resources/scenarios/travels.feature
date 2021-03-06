Feature: Travels

  Background:
    Given the service deployed on localhost:9070

  Scenario: retrieving travels
    When retrieving pending requests
    Then the answer have 0 results

  Scenario: Sending a travel
    When propose a travel by email@email.com
    When retrieving pending requests
    Then the answer have 1 result
    And email@email.com have one pending request
    Then the answer have 1 result

  Scenario: Get all pending Requests by uuidRequest
    When propose a travel by email@email.com
    When retrieving pending requests by previous uid
    Then the answer have 1 result

  Scenario: Confirming a travel
    When propose a travel by email@email.com
    When retrieving pending requests
    Then the answer have 1 result
    When confirming this travel
    When retrieving pending requests
    Then the answer have 0 result
    When retrieving confirm requests
    Then the answer have 1 result
    When retrieving confirmed requests by previous uid
    Then the answer have 1 result
    When retrieving confirm requests for email@email.com
    Then the answer have 1 result
    When retrieving confirm requests for email2@email.com
    Then the answer have 0 result

  Scenario: Refusing a travel
    When propose a travel by email@email.com
    When retrieving pending requests
    Then the answer have 1 result
    When refusing this travel
    When retrieving pending requests
    Then the answer have 0 result
    When retrieving refused requests
    Then the answer have 1 result
    When retrieving refused requests by previous uid
    Then the answer have 1 result
    When retrieving refused requests for email@email.com
    Then the answer have 1 result
    When retrieving refused requests for email2@email.com
    Then the answer have 0 result