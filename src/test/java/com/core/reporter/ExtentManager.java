package com.core.reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager {
    static final String report = "AUTOMATION";
    public static ExtentReports getExtentInstance(){
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter extentReporter = new ExtentSparkReporter(getReportName()) ;
        extent.attachReporter(extentReporter);
        return extent;
    }
    public static String  getReportName(){
        Date date = new Date();
        String fileName = "AutomationReport_"+date.toString().replace(":", "_").replace(",","_") + ".html";
        return System.getProperty("user.dir")+"//target//"+fileName;
    }
}
