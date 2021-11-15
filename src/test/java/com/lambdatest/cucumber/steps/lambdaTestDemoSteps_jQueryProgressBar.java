package com.lambdatest.cucumber.steps;

import com.lambdatest.cucumber.pages.lambdaTestDemo_jQueryProgressBar;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class lambdaTestDemoSteps_jQueryProgressBar {

	lambdaTestDemo_jQueryProgressBar steps;

	@When("^user reaches the JQuery Progress Bar URL$")
	public void navigateCheckBoxURl() throws Throwable {
		steps.open();
		System.out.println("Successfully Navigated to Lambda Test Demo URL");

	}

	@Then("user starts downloading")
	public void startsDownloading() throws Throwable {
		steps.startProgress();
	}

	@Then("^user should see downloading progress$")
	public void downloadInProgress() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Downloading Successfully");
	}

}
