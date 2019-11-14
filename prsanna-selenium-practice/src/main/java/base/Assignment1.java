package base;
import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment1 {
             	public static void main(String[] args) throws InterruptedException, AWTException {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com");
				driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java");
				 List<WebElement> no = driver.findElements(By.xpath("//div[@class='aajZCb']"));
				
				for(WebElement item : no)
				{
					System.out.println(item.getText());
				}
			

		}
		


	}


