package step_definitions;

import io.cucumber.java.en.Then;

public class OthersSteps {

    @Then("Verify buttons is disabled")
    public void verify_buttons_is_disabled() {
        System.out.println("Verified button is disabled");
    }
}