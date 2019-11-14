package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListGmail.class)
public class GmailTestCases {
	@Test
	public void Login() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.gmail.com");
 	driver.findElement(By.id("identifierId")).sendKeys("md.prasannakumar.apk@gmail.com");
	driver.findElement(By.id("identifierNext")).click();
	//Thread.sleep(2000);
 	driver.findElement(By.name("password")).sendKeys("7632632751");
 	driver.findElement(By.id("passwordNext")).click();
     
 	if(driver.getTitle().equalsIgnoreCase("inbox")) {
 		System.out.println("test case is passed");
 	}
 	else{
 		System.out.println("test case is failed");
 		Assert.fail();
 	}

}
}