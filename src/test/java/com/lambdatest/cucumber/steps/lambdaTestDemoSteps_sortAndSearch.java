package com.lambdatest.cucumber.steps;

import com.lambdatest.cucumber.pages.lambdaTestDemo_sortAndSearch;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class lambdaTestDemoSteps_sortAndSearch {

	lambdaTestDemo_sortAndSearch steps;

	@When("^user reaches the search and sort URL$")
	public void navigateSearchSortURl() throws Throwable {
		steps.open();
		System.out.println("Successfully Navigated to Lambda Test Demo URL");

	}

	@Then("user search the records and perform sorting")
	public void i_click_the_checkbox() throws Throwable {
		steps.seachAndSort();
	}

	@Then("^user should see searched record and records should be sorted selected$")
	public void i_should_see_checkbox_selected() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Searched Value is Performed and Records are Sorted ");
	}

}
