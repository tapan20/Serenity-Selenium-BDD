package com.lambdatest.cucumber.steps;

import com.lambdatest.cucumber.pages.lambdaTestDemo_bootStrapListBox;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class lambdaTestDemoSteps_bootStapListBox {

	lambdaTestDemo_bootStrapListBox steps;

	@When("^user reaches the bootstrap list box URL$")
	public void navigatebootstaplistboxURl() throws Throwable {
		steps.open();
		System.out.println("Successfully Navigated to Lambda Test Demo URL");

	}

	@Then("user select values that need to move")
	public void selectValues() throws Throwable {
		steps.moveValues();
	}

	@Then("^values should be moved$")
	public void movedValues() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Values moved accordingly");
	}

}
