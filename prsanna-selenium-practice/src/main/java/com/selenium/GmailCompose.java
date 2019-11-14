package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailCompose {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("md.prasannakumar.apk@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		//Thread.sleep(2000);
     	driver.findElement(By.name("password")).sendKeys("7632632751");
     	driver.findElement(By.id("passwordNext")).click();
     	driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("//textarea[@aria-label='To']")).sendKeys("pavandv9@gmail.com");
     	driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Wishing Diwali wishes");
     	driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Happy Diwali In Advance");
     	driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();

	}

}
