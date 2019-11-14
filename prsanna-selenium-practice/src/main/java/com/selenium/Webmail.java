package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webmail.testyantra.in/");
		driver.findElement(By.id("user")).sendKeys("prasanna.d@testyantra.in");
		driver.findElement(By.id("pass")).sendKeys("pass");
		Thread.sleep(5000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
