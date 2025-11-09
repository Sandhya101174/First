package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterFacebookCredentials(String username, String password) {
	       driver.get("https://www.facebook.com/");
	       driver.findElement(By.id("email")).sendKeys(username);
	       driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
	       driver.findElement(By.xpath("//button[@name='login']")).click();
//	       driver.findElement(By.xpath(""));
	       
	}
	
	public void enterFlipkartCredentials(String phoneNo) {
	       driver.get("https://www.flipkart.com/");
	       driver.findElement(By.xpath("//a/span[text()='Login']")).click();
	       driver.findElement(By.xpath("//label[span[text()='Enter Email/Mobile number']]/preceding-sibling::input")).sendKeys(phoneNo);
	       driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
//	       driver.findElement(By.xpath(""));
	       
	}
	
}
