package com.lambdatest.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.lambdatest.com/selenium-playground/table-pagination-demo")

public class lambdaTestDemo_pagination extends PageObject {

	@FindBy(css = "#maxRows")
	WebElementFacade maxRows_dropDown;

	@FindBy(css = "#maxRows > option:nth-child(3)")
	WebElementFacade nbOfRows;

	@FindBy(css = "#__next > div.wrapper > section.mt-50 > div > div > div.w-8\\/12.smtablet\\:w-full.px-15.smtablet\\:mt-20 > div.pagination-container > nav > ul > li:nth-child(3) > span")
	WebElementFacade pagination;

	public void pagination() throws InterruptedException {

		Thread.sleep(1500);
		maxRows_dropDown.click();

		Thread.sleep(1500);
		nbOfRows.click();

		Thread.sleep(1500);
		pagination.click();

	}

}
