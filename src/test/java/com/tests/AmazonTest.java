package com.tests;

import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class AmazonTest extends BaseTest {

    @Test
    public void amazonTest (Method m) throws InterruptedException {
        getDriver().get("https://www.amazon.com");
        System.out.println("Method : "+m.getName() + Thread.currentThread().getId() + " - " + getDriver().hashCode()+ getDriver().getTitle());
    }
}
