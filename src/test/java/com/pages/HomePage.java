package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {

	
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	


	@FindBy(name="user-name")
	 private WebElement userTxt;
	
	@FindBy(name="password")
	 private WebElement passwordTxt;
	
	@FindBy(name="login-button")
	private WebElement loginBtn;
	
	@FindBy(xpath="//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
	private WebElement lockedOutBtn;
	
	
	
	public void setUserName(String userName) {
		userTxt.sendKeys(userName);		
	}
	
	public void setPassword(String passWord) {
		passwordTxt.sendKeys(passWord);		
	}
	
	public ProductsPage login() {
		loginBtn.click();
		return new ProductsPage();
	}
	
	public String verifyLockedOutUser() {
		return lockedOutBtn.getText();
	}
}
