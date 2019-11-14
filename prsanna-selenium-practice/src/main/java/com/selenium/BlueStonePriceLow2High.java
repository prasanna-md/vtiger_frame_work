package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStonePriceLow2High {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		List<WebElement> menu=driver.findElements(By.xpath("//nav[@class='wh-navbar']/ul/li[@class='menuparent repb'][1]"));
		//List<WebElement> menu=driver.findElements(By.xpath("//nav[@class='wh-navbar']/ul/li"));

		Actions a=new Actions(driver);
		for(WebElement name:menu)
		{
			
			a.moveToElement(name).build().perform();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//ul[@class='two-col']/li/a[@title='Diamond Rings']")).click();
			driver.findElement(By.xpath("//section[@class='block sort-by pull-right']")).click();
			List<WebElement> deprice=driver.findElements(By.xpath("//span[@class='b-price-wrapper']"));
			for(WebElement amount1:deprice)
			{
				System.out.println(amount1.getText());
			}
			System.out.println("Price after sorting low to high");
			driver.findElement(By.xpath("//a[text()='Price Low to High ']")).click();
	     	List<WebElement> price=driver.findElements(By.xpath("//span[@class='p-wrap']"));
	    	for(WebElement amount:price)
	    	{
			System.out.println(amount.getText());
	    	}

}
	
	
	}
}
