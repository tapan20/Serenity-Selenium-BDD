package com.lambdatest.cucumber.steps;

import com.lambdatest.cucumber.pages.lambdaTestDemo_fileDownload;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class lambdaTestDemoSteps_fileDownload {

	lambdaTestDemo_fileDownload steps;

	@When("^user reaches the fileDownload URL$")
	public void navigateCheckBoxURl() throws Throwable {
		steps.open();
		System.out.println("Successfully Navigated to Lambda Test Demo URL");

	}

	@Then("user wants to download a file")
	public void file() throws Throwable {
		steps.fileDownload();
	}

	@Then("^file should be downloaded after set text$")
	public void fileDownloadSetText() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("File Downloaded with Set Text");
	}

}
