package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java",Keys.ENTER);
		System.out.println(driver.getTitle());
		System.out.println();
		driver.findElement(By.xpath("//a[@href='https://www.java.com/']/h3[@class='LC20lb']")).click();
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		driver.close();
	}

}
