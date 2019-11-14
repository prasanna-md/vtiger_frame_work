package com.selenium; 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceBookCustomWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public java.lang.Boolean apply(WebDriver driver){
				return driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();
			}
		});
		driver.findElement(By.id("email")).sendKeys("prasannaanvt@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("789456415");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		

	}

}
