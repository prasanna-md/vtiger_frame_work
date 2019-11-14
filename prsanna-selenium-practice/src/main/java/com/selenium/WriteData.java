package com.selenium;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WriteData {
							
			public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
				System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");

				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.urbanladder.com/");
				Thread.sleep(10000);
				
				driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
				List<WebElement> menu = driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li"));
				Actions a=new Actions(driver);
				int row = 0 ;
				for(WebElement name:menu) {
					System.out.println(name.getText());
					a.moveToElement(name).build().perform();
			    	storeValue("Sheet1",row ,0,name.getText());
					row++;
				
				}
				
			}
				public static void storeValue(String Sheet,int row, int col,String data) {
				try {
				FileInputStream fis = new FileInputStream("Path of the excel file");
				Workbook wb =WorkbookFactory.create(fis);
				wb.getSheet(Sheet).createRow(row).createCell(col).setCellValue(data);
				FileOutputStream fos=new FileOutputStream("Data file to read (excel file)");
				wb.write(fos);
				wb.close();
				}
				catch(Exception e) {
					System.out.println("File Not Found");
					e.printStackTrace();
				}
				}

	}


