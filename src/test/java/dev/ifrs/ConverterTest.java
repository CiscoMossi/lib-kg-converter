package dev.ifrs;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ConverterTest {

    @Test
    public void testLibToKgEndpoint() {
        given()
          .when().get("/converter/10/kg")
          .then()
             .statusCode(200)
             .body(is("4.53592"));
    }

    @Test
    public void testKgToLibEndpoint() {
        given()
          .when().get("/converter/10/lib")
          .then()
             .statusCode(200)
             .body(is("22.046244201837776"));
    }

}