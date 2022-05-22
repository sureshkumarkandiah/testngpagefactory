package com.tests;

import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class GoogleTest extends BaseTest {

        @Test
        public void googleTest (Method m) throws InterruptedException {
            getDriver().get("https://www.google.com");
            System.out.println("Method : "+m.getName() + Thread.currentThread().getId() + " - " + getDriver().hashCode()+ getDriver().getTitle());

        }
    @Test
    public void flipkartTest (Method m) throws InterruptedException {
        getDriver().get("https://www.flipkart.com");
        System.out.println("Method : "+m.getName() + Thread.currentThread().getId() + " - " + getDriver().hashCode()+ getDriver().getTitle());
    }


}

