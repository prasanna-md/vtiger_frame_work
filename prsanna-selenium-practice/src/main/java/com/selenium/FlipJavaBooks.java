package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipJavaBooks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java books",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='_3ywJNQ']/div[contains(.,'Price -- Low to High')]")).click();
		List<WebElement> rate=driver.findElements(By.xpath("//div[@class='hGSR34']"));
		for(WebElement rating:rate )
		{
			//String rate1=rating.
		}

	}

}
