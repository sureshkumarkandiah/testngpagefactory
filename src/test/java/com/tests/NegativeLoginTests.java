package com.auto.tests;

import com.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NegativeLoginTests extends BaseTest {
	
	HomePage hp;

	
	
	@BeforeMethod
	public void setup() {
			hp = new HomePage();
		  
	}

	@Test
	public void lockedOutLogin() {
		System.out.println("Test Case 2 with Thread Id:- "
				+ Thread.currentThread().getId());

		getDriver().get("https://www.saucedemo.com/");
		hp.setUserName("locked_out_user");
		hp.setPassword("secret_sauce");
		hp.login();
		Assert.assertEquals("Epic sadface: Sorry, this user has been locked out.", hp.verifyLockedOutUser());	
		
	}
	



}


