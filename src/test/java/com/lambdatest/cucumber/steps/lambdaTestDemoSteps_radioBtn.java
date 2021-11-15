package com.lambdatest.cucumber.steps;

import com.lambdatest.cucumber.pages.lambdaTestDemo_radioBtn;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class lambdaTestDemoSteps_radioBtn {

	lambdaTestDemo_radioBtn steps;

	@When("^user reach the radioBtn URL$")
	public void navigate_url() throws Throwable {
		steps.open();
		System.out.println("Successfully Navigated to Lambda Test Demo URL");

	}

	@Then("user select radio button")
	public void user_click_the_radioBtn() throws Throwable {
		steps.selectRadioBtn();
	}

	@Then("^user should see radio button selected$")
	public void user_should_see_radioBtn_selected() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Radio Button is Selected");
	}

}
