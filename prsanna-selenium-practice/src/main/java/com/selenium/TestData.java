package com.selenium;

import org.testng.annotations.Test;

public class TestData {
	@Test(dataProviderClass=ReadDataXmlDataProvider.class,dataProvider="CreateUser")
	public void test(String user,String pass) {
		System.out.println(user);
		System.out.println(pass);
	}
	

}
