/*package com.core.framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private DriverFactory(){

    }


    // Determine which drives needs to be created
    public static WebDriver initializeWebDriver() throws InterruptedException {
        WebDriver driver = null;
        String browser = "chrome";
        if(browser.equals("chrome")) {
             driver = WebDriverManager.chromedriver().create();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
          else if(browser.equals("edge")){
             driver =  WebDriverManager.edgedriver().create();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        return driver;

    }

}
*/