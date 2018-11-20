package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.methods.*;

public class TC_ConfirmAndValidateBooking extends Methods{
	static WebDriver wd;// = new FirefoxDriver();
	static WebDriverWait wait;// = new WebDriverWait(wd, 20);
	
	@Test(priority=60)
	public static void launchbrowser() {
		wd = new FirefoxDriver();
		wait = new WebDriverWait(wd, 20);
	}
	@Test(priority=61)
	public static void NavigateToURL() {
		launchBrowser(wd);
	}
	
	@Test(priority=62)
	public static void EnterUserDetails() throws InterruptedException {
		EnterTravelDetails(wd, wait);
	}
	
	@Test(priority=63)
	public static void EnterPaymentDetails() {
		enterPaymentDetails(wd, wait);
	}
	
	@Test(priority=64)
	public static void confirmBooking(){
		validateSuccessfulbooking(wd, wait);
	}
	
	@Test(priority=65)
	public static void closeDriver() {
		tearDown(wd);
	}
}
