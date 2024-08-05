package com.level.apitestingframework.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/java/com/example/apitestingframework/features",
    glue = {"com.example.apitestingframework.stepdefinitions"},
    plugin = {"pretty", "html:target/cucumber-reports/cucumber.html"},
    monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
