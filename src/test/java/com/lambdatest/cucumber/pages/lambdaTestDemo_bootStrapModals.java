package com.lambdatest.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.lambdatest.com/selenium-playground/bootstrap-modal-demo")

public class lambdaTestDemo_bootStrapModals extends PageObject {

	@FindBy(xpath = "//*[@id=\"__next\"]/section[4]/div/div/div[2]/div[2]/button")
	WebElementFacade mulipleModals_btn;

	@FindBy(xpath = "//*[@id=\"myMultiModal\"]/div/div/div[2]/button")
	WebElementFacade launchModal_btn;

	@FindBy(xpath = "//*[@id=\"mySecondModal\"]/div/div/div[3]/button[2]")
	WebElementFacade saveChanges1;

	@FindBy(xpath = "//*[@id=\"myMultiModal\"]/div/div/div[3]/button[2]")
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
