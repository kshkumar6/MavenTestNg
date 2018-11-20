package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.methods.*;

public class TC_ValidateBackButton extends Methods{
	static WebDriver wd;// = new FirefoxDriver();
	static WebDriverWait wait;// = new WebDriverWait(wd, 20);
	
	@Test(priority=0)
	public static void launchbrowser() {
		wd = new FirefoxDriver();
		wait = new WebDriverWait(wd, 20);
	}
	@Test(priority=1)
	public static void NavigateToURL() {
		launchBrowser(wd);
	}
	
	@Test(priority=2)
	public static void AEnterUserDetails() throws InterruptedException {
		EnterTravelDetails(wd, wait);
	}
	@Test(priority=3)
	public static void BvalidateUserDetails() {
		custDetails(wd, wait);
	}
	@Test(priority=4)
	public static void ClickBackAndValidate() {
		validateBackFeature(wd);
	}
	
	@Test(priority=5)
	public static void closeDriver() {
		tearDown(wd);
	}
}
