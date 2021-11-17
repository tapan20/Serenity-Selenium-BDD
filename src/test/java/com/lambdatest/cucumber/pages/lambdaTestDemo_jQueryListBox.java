package com.lambdatest.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.lambdatest.com/selenium-playground/jquery-dual-list-box-demo")

public class lambdaTestDemo_jQueryListBox extends PageObject {

	@FindBy(xpath = "//*[@id=\"pickList\"]/div/div[2]/button[2]")
	WebElementFacade addAll_btn;

	@FindBy(xpath = "//*[@id=\"pickList\"]/div/div[2]/button[4]")
	WebElementFacade removeAll_btn;

	@FindBy(xpath = "//*[@id=\"pickList\"]/div/div[2]/button[1]")
	WebElementFacade add_btn;

	@FindBy(xpath = "//*[@id=\"pickList\"]/div/div[2]/button[3]")
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
