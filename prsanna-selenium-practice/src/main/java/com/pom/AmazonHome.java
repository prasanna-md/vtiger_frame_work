package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHome {
	@FindBy(id="twotabsearchtextbox")
	private WebElement search;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement go;
	@FindBy(xpath="//a[@aria-label='Amazon']")
	private WebElement link;
	@FindBy(xpath="//img[@title='Apple iPhone XR (64GB) - Black']")
	private WebElement phoneclick;
	@FindBy(id="add-to-cart-button")
	private WebElement addcart;
	@FindBy(xpath="//img[@alt='OnePlus 7T Pro (Haze Blue, 8GB RAM, Fluid AMOLED Display, 256GB Storage, 4085mAH Battery)']")
	private WebElement oneplus;
	public AmazonHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void sendText(String text) {
		search.sendKeys(text);
		
	}
    public void goClick() {
    	go.click();
    }
    public void phoneClick() {
    	phoneclick.click();
    }
    public void addCart() {
    	addcart.click();
    }
    public void clickLink() {
    	link.click();
    }
    public void clearText() {
    	search.clear();
    }
   public void phClick() {
	   oneplus.click();
   }

}
