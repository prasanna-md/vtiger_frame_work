package com.frameworks.testpom;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.frameworks.pom.EnterTimeTrack;
import com.frameworks.pom.LoginPage;
import com.generics.BaseTest;
import com.generics.Excel;

public class Login extends BaseTest {
	@Test
	public static void validLogin() throws EncryptedDocumentException, InvalidFormatException
	{
	String username= Excel.getData(XL_PATH,SHEET_NAME,1,0);
	String password = Excel.getData(XL_PATH,SHEET_NAME,1,1);
	String title= Excel.getData(XL_PATH,SHEET_NAME,1,2);
	System.out.println(username+" "+password+" "+title);
	LoginPage l = new LoginPage(driver);
	l.username(username);
	l.password(password);
	l.loginClick();
	 
	EnterTimeTrack ett = new EnterTimeTrack(driver);
	ett.verifyHomePageIsDisplayed(driver, 5, title);
	
	
	}


}
