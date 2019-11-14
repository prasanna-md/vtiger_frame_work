package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shine {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shine.com/myshine/login/");
		driver.findElement(By.name("email")).sendKeys("prasannarasna3@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("973983");
		Thread.sleep(2000);
		driver.findElement(By.id("btn_login")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
