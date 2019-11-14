package com.generics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScreenShot {
	public static void getScreenShot(WebDriver driver, String name) throws IOException
	{
	TakesScreenshot ts = (TakesScreenshot)driver;
    File imgFrom= ts.getScreenshotAs(OutputType.FILE);
    File imgTo = new File("./ScreenShot/"+name+".png");
	Files.copy(imgFrom, imgTo);

	}

}
