Feature: Basic endpoint returns header data
  As a user, I want to test my basic endpoint,
  so that all the information is there

  Scenario: Get header information
    When I request header information
    Then the status code is 200
    Then I should see in response "headers.Host" equal to "httpbin.org"
    And I should see in response "headers.User-Agent" to contain "HttpClient"
