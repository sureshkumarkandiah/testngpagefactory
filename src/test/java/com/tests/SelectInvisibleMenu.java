package com.tests;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SelectInvisibleMenu extends BaseTest{

	@Test
	public void flipkartTest() throws InterruptedException {
		System.out.println("FlipKart App Test - " + Thread.currentThread().getId() + "@"+ getDriver().hashCode());
		getDriver().get("https://www.flipkart.com");
		WebElement ele = getDriver().findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']"));
		if(ele.isDisplayed()) {
			ele.click();
		}
		
		WebElement fashionLink = getDriver().findElement(By.xpath("//div[@class='CXW8mj']/img[@alt='Fashion']"));
		Actions act = new Actions(getDriver());
		act.moveToElement(fashionLink).perform();
		
		List<WebElement> subMenusFashion = getDriver().findElements(By.xpath("//div[@class='_3XS_gI']/a"));
		for(WebElement subMenu : subMenusFashion){
			System.out.println(subMenu.getText());	
		}
		
		subMenusFashion.get(0).click();
		Thread.sleep(10000);
		
		
		
		

	}

}
