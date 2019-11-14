package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleJavaNext {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java",Keys.ENTER);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	List<WebElement> ele = driver.findElements(By.xpath("//td[@class='cur']/following::td"));
	for(int i=0;i<=ele.size()+1;i++) {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");// up to down end
		Thread.sleep(2000);
		System.out.println(i);
		driver.findElement(By.xpath("//span[@style=\"display:block;margin-left:53px\"]")).click();
	}
	System.out.println("**********");
}
	}

