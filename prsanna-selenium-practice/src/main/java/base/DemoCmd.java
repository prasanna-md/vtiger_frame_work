package base;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DemoCmd {
@Test
public void testA() throws IOException{
	URL node1= new URL("http://192.168.43.221:4445/wd/hub");
	DesiredCapabilities browser = new DesiredCapabilities();
	browser.setBrowserName("chrome");
	WebDriver driver= new RemoteWebDriver(node1, browser);
	driver.get("https://www.google.com");
  } 
}
//http://192.168.43.221:4445/wd/hub