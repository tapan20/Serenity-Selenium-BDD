package com.lambdatest.cucumber.pages;

import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.lambdatest.com/selenium-playground/bootstrap-date-picker-demo")

public class lambdaTestDemo_datePicker extends PageObject {

	@FindBy(css = "#birthday")
	WebElementFacade datePicker_text;

	@FindBy(css = "#ex1-check1")
	WebElementFacade multiCheckBox1;

	@FindBy(css = "#ex1-check2")
	WebElementFacade multiCheckBox2;

	@FindBy(css = "#datepicker > input:nth-child(1)")
	WebElementFacade fromDatePicker;

	@FindBy(css = "#datepicker > input:nth-child(3)")
	WebElementFacade toDatePicker;

	@FindBy(css = "body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-top > div.datepicker-days > table > tbody > tr:nth-child(6) > td:nth-child(7)")
	WebElementFacade selectLastCellFromDatePicker;

	public void datePicker() throws InterruptedException {

		Date today = new Date(); // Fri Jun 17 14:54:28 PDT 2016
		Calendar cal = Calendar.getInstance();
		cal.setTime(today); // don't forget this if date is arbitrary e.g. 01-01-2014
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH); // 17
		int month = cal.get(Calendar.MONTH); // 5
		int year = cal.get(Calendar.YEAR); // 2016

		Thread.sleep(1500);
		datePicker_text.click();

		Thread.sleep(1500);
		datePicker_text.sendKeys(String.valueOf(dayOfMonth));

		Thread.sleep(1500);
		datePicker_text.sendKeys(String.valueOf(month));

		Thread.sleep(1500);
		datePicker_text.sendKeys(String.valueOf(year));

		Thread.sleep(2000);

		fromDatePicker.click();

		String todayDate = dayOfMonth + "/" + month + "/" + year;
		fromDatePicker.sendKeys(todayDate);

		Thread.sleep(1500);

		toDatePicker.click();
		Thread.sleep(1000);

		selectLastCellFromDatePicker.click();
		Thread.sleep(1000);

	}

}
