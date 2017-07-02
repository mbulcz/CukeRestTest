package com.mbul.stepDefinitions;

import com.jayway.restassured.RestAssured;
import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class Hooks {

    private Scenario scenario;

    @Before
    public void beforeMethod(Scenario scenario) {
        this.scenario = scenario;
        RestAssured.baseURI = "http://httpbin.org/";
    }
}
