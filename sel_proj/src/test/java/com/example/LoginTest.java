package com.example;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import junit.framework.TestCase;


//Markers
/**
 * Unit test for simple App.
 */
public class LoginTest extends BaseTest {
 
	// TC_01:Login into Facebook with correct creds
	@Test
	public void loginWithCorrectCredentials() throws InterruptedException {	
		List creds = er.getFromExcel("TC_01");
		obj.enterFacebookCredentials((String)creds.get(1), (String)creds.get(2));

	}
	
	// TC_02:Login into Facebook with incorrect creds
	@Test
	public void loginWithInCorrectCredentials() {
		List<String> creds = er.getFromExcel("TC_02");
		obj.enterFacebookCredentials(creds.get(1), creds.get(2));
	}


}
