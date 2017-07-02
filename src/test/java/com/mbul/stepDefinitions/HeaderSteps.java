package com.mbul.stepDefinitions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.containsString;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.jayway.restassured.RestAssured.given;

public class HeaderSteps extends AbstractSteps {

    private final String header_endpoint = "headers";

    @When("^I request header information$")
    public void request_header_info() throws Throwable {
        response = given().when().get(header_endpoint);
        System.out.format("odpowiedz: %s", response.prettyPrint());
    }

    @Then("^the status code is (\\d+)$")
    public void status_code_is(int statusCode) {
        json = response.then().statusCode(statusCode);
        System.out.format("KOD: %d", response.getStatusCode());
    }

    @Then("^I should see in response \\\"(.*?)\\\" equal to \\\"(.*?)\\\"$")
    public void should_see_equal_to(String key, String value) throws Throwable {
//        response.then().assertThat().body(key, equalTo(value));
        json. body(key, equalTo(value));
    }

    @Then("^I should see in response \\\"(.*?)\\\" to contain \\\"(.*?)\\\"$")
    public void should_see_to_contain(String key, String value) throws Throwable {
        json.body(key, containsString(value));
    }
}
