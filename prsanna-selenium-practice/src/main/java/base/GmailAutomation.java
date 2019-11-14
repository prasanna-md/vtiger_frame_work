package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GmailAutomation {
	WebDriver driver;
	//WebElement username;
	//WebElement password;
	@BeforeMethod
	public void brforeMethod(){
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		
		
		System.out.println("Before method");

	}
	@AfterMethod
	public void afterMethod() {
		driver.close();
		System.out.println("After method");
	}
	@Test
	public void valid() {
		driver.findElement(By.name("identifier")).sendKeys("md.prasannakumar.apk@gmail.com",Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("7632632751",Keys.ENTER);
		System.out.println("valid login");
		
	}
    @Test
    public void invalidUn() {
    	driver.findElement(By.name("identifier")).sendKeys("md.prasannakumar.apk@gmail.com",Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("7632632751",Keys.ENTER);
		Assert.fail("username is invalid");
    	
    }
    @Test
    public void invalidPw() {
    	driver.findElement(By.name("identifier")).sendKeys("md.prasannakumar.apk@gmail.com",Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("7632632",Keys.ENTER);
		Assert.fail("invalid password");
    }
    @Test
    public void invalid() {
    	driver.findElement(By.name("identifier")).sendKeys("123456",Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("7632632751",Keys.ENTER);
		Assert.fail("blank");
    }
}
