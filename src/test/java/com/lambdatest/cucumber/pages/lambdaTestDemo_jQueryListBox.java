package com.lambdatest.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.lambdatest.com/selenium-playground/jquery-dual-list-box-demo")

public class lambdaTestDemo_jQueryListBox extends PageObject {

	@FindBy(css = "button[class='pAddAll bg-gray-900 text-white block w-full text-center text-size-14 py-5 mt-5 hover:bg-lambda-900 rounded']")
	WebElementFacade addAll_btn;

	@FindBy(css = "button[class='pRemoveAll bg-gray-900 text-white block w-full text-center text-size-14 py-5 mt-5 mb-15 hover:bg-lambda-900 rounded']")
	WebElementFacade removeAll_btn;

	@FindBy(css = "button[class='pAdd bg-gray-900 text-white block w-full text-center text-size-14 py-5 mt-15 hover:bg-lambda-900 rounded']")
	WebElementFacade add_btn;

	@FindBy(css = "button[class='pRemove bg-gray-900 text-white block w-full text-center text-size-14 py-5 mt-5 hover:bg-lambda-900 rounded']")
	WebElementFacade remove_btn;

	@FindBy(css = "#pickList > div > div:nth-child(1) > select > option:nth-child(1)")
	WebElementFacade leftTableValue1;

	@FindBy(css = "#pickList > div > div:nth-child(3) > select > option:nth-child(1)")
	WebElementFacade rightTableValue1;

	public void moveValuesjQuery() throws InterruptedException {

		Thread.sleep(1500);
		addAll_btn.click();

		Thread.sleep(1500);
		removeAll_btn.click();

		Thread.sleep(1500);
		leftTableValue1.click();

		Thread.sleep(1500);
		leftTableValue1.click();

		Thread.sleep(1500);
		leftTableValue1.click();

		Thread.sleep(1500);
		add_btn.click();

		Thread.sleep(1500);
		rightTableValue1.click();

		Thread.sleep(1500);
		rightTableValue1.click();

		Thread.sleep(1500);
		rightTableValue1.click();

		Thread.sleep(1500);
		remove_btn.click();

	}

}
