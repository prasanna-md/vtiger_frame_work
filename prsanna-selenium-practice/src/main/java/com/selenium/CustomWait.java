package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Pinki/Desktop/pmd1.html");
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public java.lang.Boolean apply(WebDriver driver){
				return driver.findElement(By.xpath("//input[@name='textB']")).isDisplayed();
			}
		});
		driver.findElement(By.xpath("//input[@name='textA']")).sendKeys("PRASANNA");

	}

}
