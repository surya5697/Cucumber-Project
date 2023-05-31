package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//button[@class=\"css-aesrxy\"]")
	private WebElement cart;
	
	@FindBy(xpath="//div[@data-test-id=\"reward_points\"]")
	private WebElement coupon;
	
	@FindBy(xpath="//div[@class=\"css-15vhhhd e25lf6d4\"]")
	private WebElement proceed;
	
	public WebElement getCart() {
		return cart;
	}
	public WebElement getCoupon() {
		return coupon;
	}
	public WebElement getProceed() {
		return proceed;
	}
	
	public AddToCart(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
		
	}

}
