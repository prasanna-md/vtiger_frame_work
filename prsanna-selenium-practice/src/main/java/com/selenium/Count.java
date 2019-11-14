package com.selenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Count {
	@Test(invocationCount = 5)
	//if we give invocations as zero
	//statements will not get execute
	public void demoM() {
		//System.out.println("Hi");
		Reporter.log("Hi",false);//statement will not print if we use false
	}
    @Test(invocationCount = 2, priority = 2)
    public void demoM1() {
    	//System.out.println("Hello");instead of this print statement
    	//we use reporter.log with string and boolean value
    	Reporter.log("Hello", true);//statement wi get print in console
    }
}
