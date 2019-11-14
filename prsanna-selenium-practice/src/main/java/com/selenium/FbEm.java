package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbEm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
//		//copying text
//		String text = driver.findElement(By.xpath("//label[@for='email']")).getText();
//		//paste
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(text);
		driver.findElement(By.xpath("//a[@title=\"Go to Facebook home\"]"));
		//driver.findElement(By.tagName("title")).getText();
		

	}

}
