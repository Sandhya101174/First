package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class DriverManager {

	WebDriver driver;
	public WebDriver getDriver() {
		try {
			driver = new ChromeDriver();	
		} catch (Exception e) {
			System.out.println("Exception " + e);
		}
		return driver;

	}
}
