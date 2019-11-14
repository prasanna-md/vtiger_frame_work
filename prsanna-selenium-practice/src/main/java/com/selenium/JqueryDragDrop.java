package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryDragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame=driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frame);
		WebElement drag=driver.findElement(By.id("draggable"));
		Actions a=new Actions(driver);
		//WebElement to=driver.findElement(By.id("droppable"));
		a.dragAndDropBy(drag,100,0).perform();
		a.doubleClick(drag).perform();
		boolean b =driver.findElement(By.id("droppable")).isDisplayed();
		if (b)
		{
			System.out.println("Dropped");
		}
		else
		{
			System.out.println("its Not Dropped");
		}

	}

}
