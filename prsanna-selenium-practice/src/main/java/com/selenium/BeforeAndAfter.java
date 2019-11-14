package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfter {
	WebDriver driver;
	@BeforeMethod
	public void beforeM() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		System.out.println("Before Method");
	}
	@AfterMethod
	public void afterM() {
		driver.close();
		System.out.println("After Method");
	}
	@Test
	public void demoM() {
		driver.findElement(By.name("email")).sendKeys("Alia",Keys.ENTER);
		System.out.println("Hi");
	}
	@Test
	public void demoM1() {
		driver.findElement(By.name("email")).sendKeys("Ranbir",Keys.ENTER);
		System.out.println("HI");
	}


}
