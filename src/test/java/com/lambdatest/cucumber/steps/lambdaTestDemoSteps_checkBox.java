package com.lambdatest.cucumber.steps;

import com.lambdatest.cucumber.pages.lambdaTestDemo_checkBox;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class lambdaTestDemoSteps_checkBox {

	lambdaTestDemo_checkBox steps;

	@When("^user reaches the checkBox URL$")
	public void navigateCheckBoxURl() throws Throwable {
		steps.open();
		System.out.println("Successfully Navigated to Lambda Test Demo URL");

	}

	@Then("user click the chechbox")
	public void i_click_the_checkbox() throws Throwable {
		steps.clickCheckBox();
	}

	@Then("^user should see checkbox selected$")
	public void i_should_see_checkbox_selected() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Check Box are Selected");
	}

}
