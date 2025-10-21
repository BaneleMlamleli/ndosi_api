package com.api.test;

import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator.*;

public class HealthTest {

    public final String BASE_URL = "https://www.ndosiautomation.co.za/API";

    @Test
    public void checkApiHealth(){
        given()
        .when()
            .get(BASE_URL + "/health")
        .then()
            .log().all();
    }

}
