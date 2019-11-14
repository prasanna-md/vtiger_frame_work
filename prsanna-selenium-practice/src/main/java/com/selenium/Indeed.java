package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indeed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/account/login");
		driver.findElement(By.id("login-email-input")).sendKeys("Prasanna@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("login-password-input")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.id("login-submit-button")).click();
		Thread.sleep(1000);
		driver.close();

	}

}
