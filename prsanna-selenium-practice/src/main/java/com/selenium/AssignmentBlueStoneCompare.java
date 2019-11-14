package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListsDemo.class)
public class AssignmentBlueStoneCompare {
	WebDriver driver=new ChromeDriver();
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BluStonScShKadas ss=new BluStonScShKadas();
		driver.get("https://www.bluestone.com");

		
	}
@Test
	public void test1() throws InterruptedException {
		
		
		//List<WebElement> menu=driver.findElements(By.xpath("//nav[@class='wh-navbar']/ul/li/a[@title='Jewellery']"));
	List<WebElement> menu=driver.findElements(By.xpath("//nav[@class='wh-navbar']/ul/li/a[@title='Jewellery']"));
	Actions a=new Actions(driver);
	for(WebElement name:menu)
	{
		
		a.moveToElement(name).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-p=\"mens-jewellery-kadas,m\"]")).click();
	
		driver.findElement(By.xpath("//img[@alt='The Arjun Kada For Him']")).click();
		String name1=driver.findElement(By.xpath("//span[@class='size-box-overlay']")).getText();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//li[@data-key='06']")).click();
		
        driver.findElement(By.xpath("//input[@id='buy-now']")).click();
        Reporter.log(name1,true);
        
    	
		
		
}

}


}
