package com.lambdatest.cucumber.steps;

import com.lambdatest.cucumber.pages.lambdaTestDemo_fillForm;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class lambdaTestDemoSteps_fillForm {

	lambdaTestDemo_fillForm steps;

	@When("^user reaches the Fill Form URL$")
	public void fillFormURL() throws Throwable {
		steps.open();
		System.out.println("Successfully Navigated to Lambda Test Demo URL");

	}

	@Then("user Enter Values")
	public void fillDetails() throws Throwable {
		steps.fillForm();
	}

	@Then("^user Should See the Value$")
	public void i_should_see_checkbox_selected() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Check Box are Selected");
	}

}
