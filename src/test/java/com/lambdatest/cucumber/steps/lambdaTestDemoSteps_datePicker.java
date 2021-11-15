package com.lambdatest.cucumber.steps;

import com.lambdatest.cucumber.pages.lambdaTestDemo_datePicker;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class lambdaTestDemoSteps_datePicker {

	lambdaTestDemo_datePicker steps;

	@When("^user reaches the datePicker URL$")
	public void navigatedatePickerURl() throws Throwable {
		steps.open();
		System.out.println("Successfully Navigated to Lambda Test Demo URL");

	}

	@Then("user selects the date")
	public void datePickerSelector() throws Throwable {
		steps.datePicker();
	}

	@Then("^user should see date selected$")
	public void dateSelected() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Dates are Selected");
	}

}
