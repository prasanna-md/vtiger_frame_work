package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonScrollParticular {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement ele=driver.findElement(By.xpath("//span[text()='Back to top']"));
		js.executeScript("arguments[0].scrollIntoView()",ele);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-100)");
		driver.findElement(By.xpath("//span[text()='Back to top']")).click();
		
	}

}
