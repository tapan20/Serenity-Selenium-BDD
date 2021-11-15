package com.lambdatest.cucumber.steps;

import com.lambdatest.cucumber.pages.lambdaTestDemo_bootStrapModals;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class lambdaTestDemoSteps_bootStrapModals {

	lambdaTestDemo_bootStrapModals steps;

	@When("^user reaches the bootStrapModals URL$")
	public void navigatedateModalsURl() throws Throwable {
		steps.open();
		System.out.println("Successfully Navigated to Lambda Test Demo URL");

	}

	@Then("user works with bootstrap modals")
	public void bootstapModals() throws Throwable {
		steps.bootStrapModals();
	}

	@Then("^user should see the results$")
	public void modals() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Worked with Modals");
	}

}
