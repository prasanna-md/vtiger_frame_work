package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOrg {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org");
		Thread.sleep(15000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//scroll top to bottom
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		//scroll bottom to top
		js.executeScript("window.scrollBy(0,-500)");
		//scroll from left to right
		js.executeScript("window.scrollBy(200,0)");
		Thread.sleep(2000);
		//scroll from top to till end
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); 
		Thread.sleep(1000);
		//scroll from bottom to till up
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(1000);
		//scroll from left to till end(right)
		js.executeScript("window.scrollTo(document.body.scrollWidth,0)");
		Thread.sleep(1000);
		//scroll from right to left till end
		js.executeScript("window.scrollTo(-document.body.scrollWidth,0)");
		
}
}
	
