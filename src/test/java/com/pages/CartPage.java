package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.core.framework.BaseTest;

public class CartPage  {
	WebDriver driver;
	
	public CartPage(WebDriver dr) {
		this.driver = dr;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="checkout")
	private WebElement btnCheckOut;
	
	@FindBy(id="first-name")
	private WebElement txtFirstName;
	
	@FindBy(id="last-name")
	private WebElement txtLastName;
	
	@FindBy(id="postal-code")
	private WebElement txtPostCode;
	
	@FindBy(id="continue")
	private WebElement btnContinue;
	
	@FindBy(id="finish")
	private WebElement btnFinish;
	
	@FindBy(xpath="//h2[@class='complete-header']")
	private WebElement hdrOrderDone;
	
	public void clickCheckOut() {
		btnCheckOut.click();
	}
	
	
	public void setFirstName() {
		txtFirstName.sendKeys("John");
	}
	
	public void setLastName() {
		txtLastName.sendKeys("Doe");
	}
	
	public void setPostCode() {
		txtPostCode.sendKeys("33172");
	}
	
	
	public void clickContinue() {
		btnContinue.click();
	}
	
	public void clickFinish() {
		btnFinish.click();
	}
	
	public void verifyOrderCompletion() {
		Assert.assertEquals(hdrOrderDone.getText(),"THANK YOU FOR YOUR ORDER");
	}
}
