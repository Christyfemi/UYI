package Assured;
import static io.restassured.RestAssured.given;
//import static org.hamcrest.Matchers.equalTo;
//import static org.hamcrest.Matchers.hasItem;

import org.testng.annotations.Test;


public class rest {

    @Test
    public void simple_get_request() {

        given()

                .when()

                .get("https://restcountries.eu/rest/v2")

                .then()

                .statusCode(200);

    }
}
