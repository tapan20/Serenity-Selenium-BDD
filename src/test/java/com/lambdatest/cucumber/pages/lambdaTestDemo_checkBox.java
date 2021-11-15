package com.lambdatest.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.lambdatest.com/selenium-playground/checkbox-demo")

public class lambdaTestDemo_checkBox extends PageObject {

	@FindBy(css = "#isAgeSelected")
	WebElementFacade singleCheckBox;

	@FindBy(css = "#ex1-check1")
	WebElementFacade multiCheckBox1;

	@FindBy(css = "#ex1-check2")
	WebElementFacade multiCheckBox2;

	public void clickCheckBox() throws InterruptedException {

		Thread.sleep(1500);
		singleCheckBox.click();

		Thread.sleep(1500);
		multiCheckBox1.click();

		Thread.sleep(1500);
		multiCheckBox2.click();

	}

}
