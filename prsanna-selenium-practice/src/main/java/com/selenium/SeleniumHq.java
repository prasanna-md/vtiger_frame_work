package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.SeleniumHome;

public class SeleniumHq {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org");
		SeleniumHome sh=new SeleniumHome(driver);
		sh.sendText("java");
		Thread.sleep(2000);
		sh.goClick();
	    driver.navigate().back();
	    Thread.sleep(2000);
	    sh.clearText();
		Thread.sleep(2000);
		sh.sendText("testNG");
		sh.goClick();
		
	

}
}
