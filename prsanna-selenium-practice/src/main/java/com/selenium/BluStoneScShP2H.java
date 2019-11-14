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

public class BluStoneScShP2H {
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
	BluStoneScShP2H ss=new BluStoneScShP2H();
	driver.get("https://www.bluestone.com");
	ss.takescreenshot(driver, " BlueStone");
	List<WebElement> menu=driver.findElements(By.xpath("//nav[@class='wh-navbar']/ul/li[@class='menuparent repb'][1]"));
	//List<WebElement> menu=driver.findElements(By.xpath("//nav[@class='wh-navbar']/ul/li"));
	ss.takescreenshot(driver, "Rings");

	Actions a=new Actions(driver);
	for(WebElement name:menu)
	{
		
		a.moveToElement(name).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='two-col']/li/a[@title='Diamond Rings']")).click();
		ss.takescreenshot(driver, " Diamond rings");
		driver.findElement(By.xpath("//section[@class='block sort-by pull-right']")).click();
		ss.takescreenshot(driver, "price");
		List<WebElement> deprice=driver.findElements(By.xpath("//span[@class='b-price-wrapper']"));
		ss.takescreenshot(driver, "price");
		for(WebElement amount1:deprice)
		{
			System.out.println(amount1.getText());
		}
		System.out.println("Price after sorting low to high");
		driver.findElement(By.xpath("//a[text()='Price Low to High ']")).click();
		ss.takescreenshot(driver, "price to low to high");
     	List<WebElement> price=driver.findElements(By.xpath("//span[@class='p-wrap']"));
     	ss.takescreenshot(driver, "Prices");
    	for(WebElement amount:price)
    	{
		System.out.println(amount.getText());
    	}

}

}
}
