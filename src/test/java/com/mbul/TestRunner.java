package com.mbul;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(features="src/test/resources/", glue="com/mbul/stepDefinitions",
        format = {"pretty", "html:target/test-report"} )
@RunWith(Cucumber.class)
public class TestRunner {
}
