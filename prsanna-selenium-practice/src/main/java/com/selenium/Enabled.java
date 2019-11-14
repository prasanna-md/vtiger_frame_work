package com.selenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
		@Test(enabled=false)
		public void demoM() {
			Reporter.log("Hi",true);//statement will not print if we use false
		}
	    @Test
	    public void demoM1() {
	    	//we use reporter.log with string and boolean value
	    	Reporter.log("Hello", true);//statement wi get print in console
	    }
	    @Test
	    public void demoM2() {
	    	//we use reporter.log with string and boolean value
	    	Reporter.log("Bye", true);//statement wi get print in console
	    }
	}


