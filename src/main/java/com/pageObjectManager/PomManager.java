package com.pageObjectManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pageObjectModel.AddToCart;
import com.pageObjectModel.Address;
import com.pageObjectModel.NykaaLogin;
import com.pageObjectModel.PaymentPage;
import com.pageObjectModel.ProductSearch;


public class PomManager{
	
	public static WebDriver driver;
	// declare the class as a private
	
	private NykaaLogin nykaaLogin;
    private ProductSearch productSearch;
    private AddToCart addToCart;
    private Address adds;
    private PaymentPage payment;

	
	public NykaaLogin getNykaaLogin() {
		nykaaLogin = new NykaaLogin(driver);
		return nykaaLogin;
	}
	
	public ProductSearch getProductSearch() {
		productSearch = new ProductSearch(driver);
		return productSearch;
	}
	
	public AddToCart getAddToCart() {
		addToCart = new AddToCart(driver);
		return addToCart;
	}
	
	public Address getAdds() {
		adds = new Address(driver);
		return adds;
	}
	
	public PaymentPage getPayment() {
		payment = new PaymentPage(driver);
		return payment;
	}
	
	
	public PomManager(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}




	
}


