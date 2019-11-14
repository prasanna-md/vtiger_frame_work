package com.selenium;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Listeners(ListsDemo.class)
public class AssertList {
	@Test
public void test() {
	
	ArrayList ls=new ArrayList();
	ls.add(10);
	ls.add(20);
	ls.add(30);
	ls.add(40);
	System.out.println(ls);
	ArrayList ls1=new ArrayList();
	ls1.add(10);
	ls1.add(20);
	ls1.add(30);
	ls1.add(400);
	System.out.println(ls1);
	Assert.assertEquals(ls, ls1);
//	SoftAssert sa= new SoftAssert();
	
	//sa.assertAll();
	
	}

}
