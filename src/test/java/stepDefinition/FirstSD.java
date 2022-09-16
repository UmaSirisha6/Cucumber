package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstSD {

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	  System.out.println("Given1");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		 System.out.println("Given2");
	}

	@When("I complete action")
	public void i_complete_action() {
		 System.out.println(".............");
	}

	@When("some other action")
	public void some_other_action() {
		 System.out.println(".............");
	}

	@When("yet another action")
	public void yet_another_action() {
		 System.out.println(".............");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		 System.out.println(".............");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		 System.out.println(".............");
	}

	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
		 System.out.println(".............");
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
		System.out.println("............."+ int1);
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
		System.out.println(".............");
	}

	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
		System.out.println(".............");
	}




}
