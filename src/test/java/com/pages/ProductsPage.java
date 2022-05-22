package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.core.framework.BaseTest;

public class ProductsPage {
	
	
	WebDriver driver;
	
	public ProductsPage(WebDriver dr) {
		this.driver = dr;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement btnAddBPack;
	
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	private WebElement btnBikeLight;
	
	@FindBy(id="shopping_cart_container")
	private WebElement btnShoppingCart;
	
	
	public void addBackPack() {
		btnAddBPack.click();
	}
	
	public void addBikeLight() {
		btnBikeLight.click();
		
	}
	
	public CartPage clickShoppingCart() {
		btnShoppingCart.click();	
		return new CartPage(driver);
	}
	
	
}
