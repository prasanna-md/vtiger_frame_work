package com.frameworks.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="username")
	private WebElement username;
	@FindBy(name="pwd")
	private WebElement password;	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginBtn;	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void username(String text)
	{
		username.sendKeys(text);	
	}
	public void password(String text)
	{
		password.sendKeys(text);	
	}
	public void loginClick()
	{
		loginBtn.click();
	}
}
 


