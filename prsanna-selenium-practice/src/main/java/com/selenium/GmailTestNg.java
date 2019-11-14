package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GmailTestNg {

@Test
public void testGmail() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.gmail.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("identifierId")).sendKeys("kiran10kittu@gmail.com");
	driver.findElement(By.id("identifierNext")).click();
	//Thread.sleep(2000);
 	driver.findElement(By.name("password")).sendKeys("Kittu@1020");
 	driver.findElement(By.id("passwordNext")).click();
 	List<WebElement> menu=driver.findElements(By.xpath("//span[@class='yP']"));
 	for(WebElement name:menu) {
// 		String subjects=name.getText();
// 		Thread.sleep(2000);
// 		Reporter.log(subjects,true);
 		System.out.println(name.getText());
 	}
	

}

}
