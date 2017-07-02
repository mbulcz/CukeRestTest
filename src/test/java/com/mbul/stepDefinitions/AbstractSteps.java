package com.mbul.stepDefinitions;

import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;
import com.jayway.restassured.specification.RequestSpecification;
import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class AbstractSteps {

    protected RequestSpecification request;
    protected Response response;
    protected ValidatableResponse json;

}
