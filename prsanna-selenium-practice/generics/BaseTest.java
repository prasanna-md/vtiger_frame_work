package com.generics;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BaseTest implements IAutoConst {
	public static Properties con;
	public static FileInputStream fis;
	public static WebDriver driver;
	public static String browser_name="";
	
	
	static {
		Scanner sc= new Scanner(System.in);
		browser_name = sc.next();
		if(browser_name.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
		}
		else {
			System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
		}
	}

	@BeforeMethod
	public void openApp() {
		if(browser_name.contains("chrome")) {
			driver=new ChromeDriver();
		}
		else {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.get(URL);
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
}
