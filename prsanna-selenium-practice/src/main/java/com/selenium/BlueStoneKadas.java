package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneKadas {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		//List<WebElement> menu=driver.findElements(By.xpath("//nav[@class='wh-navbar']/ul/li/a[@title='Jewellery']"));
		List<WebElement> menu=driver.findElements(By.xpath("//nav[@class='wh-navbar']/ul/li/a[@title='Jewellery']"));

		Actions a=new Actions(driver);
		for(WebElement name:menu)
		{
			
			a.moveToElement(name).build().perform();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@data-p=\"mens-jewellery-kadas,m\"]")).click();
			driver.findElement(By.xpath("//img[@alt='The Arjun Kada For Him']")).click();
			driver.findElement(By.xpath("//input[@id='buy-now']")).click();

	}

	}
}
