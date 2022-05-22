package com.auto.tests;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleListAppsTest extends BaseTest {

	@Test
	public void googleAppTest() {
		System.out.println("Google App Test - " + Thread.currentThread().getId() + "@"+ getDriver().hashCode());
		getDriver().get("https://www.google.com");
		getDriver().findElement(By.xpath("//*[@id=\"gbwa\"]/div/a")).click();
		WebElement frameid = getDriver().findElement(By.xpath(".//iframe[@role='presentation']"));
		getDriver().switchTo().frame(frameid);
		List<WebElement> links = getDriver().findElements(By.xpath(".//a/span[@class='Rq5Gcb']"));
		for(WebElement link:links) {
			System.out.println(link.getText());
			
		}
		
	}



}
