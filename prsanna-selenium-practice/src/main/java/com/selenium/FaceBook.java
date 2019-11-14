package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Thread.sleep(1000);
		Select s=new Select(day);
		s.selectByIndex(10);
		WebElement month=driver.findElement(By.xpath("//select[@title='Month']"));
		Thread.sleep(1000);
		Select m=new Select(month);
		m.selectByIndex(10);
		WebElement year=driver.findElement(By.xpath("//select[@title='Year']"));
		Thread.sleep(1000);
		Select y=new Select(year);
		y.selectByIndex(11);
     	List<WebElement> d1 = driver.findElements(By.xpath("//select[@title='Day']/option"));
//		for(WebElement days:d1)
//		{
//		System.out.println(days.getText());
//		}
		List<WebElement> days=s.getOptions();
		for(WebElement day1:d1)
		{
			System.out.println(day1.getText());
		}
		

	}

}
