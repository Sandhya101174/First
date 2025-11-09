package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import junit.framework.TestCase;

/**
 * Unit test for testing posts.
 */
public class PostTest extends BaseTest {

//	WebDriver driver;
//	Login obj;
//
//	public PostTest() throws InterruptedException {
//		DriverManager dr = new DriverManager();
//		driver = dr.getDriver();
//		obj = new Login(driver);
//	}

	/**
	 * Rigorous Test :-)
	 * 
	 * @throws InterruptedException
	 */

	@Test
	public void CreatePost() throws InterruptedException {

		obj.enterFlipkartCredentials("9987618804");

	}

	@Test
	public void LoginWithInCorrectCredentials() {

		obj.enterFlipkartCredentials("56646743");

	}

//	@AfterEach
//	void cleanupAfterEachTest() {
//		//driver.close();
//		// Perform cleanup, reset state, etc.
//	}

}
