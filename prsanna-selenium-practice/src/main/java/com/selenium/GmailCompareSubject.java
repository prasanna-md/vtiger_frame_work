package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GmailCompareSubject {
	@Test
	public void compareMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("md.prasannakumar.apk@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		// Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("7632632751");
		driver.findElement(By.id("passwordNext")).click();
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		Thread.sleep(1000);
		String name = "Wishing Diwali Wishes";
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys(name);
		driver.findElement(By.xpath("//img[@class='Ha']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='TN bzz aHS-bnq']")).click();
		// driver.findElement(By.id(":d4")).click();
		// driver.findElement(By.name("to")).sendKeys("abcd");
		String name1 = driver.findElement(By.xpath("//div[@class='Tm aeJ']/descendant::table[5]/tbody/tr[1]/td[4]/following::td[2]/div/div/div/span/span")).getText();
		Thread.sleep(3000);
		Assert.assertEquals(name, name1);
		Reporter.log("Subject is matching", true);

	}

}
