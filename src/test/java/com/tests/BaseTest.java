package com.auto.tests;

import com.core.framework.DriverFactory;
import com.core.framework.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.sql.Driver;

public class BaseTest {


    @BeforeMethod
    public void setup(Method m) throws InterruptedException {

        DriverFactory.initializeWebDriver("chrome");

        System.out.println("Method : "+m.getName() + Thread.currentThread().getId() +" - "+ getDriver().hashCode());

    }

    @AfterClass
    public void tear(){
        System.out.println("tear" + Thread.currentThread().getId() +" - "+ getDriver().hashCode());
        DriverManager.terminate();
    }

    public static WebDriver getDriver() {
        return DriverManager.getDriver();
    }

    }


