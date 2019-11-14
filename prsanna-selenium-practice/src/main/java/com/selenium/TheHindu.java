package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TheHindu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://epaper.thehindu.com/login");
		driver.findElement(By.id("txtNumber1")).sendKeys("prasannamd01@gamil.com");
		driver.findElement(By.id("txtPassword")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.className("btn btn-signup")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
