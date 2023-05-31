package com.stepDefiniton;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.BaseClassMethods.AllMethods;
import com.configuration.Configureader;
import com.cucumberRunner.Runner;
import com.fileReadermanager.FileReaderManager;
import com.pageObjectManager.PomManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NykaaStepDefinition extends AllMethods{

	public static WebDriver driver=Runner.driver;
    
	//Nykaa_Project np = new Nykaa_Project( driver);
	PomManager pom = new PomManager(driver); 
	
	@Given("user launch the application")
	public void user_launch_the_application() throws IOException {
		get(FileReaderManager.getFileReader().getConfigureader().getUrl());
			
	}
	@When("user click the signIn button")
	public void user_click_the_sign_in_button() {
		clickAction(pom.getNykaaLogin().getSignIn());

	}

	@When("user click the signIn with email\\/mobileNumber")
	public void user_click_the_sign_in_with_email_mobile_number() {
		clickAction(pom.getNykaaLogin().getSignInOption());
	}
	
	@Then("navigate to login\\/register page")
	public void navigate_to_login_register_page() {
		System.out.println("navigate to login/register page");

	}

	@When("user enter the emailId in the email\\/mobileNumber field")
	public void user_enter_the_email_id_in_the_email_mobile_number_field() throws IOException {
		
		sendKeys(pom.getNykaaLogin().getSignInEmailId(),FileReaderManager.getFileReader().getConfigureader().getEmail());

	}
	@When("user click the proceed button")
	public void user_click_the_proceed_button() {
		click(pom.getNykaaLogin().getSubmitVerification());


	}
	@Then("navigate to account registor page")
	public void navigate_to_account_registor_page() {
		System.out.println("navigate to account registor page");

	}
	@When("user enter the name into name field")
	public void user_enter_the_name_into_name_field() throws IOException {
		
		sendKeys(pom.getNykaaLogin().getUserName(),FileReaderManager.getFileReader().getConfigureader().getUserName());


	}

	@When("user enter the phone number into phone number field")
	public void user_enter_the_phone_number_into_phone_number_field() throws IOException {
		
		sendKeys(pom.getNykaaLogin().getPhoneNumber(),FileReaderManager.getFileReader().getConfigureader().getPhone());

	}
	@Then("user click the register button and navigate to login page")
	public void user_click_the_register_button_and_navigate_to_login_page() {
		clickAction(pom.getNykaaLogin().getRegister());


	}
	@When("user enter the otp value in the otp field")
	public void user_enter_the_otp_value_in_the_otp_field() {
		otp(pom.getNykaaLogin().getOtpField());

	}
	@Then("user click the verify button and verification is successfull navigate to nykaa home page")
	public void user_click_the_verify_button_and_verification_is_successfull_navigate_to_nykaa_home_page() {
		clickAction(pom.getNykaaLogin().getVerify());

	}

	@When("user move the mouse into natural element and the dropdown lists are showen")
	public void user_move_the_mouse_into_natural_element_and_the_dropdown_lists_are_showen() {
		System.out.println("user successfully login navigate to home page");
		moveToElement(pom.getProductSearch().getNatural());

	}

	@When("user choose to click the hairMasks")
	public void user_choose_to_click_the_hair_masks() {
		clickAction(pom.getProductSearch().getHairMasks());
		getWindowHandles(1);

	}

	@Then("user navigate to hairMasks products listed page to see the all products")
	public void user_navigate_to_hair_masks_products_listed_page_to_see_the_all_products() {
		System.out.println("user navigate to hairMasks products listed page");

	}
	
	@When("^user scrollIntoView the specified product of MCaffeine Anti Dandruff Coffee Scalp Scrub$")
	public void user_scrollIntoView_the_specified_product_of_MCaffeine_Anti_Dandruff_Coffee_Scalp_Scrub() throws Throwable {
		scrollIntoView(pom.getProductSearch().getMCaffeine());

	}

	@When("^user click the needed product of MCaffeine Anti Dandruff Coffee Scalp Scrub$")
	public void user_click_the_needed_product_of_MCaffeine_Anti_Dandruff_Coffee_Scalp_Scrub() throws Throwable {
		clickAction(pom.getProductSearch().getMCaffeine());
		getWindowHandles(2);
	}

	@Then("^user navigate to MCaffeine Anti Dandruff Coffee Scalp Scrub$")
	public void user_navigate_to_MCaffeine_Anti_Dandruff_Coffee_Scalp_Scrub() throws Throwable {
		System.out.println("user navigate to MCaffeine Anti Dandruf");
	}


	@When("user click the addToCart button to add the wanted product to cart feild")
	public void user_click_the_add_to_cart_button_to_add_the_wanted_product_to_cart_feild() {
		clickAction(pom.getProductSearch().getAddToCart());

	}
	@When("user click the cart to see the user selected product")
	public void user_click_the_cart_to_see_the_user_selected_product() throws IOException {
		clickAction(pom.getAddToCart().getCart());

	}
	@When("user see a cart frame listed product and also offers")
	public void user_see_a_cart_frame_listed_product_and_also_offers() {
		frameByIndex(0);

	}
	@When("user applying the given coupon reward")
	public void user_applying_the_given_coupon_reward() throws IOException {
		clickAction(pom.getAddToCart().getCoupon());
		screenshot("addToCartNykaa");
		isSelected(pom.getAddToCart().getProceed());
		explicitlyWait(10, "clickable", pom.getAddToCart().getProceed());
		moveToElement(pom.getAddToCart().getProceed());
		clickAction(pom.getAddToCart().getProceed());
	
	}
	
	@Then("^user click the proceed button and navigate to choose address page$")
	public void user_click_the_proceed_button_and_navigate_to_choose_address_page() throws Throwable {
		

	}


	@When("user click the add new address then they shows the address gathering fields")
	public void user_click_the_add_new_address_then_they_shows_the_address_gathering_fields() throws IOException, InterruptedException {
		ThreadSleep(3000);
		click(pom.getAdds().getAddNewAddress());
	}
	@When("user click the house\\/Flat\\/Office No field and entering a doorNo")
	public void user_click_the_house_flat_office_no_field_and_entering_a_door_no() {
		clickAction(pom.getAdds().getHouseNo());
		sendKeys(pom.getAdds().getHouseNo(),"10");

	}
	@When("user click the roadName\\/area\\/colony field and entering a areaAddress")
	public void user_click_the_road_name_area_colony_field_and_entering_a_area_address() {
		clickAction(pom.getAdds().getArea());
		sendKeys(pom.getAdds().getArea(),"new colony karur");

	}
	
	@When("user click the pincode field and entering the pincode")
	public void user_click_the_pincode_field_and_entering_the_pincode() {
		clickAction(pom.getAdds().getPincode());
		sendKeys(pom.getAdds().getPincode(),"639001");

	}
	@When("user click the Use as default address button to make a address to default noums")
	public void user_click_the_use_as_default_address_button_to_make_a_address_to_default_noums() {
		clickAction(pom.getAdds().getUseDefault());

	}
	
	@When("user click the name field and entering the name")
	public void user_click_the_name_field_and_entering_the_name() throws InterruptedException {
		clickAction(pom.getAdds().getName());
		sendKeys(pom.getAdds().getName(),"surya");
	}
	
	@When("user click the phone field and entering the phoneNo")
	public void user_click_the_phone_field_and_entering_the_phone_no() {
		clickAction(pom.getAdds().getPhone());
		sendKeys(pom.getAdds().getPhone(),"9786554677");

	}
	@When("user click the emaildId field and entering the emailId")
	public void user_click_the_emaild_id_field_and_entering_the_email_id() throws IOException {
		clickAction(pom.getAdds().getEmail());
		sendKeys(pom.getAdds().getEmail(),"surya@23445gmail.com");
		screenshot("shipToAddressNykaa");

	}
	@Then("user click the shipToThisAddress and navigate to choose payment method page")
	public void user_click_the_ship_to_this_address_and_navigate_to_choose_payment_method_page(){
		clickAction(pom.getAdds().getName());
		sendKeys(pom.getAdds().getName(),"surya");
		moveToElement(pom.getAdds().getShipAddress());
		clickAction(pom.getAdds().getShipAddress());
		

	}
	
	@When("user choose to click the cash on delivery option")
	public void user_choose_to_click_the_cash_on_delivery_option() {
		isSelected(pom.getPayment().getCashOnDelivery());
		explicitlyWait(10, "clickable", pom.getPayment().getCashOnDelivery());
		click(pom.getPayment().getCashOnDelivery());

	}
	@When("user unable to see the place order button")
	public void user_unable_to_see_the_place_order_button() {
		System.out.println("scrollUp the page");

	}
	@When("user scrollUp the payment page to see the place order button")
	public void user_scroll_up_the_payment_page_to_see_the_place_order_button() {
		scrollUp("-500");

	}
	@When("user wants to click the place order button")
	public void user_wants_to_click_the_place_order_button() {
		//clickAction(pom.getPayment().getPlaceOrder());
		System.out.println("placeOrder");

	}
	@Then("user successfully placed the order confirmed")
	public void user_successfully_placed_the_order_confirmed() throws IOException {
		System.out.println("order confirmed");
		screenshot("orderPlacedNykaa");

	}









}
