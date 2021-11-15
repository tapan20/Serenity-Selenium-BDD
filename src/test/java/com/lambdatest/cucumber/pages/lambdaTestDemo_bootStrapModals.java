package com.lambdatest.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.lambdatest.com/selenium-playground/bootstrap-modal-demo")

public class lambdaTestDemo_bootStrapModals extends PageObject {

	@FindBy(css = "#__next > section.mt-50 > div > div > div.w-8\\/12.smtablet\\:w-full > div:nth-child(3) > button")
	WebElementFacade mulipleModals_btn;

	@FindBy(css = "#myMultiModal > div > div > div.modal-body > button")
	WebElementFacade launchModal_btn;

	@FindBy(css = "#mySecondModal > div > div > div.modal-footer > button.btn.btn-dark.selenium_btn.hover\\:bg-lambda-900.hover\\:border-lambda-900")
	WebElementFacade saveChanges1;

	@FindBy(css = "#myMultiModal > div > div > div.modal-footer > button.btn.btn-dark.selenium_btn.hover\\:bg-lambda-900.hover\\:border-lambda-900")
	WebElementFacade saveChanges2;

	public void bootStrapModals() throws InterruptedException {

		Thread.sleep(1500);
		mulipleModals_btn.click();

		Thread.sleep(1500);
		launchModal_btn.click();

		Thread.sleep(1500);
		saveChanges1.click();

		Thread.sleep(1500);
		saveChanges2.click();

	}

}
