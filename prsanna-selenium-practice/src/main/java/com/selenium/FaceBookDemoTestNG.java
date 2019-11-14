package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBookDemoTestNG {
	@Test
	public void LoginFb() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("prasannaanvt@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("76326323");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("Facebook Home Page is Displayed");
		driver.close();
    }
	@Test
	public void LoginFb1() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("basheers507@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("bashu@304");
		System.out.println("Error message");
		driver.close();
    }
	

}
