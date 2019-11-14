package com.selenium;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookReadData {
	
		public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
			System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
			FileInputStream fis = new FileInputStream("Excel file path");
			Workbook w = WorkbookFactory.create(fis);
			Sheet sh = w.getSheet("Sheet1");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys(sh.getRow(1).getCell(0).toString());
			System.out.println(sh.getRow(1).getCell(0).toString());
			
		}
	}

