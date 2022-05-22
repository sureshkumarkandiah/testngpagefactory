package com.tests;

import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrderItemsTest extends BaseTest {
	
	HomePage hp;
	ProductsPage pp;
	CartPage cp;
	
	
	@BeforeMethod
	public void setup() {
			hp = new HomePage();
		    pp = new ProductsPage();
		    cp = new CartPage();
	}
	
 
	
	@Test
	public void orderTwoItems() {
		System.out.println("Test Case 3 with Thread Id:- "
				+ Thread.currentThread().getId());

		getDriver().get("https://www.saucedemo.com/");
		hp.setUserName("standard_user");
		hp.setPassword("secret_sauce");
		hp.login();
		Assert.assertEquals("https://www.saucedemo.com/inventory.html", getDriver().getCurrentUrl());
		pp.addBackPack();
		pp.addBikeLight();
		pp.clickShoppingCart().clickCheckOut();
		cp.setFirstName();
		cp.setLastName();
		cp.setPostCode();
		cp.clickContinue();
		cp.clickFinish();
		cp.verifyOrderCompletion();
			
	}


}


