package base;
import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
		    public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='aajZCb']/descendant::li[4]")).click();
			
		}
	}


