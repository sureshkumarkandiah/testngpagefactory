package com.core.framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    // Determine which drives needs to be created


    public static void initializeWebDriver(String browser) throws InterruptedException {
        if (browser.equals("chrome")) {
           WebDriver driver = WebDriverManager.chromedriver().create();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            DriverManager.setDriver(driver);
            System.out.println("Driver After Initiated" + Thread.currentThread().getId() +" - "+ driver.hashCode());


        } else if (browser.equals("edge")) {
            WebDriver driver = WebDriverManager.edgedriver().create();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            DriverManager.setDriver(driver);
        }


    }

}
