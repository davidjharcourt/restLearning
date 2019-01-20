/**
 * Created by david on 2/17/2018.
 */


import config.TestConfig;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class MyFirstTest extends TestConfig{

    @Test
    public void myFirstTest(){

        given()
            .log()
            .ifValidationFails().
        when().get("/videogames/1").
        then()
            .log()
            .all();

    }
}
