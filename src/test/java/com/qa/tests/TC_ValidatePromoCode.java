package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.methods.*;

public class TC_ValidatePromoCode extends Methods{
	static WebDriver wd;// = new FirefoxDriver();
	static WebDriverWait wait;// = new WebDriverWait(wd, 20);
		
	@Test(priority=50)
	public static void launchbrowser() {
		wd = new FirefoxDriver();
		wait = new WebDriverWait(wd, 20);
	}
		@Test(priority=51)
		public static void NavigateToURL() {
			launchBrowser(wd);
		}
		
		@Test(priority=52)
		public static void AEnterUserDetails() throws InterruptedException {
			EnterTravelDetails(wd, wait);
		}
		@Test(priority=53)
		public static void ValidatePromoCode() throws InterruptedException {
		validate_Promo(wd, wait);
		}
		
		@Test(priority=54)
		public static void closeDriver() {
		tearDown(wd);
	}
}
