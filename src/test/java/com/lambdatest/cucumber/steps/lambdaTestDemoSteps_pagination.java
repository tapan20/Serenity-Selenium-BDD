package com.lambdatest.cucumber.steps;

import com.lambdatest.cucumber.pages.lambdaTestDemo_pagination;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class lambdaTestDemoSteps_pagination {

	lambdaTestDemo_pagination steps;

	@When("^user reaches the pagination URL$")
	public void navigatePaginationURl() throws Throwable {
		steps.open();
		System.out.println("Successfully Navigated to Lambda Test Demo URL");

	}

	@Then("user selects the nb of rows to be displayed")
	public void rowsSelector() throws Throwable {
		steps.pagination();
	}

	@Then("^user should data as per rows selected$")
	public void rowsSlected() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Values as per Number of Rows Selcted and Pagination Set");
	}

}
