package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.methods.*;

public class TC_ValidateErrorMessages_Payment extends Methods{
	
	static WebDriver wd;// = new FirefoxDriver();
	static WebDriverWait wait;// = new WebDriverWait(wd, 20);
	
	@Test(priority=40)
	public static void launchbrowser() {
		wd = new FirefoxDriver();
		wait = new WebDriverWait(wd, 20);
	}
	
	@Test(priority=41)
	public static void NavigateToURL() {
		launchBrowser(wd);
	}
	
	@Test(priority=42)
	public static void EnterUserDetails() throws InterruptedException {
		EnterTravelDetails(wd, wait);
	}
	@Test(priority=43)
	public static void ValidatePaymentErrorMessages() {
		validatePaymentError(wd, wait);
		valCardnum(wd);
		valCvvNum(wd);
	}
	
	
	@Test(priority=44)
	public static void closeDriver() {
		tearDown(wd);
	}
}
