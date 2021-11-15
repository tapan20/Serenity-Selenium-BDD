package com.lambdatest.cucumber.steps;

import com.lambdatest.cucumber.pages.lambdaTestDemo_jQueryListBox;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class lambdaTestDemoSteps_jQueryListBox {

	lambdaTestDemo_jQueryListBox steps;

	@When("^user reaches the JQuery list box URL$")
	public void navigateJquerylistboxURl() throws Throwable {
		steps.open();
		System.out.println("Successfully Navigated to Lambda Test Demo URL");

	}

	@Then("user select values that need to add or remove")
	public void addRemove() throws Throwable {
		steps.moveValuesjQuery();
	}

	@Then("^values should be added or removed accordingly$")
	public void movedValues() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Values moved accordingly");
	}

}
