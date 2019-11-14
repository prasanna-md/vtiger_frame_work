package com.selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class ListsDemo implements ITestListener {

	public void onTestStart(ITestResult result) {
      System.out.println(result.getName()+ "ontest start");
      System.out.println(result.getStatus()+"ontest start status");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName());
		System.out.println(result.getStatus());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName());
		System.out.println(result.getStatus());

	}

	public void onStart(ITestContext context) {
		System.out.println(context.getOutputDirectory()+ "99");
		System.out.println(context.getStartDate());
		ITestNGMethod[] tests=context.getAllTestMethods();
		System.out.println(tests);

	}

	public void onFinish(ITestContext context) {
		System.out.println(context.getEndDate());
		System.out.println(context.getFailedTests()+ "failed tests");
		System.out.println(context.getPassedTests()+ "passed tests");

	}

}
