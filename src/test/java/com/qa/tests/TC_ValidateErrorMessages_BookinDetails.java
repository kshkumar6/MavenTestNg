package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.methods.*;

public class TC_ValidateErrorMessages_BookinDetails extends Methods{
	static WebDriver wd;// = new FirefoxDriver();
	static WebDriverWait wait;// = new WebDriverWait(wd, 20);
	
	@Test(priority=30)
	public static void launchbrowser() {
		wd = new FirefoxDriver();
		wait = new WebDriverWait(wd, 20);
	}
	
	@Test(priority=31)
	public static void NavigateToURL() {
		launchBrowser(wd);
	}
	
	@Test(priority=32)
	public static void ValidateErrorMessages() throws InterruptedException {
		bookingErrorMessage(wd);
		validateEmail(wd);
		validateArrivalTime(wd);
		validatePassengerNum(wd);
	}
	
	@Test(priority=33)
	public static void closeDriver() {
		tearDown(wd);
	}
}
