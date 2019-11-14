package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class BluStonScShKadas {
public void takescreenshot(WebDriver driver,String name) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File sc=ts.getScreenshotAs(OutputType.FILE);
		File ff=new File("C:\\Users\\Pinki\\eclipse-workspace\\prsanna-selenium-practice\\TakesScreenshot\\"+ name +".png");
		Files.copy(sc, ff);
}

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BluStonScShKadas ss=new BluStonScShKadas();
		driver.get("https://www.bluestone.com");
		ss.takescreenshot(driver, " BlueStone1HP");
		//List<WebElement> menu=driver.findElements(By.xpath("//nav[@class='wh-navbar']/ul/li/a[@title='Jewellery']"));
		List<WebElement> menu=driver.findElements(By.xpath("//nav[@class='wh-navbar']/ul/li/a[@title='Jewellery']"));
		ss.takescreenshot(driver, "All jewellery");
		Actions a=new Actions(driver);
		for(WebElement name:menu)
		{
			
			a.moveToElement(name).build().perform();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@data-p=\"mens-jewellery-kadas,m\"]")).click();
			ss.takescreenshot(driver, "Kadas");
			driver.findElement(By.xpath("//img[@alt='The Arjun Kada For Him']")).click();
			ss.takescreenshot(driver, " Arjun kada");
			driver.findElement(By.xpath("//input[@id='buy-now']")).click();
			ss.takescreenshot(driver, "Error for not selecting size");

	}

	}


	}


