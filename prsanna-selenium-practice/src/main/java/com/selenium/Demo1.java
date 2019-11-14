package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("prasannaanvt@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("763263275123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
		
		

	}

}
