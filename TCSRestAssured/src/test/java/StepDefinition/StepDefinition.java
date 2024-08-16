package StepDefinition;

import Pojo.VehicleDetails;
import Resources.DataBuilder;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class StepDefinition {
    private Response response;

    @Given("the toll lane system is running")
    public void the_toll_lane_system_is_running() {
        RestAssured.baseURI = "http://localhost:9090";
    }

    @When("I add a vehicle to the queue with the following details {int}, {int}, {int}, {int}, {int}, {int}, {string}, {string}, {long}, {string}")
    public void i_add_a_vehicle_to_the_queue_with_the_following_details(int axesNumber, int axesDistance, int weight1, int weight2, int totalWeight, int vehicleType, String plateNo, String plateLetters, long date,String Hashcode) {
        VehicleDetails vehicleDetails = DataBuilder.buildVehicleDetails(
                axesNumber,
                axesDistance,
                weight1,
                weight2,
                totalWeight,
                vehicleType,
                plateNo,
                plateLetters,
                date,
                Hashcode
        );

        response = given().log().all()
                .contentType("application/json")
                .body(vehicleDetails)
                .when()
                .post("/its/queue/").then().log().all().extract().response();
    }

    @Then("the response message should be {string}")
    public void the_response_message_should_be(String expectedMessage) {
        response.then().statusCode(200).body("message", equalTo(expectedMessage));
    }


}
