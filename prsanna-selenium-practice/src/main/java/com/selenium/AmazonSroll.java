package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class AmazonSroll {
	public void takescreenshot(WebDriver driver,String name) throws IOException {
		
		
		TakesScreenshot ts=(TakesScreenshot) driver;
			File sc=ts.getScreenshotAs(OutputType.FILE);
			File ff=new File("C:\\Users\\Pinki\\eclipse-workspace\\prsanna-selenium-practice\\TakesScreenshot\\"+ name +".png");
			Files.copy(sc, ff);
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		AmazonSroll aa=new AmazonSroll();
		aa.takescreenshot(driver, "Amazon Home Page");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		aa.takescreenshot(driver, "Amazon Home Page scroll down");
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(1000);
		aa.takescreenshot(driver,"Amazon Home Page scroll up");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		aa.takescreenshot(driver, "Amazon full scrolldown");
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(1000);
		aa.takescreenshot(driver,"Amazon Home Page scroll up");
		
		
		
		

	}

}
