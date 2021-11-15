package com.lambdatest.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.lambdatest.com/selenium-playground/generate-file-to-download-demo")

public class lambdaTestDemo_fileDownload extends PageObject {

	@FindBy(css = "#textbox")
	WebElementFacade textBox;

	String random = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with";

	@FindBy(css = "#create")
	WebElementFacade generateFile_btn;

	@FindBy(css = "#link-to-download")
	WebElementFacade downloadBtn;

	public void fileDownload() throws InterruptedException {

		Thread.sleep(1500);
		textBox.click();

		Thread.sleep(1500);
		textBox.sendKeys(random);

		Thread.sleep(1500);
		generateFile_btn.click();

		Thread.sleep(1500);
		downloadBtn.click();

	}

}
