package com.lambdatest.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.lambdatest.com/selenium-playground/radiobutton-demo")

public class lambdaTestDemo_radioBtn extends PageObject {

	@FindBy(css = "input[value='Female'][name='optradio']")
	WebElementFacade femaleRadioBtn;

	@FindBy(css = "#buttoncheck")
	WebElementFacade checkValueSelectedBtn;

	@FindBy(css = "input[value='Other']")
	WebElementFacade genderRadioBtn;

	@FindBy(css = "input[value='5 - 15']")
	WebElementFacade ageGroupRadioBtn;

	public void selectRadioBtn() throws InterruptedException {

		Thread.sleep(1500);
		femaleRadioBtn.click();

		Thread.sleep(1500);
		checkValueSelectedBtn.click();

		Thread.sleep(1500);
		genderRadioBtn.click();

		Thread.sleep(1500);
		ageGroupRadioBtn.click();

	}

}
