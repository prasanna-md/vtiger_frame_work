package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Html {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Pinki/Desktop/Prasanna.html");
		WebElement day = driver.findElement(By.id("b"));
		Select s=new Select(day);
		List<WebElement> num=s.getOptions();
		if(s.isMultiple())
		{
			for(WebElement nums:num)
			{
				s.selectByValue(nums.getText());
				System.out.println(nums.getText());
				//System.out.println(s.getAllSelectedOptions());
			}
		}
		List<WebElement> opt=s.getAllSelectedOptions();
		for(WebElement options:opt)
		{
			System.out.println(options.getText());
		}
		System.out.println(s.getFirstSelectedOption().getText());
		s.deselectAll();
				
        driver.close();
	}

}
