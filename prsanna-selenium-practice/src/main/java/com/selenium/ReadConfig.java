package com.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfig {
@Test
public void demo() throws IOException {
	Properties con=new Properties();
	FileInputStream fis=new FileInputStream("./Readconfig.properties");
	con.load(fis);
	String name=con.getProperty("browser");
	System.out.println(name);
}
}
