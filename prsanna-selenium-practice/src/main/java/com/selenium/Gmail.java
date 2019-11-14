package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
	 	driver.findElement(By.id("identifierId")).sendKeys("prasannamd01@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		//Thread.sleep(2000);
     	driver.findElement(By.name("password")).sendKeys("12345");
     	driver.findElement(By.id("passwordNext")).click();
     	//Thread.sleep(5000);
     	driver.close();
        
	}

}
