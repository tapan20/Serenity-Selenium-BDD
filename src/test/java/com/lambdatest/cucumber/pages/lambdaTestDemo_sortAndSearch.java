package com.lambdatest.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.lambdatest.com/selenium-playground/table-sort-search-demo")

public class lambdaTestDemo_sortAndSearch extends PageObject {

	@FindBy(css = "#example_filter > label > input[type=search]")
	WebElementFacade search_txtBox;

	@FindBy(css = "#example > thead > tr > th.sorting_desc")
	WebElementFacade positionDescSort;

	@FindBy(css = "#example > thead > tr > th.sorting_asc")
	WebElementFacade positionASCSort;

	@FindBy(css = "	#example > thead > tr > th:nth-child(2)")
	WebElementFacade positionSort;

	public void seachAndSort() throws InterruptedException {

		Thread.sleep(1500);
		search_txtBox.click();

		Thread.sleep(1500);
		search_txtBox.sendKeys("G. Winters");

		Thread.sleep(1500);
		search_txtBox.clear();

//		Thread.sleep(1500);
//		search_txtBox.clear();

		Thread.sleep(1500);
		positionSort.click();

		Thread.sleep(1500);
		positionASCSort.click();

		Thread.sleep(1500);
		positionDescSort.click();

	}

}
