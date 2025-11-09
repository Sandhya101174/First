package com.example;

import org.openqa.selenium.WebDriver;

public class DriverP {
	WebDriver driver;
	public DriverP() {
		
		DriverManager dr = new DriverManager();
		 driver = dr.getDriver();
		Login obj = new Login(driver);

	}
	public void Login()
	{
		driver.findElement("").click();
	}
}
