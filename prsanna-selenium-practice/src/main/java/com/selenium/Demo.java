package com.selenium;

import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> wins = driver.getWindowHandles();
		wins.remove(parent);
//		for (String win : wins) {
//			System.out.println(win);
//			driver.switchTo().window(win).close();
//		}

		ArrayList<String> al = new ArrayList(wins);
		for (int i = al.size()-1; i>=0; i--)
		{
			System.out.println(al);
			driver.switchTo().window(al.get(i)).close();
		}
	}

}
