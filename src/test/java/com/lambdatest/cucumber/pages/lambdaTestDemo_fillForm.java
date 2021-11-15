package com.lambdatest.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.lambdatest.com/selenium-playground/simple-form-demo")

public class lambdaTestDemo_fillForm extends PageObject {

	@FindBy(css = "#user-message")
	WebElementFacade singleInputMessage_textbox;

	@FindBy(css = "#showInput")
	WebElementFacade checkValue_btn;

	@FindBy(css = "#sum1")
	WebElementFacade enterValueA_textBox;

	@FindBy(css = "#sum2")
	WebElementFacade enterValueB_textBox;

	@FindBy(css = "#gettotal > button")
	WebElementFacade getValues_btn;

	public void fillForm() throws InterruptedException {

		Thread.sleep(1500);
		singleInputMessage_textbox.sendKeys("Test Message");

		Thread.sleep(1500);
		checkValue_btn.click();

		Thread.sleep(1500);
		enterValueA_textBox.sendKeys("5");

		Thread.sleep(1500);
		enterValueB_textBox.sendKeys("5");

		Thread.sleep(1500);
		getValues_btn.click();

	}

}
