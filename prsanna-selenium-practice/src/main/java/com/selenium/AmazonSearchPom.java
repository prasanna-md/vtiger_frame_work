package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.AmazonHome;

public class AmazonSearchPom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		AmazonHome ah=new AmazonHome(driver);
		ah.sendText("iphone");
		Thread.sleep(1000);
		ah.goClick();
		Thread.sleep(500);
		ah.phoneClick();
		ah.addCart();
		Thread.sleep(1000);
		ah.clickLink();
		Thread.sleep(1000);
		ah.clearText();
		Thread.sleep(500);
		ah.sendText("oneplus");
		Thread.sleep(1000);
		ah.goClick();
		Thread.sleep(1000);
		ah.phClick();
	}

}
