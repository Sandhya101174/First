package com.example;

import org.openqa.selenium.WebDriver;

/**
 * Unit test for simple App.
 */
public class NormalLoginTest {

	public void LoginWithCorrectCredentials() throws InterruptedException {
		DriverManager dm = new DriverManager();
		WebDriver driver = dm.getDriver();
		Login obj = new Login(driver);
		obj.enterFlipkartCredentials("sahadeokhandagale@gmail.com", "123456789");
//		driver.close();

	}

	public void LoginWithInCorrectCredentials() throws InterruptedException {
		DriverManager dm = new DriverManager();
		WebDriver driver = dm.getDriver();
		Login obj = new Login(driver);
		obj.enterCredentials("kalesandhya1011@gmail.com", "sandhya@1998");
		driver.close();

	}

	public static void main(String[] args) throws InterruptedException {
		NormalLoginTest nlt = new NormalLoginTest();
		nlt.LoginWithCorrectCredentials();
//		nlt.LoginWithInCorrectCredentials();
	}

}
