package com.selenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DataProvider {
	@org.testng.annotations.DataProvider()
	public String[][]getData(){
		String[][] data=new String [3][2];
		data[0][0]= "user A";
		data[0][1]= "A1";
		
		data[1][0]= "user B";
		data[1][1]= "B1";
		
		data[2][0]= "user C";
		data[2][1]= "C1";
		
		return data;
		
	}
	
	@Test(dataProvider="getData")
	public void createUser(String un,String pw) {
		Reporter.log("create:" +un+ " pw:" + pw,true);
	}

}
