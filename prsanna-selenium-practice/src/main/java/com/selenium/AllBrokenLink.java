package com.selenium;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllBrokenLink {
	@Test
	public void test() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Pinki/Desktop/PMD01.html");
		 List<WebElement> link = driver.findElements(By.xpath("//body/div"));
		for(WebElement link2:link) {
		String link1 = link2.getAttribute("href");
		URL u = new URL(link1);
		System.out.println(link1);
		HttpsURLConnection con = (HttpsURLConnection)u.openConnection();
		int rescode = con.getResponseCode();
		if (rescode == 200) {
			System.out.println(rescode);
			System.out.println("Link is not broken");
			System.out.println(con.getResponseCode());
		} else {
			System.out.println(rescode);
			System.out.println("Link s not broken");
			System.out.println(con.getResponseCode());
		}
		}
	}

}
