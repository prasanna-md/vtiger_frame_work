package com.selenium;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListsDemo.class)
public class DemoList {
	@Test
	public void test1() {
		System.out.println("PMD");
	}
	@Test
	public void test2() {
		System.out.println("PMD");
		Assert.fail();
	}

}
