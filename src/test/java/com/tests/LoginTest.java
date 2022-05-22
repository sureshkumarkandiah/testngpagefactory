package com.tests;

import com.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	HomePage hp;

	
	
	@BeforeMethod
	public void setup() {
			hp = new HomePage();
		  
	}

	@Test
	public void login() {
		System.out.println("Test Case 1 with Thread Id:- "
				+ Thread.currentThread().getId());

		getDriver().get("https://www.saucedemo.com/");
		hp.setUserName("standard_user");
		hp.setPassword("secret_sauce");
		hp.login();
		Assert.assertEquals("https://www.saucedemo.com/inventory.html", getDriver().getCurrentUrl());
	}


}


