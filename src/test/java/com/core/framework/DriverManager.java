package com.core.framework;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();

    public static void setDriver(WebDriver driver) throws InterruptedException {
        dr.set(driver);
    }

    public static WebDriver getDriver(){

        return  dr.get();
    }

    public static void terminate(){
        dr.remove();
    }
}
