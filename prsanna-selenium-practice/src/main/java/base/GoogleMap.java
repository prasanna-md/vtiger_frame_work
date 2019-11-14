package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleMap {
	@Test
	public void search() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("google maps",Keys.ENTER);
		driver.findElement(By.xpath("//cite[text()='https://maps.google.com']")).click();
		driver.findElement(By.xpath("//div[@jstcache='574']")).click();
		driver.findElement(By.id("searchboxinput")).sendKeys("BTM",Keys.ENTER);
		driver.findElement(By.xpath("//button[@data-value='Directions']")).click();
	}

}
