package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.core.framework.BaseTest;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver dr) {
		this.driver = dr;
		PageFactory.initElements(driver, this);
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
		return new ProductsPage(driver);
	}
	
	public String verifyLockedOutUser() {
		return lockedOutBtn.getText();
	}
}
