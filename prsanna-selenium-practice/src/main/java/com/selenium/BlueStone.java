package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		driver.findElement(By.xpath("//input[@placeholder='Search for Jewellery']")).sendKeys("Rings",Keys.ENTER);
		driver.findElement(By.xpath("//ul[@id='product_list_ui']/li[@data-position='1']/descendant::img[@class='hc img-responsive center-block']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\"size-box-overlay\"]")).click();
		driver.findElement(By.xpath("//li[@data-key=\"20\"]/span[@class=\"delivery\"]")).click();
		driver.findElement(By.xpath("//div[@class='buynow-block col-xs"));

	}

}
