package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 */
public class App {
     

	public static void main(String[] args) {
       WebDriver driver= new ChromeDriver();
       driver.get("https://www.facebook.com/");
       driver.manage().window().maximize();
       driver.findElement(By.id("email")).sendKeys("sandhya@gmail.com");
//       WebElement email = driver.findElement(By.id("email"));
//       email.sendKeys("sandhya@gmail.com");
      
       }
}
