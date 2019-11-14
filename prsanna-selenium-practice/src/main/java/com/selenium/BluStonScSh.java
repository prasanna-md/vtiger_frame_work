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

public class BluStonScSh {
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
		BluStonScSh ss=new BluStonScSh();
		driver.get("https://www.bluestone.com");
		ss.takescreenshot(driver, "Bluestone");
		List<WebElement> menu=driver.findElements(By.xpath("//nav[@class='wh-navbar']/ul/li[@class='menuparent repb'][1]"));
		ss.takescreenshot(driver, "Rings");
		//List<WebElement> menu=driver.findElements(By.xpath("//nav[@class='wh-navbar']/ul/li"));

		Actions a=new Actions(driver);
		for(WebElement name:menu)
		{
			//String menuName=name.getText();
			//System.err.println(menuName);
			a.moveToElement(name).build().perform();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//ul[@class='two-col']/li/a[@title='Diamond Rings']")).click();
			ss.takescreenshot(driver, "Diamond");
		
	}

	}
}
