package hellocucumber;

import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


class IsItFriday {
    static String isItFriday(String today) {
    	return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}

public class StepDefinitions {
	
	private String today;
    private String actualAnswer;
    
    // --- Scenario 1 Implementation ---
    
    @Given("today is {string}")
    public void today_is(String today) {
        this.today = today;
    }
    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
    	actualAnswer = IsItFriday.isItFriday(today);
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
    
    // --- Scenario 2 Implementation ---
	/*
	 * @Given("today is Friday") public void today_is_Friday() { today = "Friday"; }
	 */

}
