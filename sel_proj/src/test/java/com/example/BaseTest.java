package com.example;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;

import junit.framework.TestCase;

public class BaseTest extends TestCase {
	
	WebDriver driver;
	Login obj;
	ExcelReader er = new ExcelReader();
	
	public BaseTest() {

		DriverManager dr = new DriverManager();
		driver = dr.getDriver();
		obj = new Login(driver);

	}
	
	@AfterEach
	void cleanupAfterEachTest() {
		driver.close();
		// Perform cleanup, reset state, etc.
	}

}
