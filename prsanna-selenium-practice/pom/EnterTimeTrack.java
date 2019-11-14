
package com.frameworks.pom;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.generics.Excel;
import com.generics.IAutoConst;
import com.generics.ScreenShot;

public class EnterTimeTrack implements IAutoConst {

		public EnterTimeTrack(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public  void verifyHomePageIsDisplayed(WebDriver driver,long ETO,String title) throws EncryptedDocumentException
		{	
			try 
			{
				WebDriverWait ww = new WebDriverWait(driver, ETO);
				ww.until(ExpectedConditions.titleContains(title));
				Reporter.log("HomePage is Displayed",true);
				//Excel.setStatus(XL_PATH, SHEET_NAME, 2, 3, "Pass");
			}
			catch(Exception e)
			{
				Reporter.log("Home Page is not displayed",true);
				try {
					ScreenShot.getScreenShot(driver, title);
					//Excel.setStatus(XL_PATH, SHEET_NAME, 2, 3, "Fail");
				
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				Assert.fail();
			}
		}




}
