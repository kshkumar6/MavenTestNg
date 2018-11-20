package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.methods.*;

public class TC_ValidateModify extends Methods{
	static WebDriver wd;// = new FirefoxDriver();
	static WebDriverWait wait;// = new WebDriverWait(wd, 20);
	
	@Test(priority=20)
	public static void launchbrowser() {
		wd = new FirefoxDriver();
		wait = new WebDriverWait(wd, 20);
	}
	
	@Test(priority=21)
	public static void NavigateToURL() {
		launchBrowser(wd);
	}
	
	@Test(priority=22)
	public static void EnterUserDetails() throws InterruptedException {
		EnterTravelDetails(wd,wait);
	}
	
	@Test(priority=23)
	public static void validateUserDetails() {
		custDetails(wd,wait);
	}
	
	@Test(priority=24)
	public static void ModifyDetailsAndValidate() {
		ModifyDetails(wd,wait);
		updateDetails(wd);
		validateUpdatedDetails(wd,wait);
	}
	
	@Test(priority=25)
	public static void closeDriver() {
		tearDown(wd);
	}
}
