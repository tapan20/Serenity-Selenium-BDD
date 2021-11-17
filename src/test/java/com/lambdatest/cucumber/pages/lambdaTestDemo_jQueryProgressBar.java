package com.lambdatest.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.lambdatest.com/selenium-playground/jquery-download-progress-bar-demo")

public class lambdaTestDemo_jQueryProgressBar extends PageObject {

	@FindBy(css = "#downloadButton")
	WebElementFacade startDownload_btn;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/button")
	WebElementFacade cancelDownload_Btn;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/button")
	WebElementFacade close_btn;

	public void startProgress() throws InterruptedException {

		Thread.sleep(1500);
		startDownload_btn.click();

		Thread.sleep(1500);
		cancelDownload_Btn.click();

		Thread.sleep(1500);
		startDownload_btn.click();

		Thread.sleep(9000);
		close_btn.click();

	}

}
