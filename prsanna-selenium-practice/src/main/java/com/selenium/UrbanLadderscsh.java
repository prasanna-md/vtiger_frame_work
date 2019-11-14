package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class UrbanLadderscsh {
	public void takeScreenShot(WebDriver driver, String name) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File sc=ts.getScreenshotAs(OutputType.FILE);
		File ff=new File("C:\\Users\\Pinki\\eclipse-workspace\\prsanna-selenium-practice\\TakesScreenshot\\"+ name +".png");
		Files.copy(sc, ff);
		
		
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com");
		UrbanLadderscsh ss=new UrbanLadderscsh();
		Thread.sleep(10000);
		ss.takeScreenShot(driver, "Home page");
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		ss.takeScreenShot(driver, "abcd");
		List<WebElement> menu=driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul/li"));
		Actions a=new Actions(driver);
		for(WebElement name:menu)
		{
			String menuName=name.getText();
			System.err.println(menuName);
			a.moveToElement(name).build().perform();
			ss.takeScreenShot(driver, menuName);
			Thread.sleep(1000);
			ss.takeScreenShot(driver, "Main menu");
			List<WebElement> submenu=driver.findElements(By.xpath("//span[contains(.,'" + menuName + "')]/parent::li/descendant::ul[@class='taxonslist']/li"));	
			for(WebElement item : submenu)
			{
				System.out.println(item.getText());
			}
		}

	}

}
