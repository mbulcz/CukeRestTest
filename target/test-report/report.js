$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("firstTest.feature");
formatter.feature({
  "line": 1,
  "name": "Basic endpoint returns header data",
  "description": "As a user, I want to test my basic endpoint,\r\nso that all the information is there",
  "id": "basic-endpoint-returns-header-data",
  "keyword": "Feature"
});
formatter.before({
  "duration": 972826822,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Get header information",
  "description": "",
  "id": "basic-endpoint-returns-header-data;get-header-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I request header information",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the status code is 200",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I should see in response \"headers.Host\" equal to \"httpbin.org\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should see in response \"headers.User-Agent\" to contain \"HttpClient\"",
  "keyword": "And "
});
formatter.match({
  "location": "HeaderSteps.request_header_info()"
});
formatter.result({
  "duration": 4017021233,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 19
    }
  ],
  "location": "HeaderSteps.status_code_is(int)"
});
formatter.result({
  "duration": 113200951,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "headers.Host",
      "offset": 26
    },
    {
      "val": "httpbin.org",
      "offset": 50
    }
  ],
  "location": "HeaderSteps.should_see_equal_to(String,String)"
});
formatter.result({
  "duration": 1558829786,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "headers.User-Agent",
      "offset": 26
    },
    {
      "val": "HttpClient",
      "offset": 58
    }
  ],
  "location": "HeaderSteps.should_see_to_contain(String,String)"
});
formatter.result({
  "duration": 78411390,
  "status": "passed"
});
});