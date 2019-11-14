package base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ebay {
	@Test
	public void openApp() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://in.ebay.com");
		driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("apple watch",Keys.ENTER);
	   List<WebElement> names = driver.findElements(By.xpath("//h3[@class='s-item__title']"));
	  int count=0;
	   for(WebElement name:names) {
	    	System.out.println(name.getText());
	    }
	    for(WebElement name1:names) {
	    	if(count==10)
	    	name1.click();
	    	break;
	    	
	    }
	    count++;
	   // driver.findElement(By.xpath("//h3[text()='Apple Watch Gen 4 Series 4 44mm Space Gray Aluminum, Black Sport Band 4G LTE+GPS'][1]")).click();
	    System.out.println("*********");
	}
	

}
