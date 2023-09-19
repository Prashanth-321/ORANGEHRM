package com.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class extentreports {
	
	
	ExtentReports reporter = new ExtentReports();
	ExtentSparkReporter esr = new ExtentSparkReporter(".reports.html");
	
	public void test() 
	{
		reporter.attachReporter(esr);
	}
	
	

}
