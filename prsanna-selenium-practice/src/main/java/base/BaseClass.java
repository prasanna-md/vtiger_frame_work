package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		username.sendKeys("9739837392");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Prasanna@123");
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		login.click();
		//WebElement search=driver.findElement(By.xpath("//input[contains(@title,'Search')]"));
		//Thread.sleep(3000);
		//search.click();
		//search.sendKeys("mi k20 pro");
		WebElement myaccount=driver.findElement(By.xpath("//div[text()='My Account']"));
		myaccount.click();
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
		driver.quit();
		
	}
	
}
