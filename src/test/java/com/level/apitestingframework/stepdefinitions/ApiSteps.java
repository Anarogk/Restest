package com.level.apitestingframework.stepdefinitions;

import com.level.apitestingframework.base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ApiSteps extends TestBase {
    private Response response;
    private RequestSpecification request;

    @Given("I set GET employee service api endpoint")
    public void i_set_get_employee_service_api_endpoint() {
        request = given().basePath("/employees");
    }

    @When("I send GET HTTP request")
    public void i_send_get_http_request() {
        response = request.when().get();
    }

    @Then("I receive valid HTTP response code 200")
    public void i_receive_valid_http_response_code_200() {
        response.then().statusCode(200);
    }

    @Then("response contains a list of employees")
    public void response_contains_a_list_of_employees() {
        response.then().body("data", not(empty()));
    }

    @Given("I set POST employee service api endpoint")
    public void i_set_post_employee_service_api_endpoint() {
        request = given().basePath("/employees");
    }

    @Given("I set request body")
    public void i_set_request_body() {
        String requestBody = "{ \"name\": \"John\", \"salary\": \"5000\", \"age\": \"30\" }";
        request.body(requestBody);
    }

    @When("I send POST HTTP request")
    public void i_send_post_http_request() {
        response = request.when().post();
    }

    @Then("I receive valid HTTP response code 201")
    public void i_receive_valid_http_response_code_201() {
        response.then().statusCode(201);
    }

    @Then("response contains the newly created employee")
    public void response_contains_the_newly_created_employee() {
        response.then().body("name", equalTo("John"));
    }

    @Given("I set PUT employee service api endpoint")
    public void i_set_put_employee_service_api_endpoint() {
        request = given().basePath("/employees/1");
    }

    @When("I send PUT HTTP request")
    public void i_send_put_http_request() {
        response = request.when().put();
    }


    @Then("response contains the updated employee")
    public void response_contains_the_updated_employee() {
        response.then().body("name", equalTo("John"));
    }

    @Given("I set DELETE employee service api endpoint")
    public void i_set_delete_employee_service_api_endpoint() {
        request = given().basePath("/employees/1");
    }

    @When("I send DELETE HTTP request")
    public void i_send_delete_http_request() {
        response = request.when().delete();
    }

    @Then("the employee is deleted")
    public void the_employee_is_deleted() {
        response.then().body("message", equalTo("Successfully! Record has been deleted"));
    }
}
