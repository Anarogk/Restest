package com.level.apitestingframework.base;


import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class TestBase {
    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "https://api.example.com";
    }
    
}
