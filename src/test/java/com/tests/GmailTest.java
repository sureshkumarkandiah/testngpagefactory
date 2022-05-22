package com.tests;

import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class GmailTest extends BaseTest{

    @Test
    public void gmailTest (Method m) throws InterruptedException {
        getDriver().get("https://www.gmail.com");
        System.out.println("Method : "+m.getName() + Thread.currentThread().getId() + " - " + getDriver().hashCode()+ getDriver().getTitle());


    }
}
