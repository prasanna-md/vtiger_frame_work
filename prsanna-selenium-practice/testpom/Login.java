package com.frameworks.testpom;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.frameworks.pom.EnterTimeTrack;
import com.frameworks.pom.LoginPage;
import com.generics.BaseTest;
import com.generics.Excel;

public class Login extends BaseTest {
	@Test
	public static void validLogin() throws EncryptedDocumentException
	{
	String username= Excel.getData(XL_PATH,SHEET_NAME,2,0);
	String password = Excel.getData(XL_PATH,SHEET_NAME,2,1);
	String title= Excel.getData(XL_PATH,SHEET_NAME,2,2);
	Excel.storeValue(XL_PATH,SHEET_NAME, 0, 3, "Status");
	
	LoginPage l = new LoginPage(driver);
	l.username(username);
	l.password(password);
	l.loginClick();
	
	EnterTimeTrack eTT = new EnterTimeTrack(driver);
	eTT.verifyHomePageIsDisplayed(driver, 5, title);
	
	
	}


}
