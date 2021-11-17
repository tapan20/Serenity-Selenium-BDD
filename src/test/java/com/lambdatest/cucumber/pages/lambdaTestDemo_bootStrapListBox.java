package com.lambdatest.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.lambdatest.com/selenium-playground/bootstrap-dual-list-box-demo")

public class lambdaTestDemo_bootStrapListBox extends PageObject {

	@FindBy(xpath = "//*[@id=\"__next\"]/section[4]/div/div/div[2]/div/div/div[1]/div/ul/li[1]")
	WebElementFacade value1;

	@FindBy(xpath = "//*[@id=\"__next\"]/section[4]/div/div/div[2]/div/div/div[1]/div/ul/li[2]")
	WebElementFacade value2;

	@FindBy(css = "//*[@id=\"__next\"]/section[4]/div/div/div[2]/div/div/div[1]/div/ul/li[3]")
	WebElementFacade value3;

	@FindBy(css = ".block.mx-auto.border.border-black.mt-10.px-10.py-2.rounded.text-black.btn.btn-default.btn-sm.move-right")
	WebElementFacade moveLeftRight_btn;

	@FindBy(css = ".btn.btn-default.btn-sm.move-left.transform.rotate-180.border.border-black.block.mx-auto.border.border-black.mt-10.px-10.py-2.rounded.text-black")
	WebElementFacade moveRightLeft_btn;

	@FindBy(xpath = "//*[@id=\"__next\"]/section[4]/div/div/div[2]/div/div/div[3]/div/ul/li[1]")
	WebElementFacade value4;

	@FindBy(css = "//*[@id=\"__next\"]/section[4]/div/div/div[2]/div/div/div[3]/div/ul/li[2]")
	WebElementFacade value5;

	@FindBy(css = "//*[@id=\"__next\"]/section[4]/div/div/div[2]/div/div/div[3]/div/ul/li[3]")
	WebElementFacade value6;

	public void moveValues() throws InterruptedException {

		Thread.sleep(1500);
		value1.click();

		Thread.sleep(1500);
		value2.click();

		Thread.sleep(1500);
		value3.click();

		Thread.sleep(1500);
		moveLeftRight_btn.click();

		Thread.sleep(1500);
		value4.click();

		Thread.sleep(1500);
		value5.click();

		Thread.sleep(1500);
		value6.click();

		Thread.sleep(1500);
		moveRightLeft_btn.click();

	}

}
