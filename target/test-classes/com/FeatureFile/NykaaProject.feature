Feature: we can orderToBuy a product by using the nykaa ecommerce web application
@loginPage

Scenario: user login the account by using the login module

Given user launch the application
When user click the signIn button
And user click the signIn with email/mobileNumber
Then navigate to login/register page

Scenario: user registering the account by using the register module

When user enter the emailId in the email/mobileNumber field
And user click the proceed button 
Then navigate to account registor page

When user enter the name into name field
And user enter the phone number into phone number field
Then user click the register button and navigate to login page 

When user enter the otp value in the otp field
Then user click the verify button and verification is successfull navigate to nykaa home page

@productSearch
Scenario: user search for the wanted product

When user move the mouse into natural element and the dropdown lists are showen
And user choose to click the hairMasks 
Then user navigate to hairMasks products listed page to see the all products

When user scrollIntoView the specified product of MCaffeine Anti Dandruff Coffee Scalp Scrub
And user click the needed product of MCaffeine Anti Dandruff Coffee Scalp Scrub
Then user navigate to MCaffeine Anti Dandruff Coffee Scalp Scrub 

@addToCartPage
Scenario: user add to cart the product

When user click the addToCart button to add the wanted product to cart feild
And user click the cart to see the user selected product
And user see a cart frame listed product and also offers
And user applying the given coupon reward 
#Then user click the proceed button and navigate to choose address page

@addressPage
Scenario: user fill the address for product delivering

When user click the add new address then they shows the address gathering fields
And user click the house/Flat/Office No field and entering a doorNo
And user click the roadName/area/colony field and entering a areaAddress
And user click the Use as default address button to make a address to default noums
And user click the pincode field and entering the pincode
And user click the name field and entering the name
And user click the phone field and entering the phoneNo
And user click the emaildId field and entering the emailId
Then user click the shipToThisAddress and navigate to choose payment method page

@paymentPage
Scenario: user select the way of payment for the product

When user choose to click the cash on delivery option
And user unable to see the place order button 
And user scrollUp the payment page to see the place order button
And user wants to click the place order button
Then user successfully placed the order confirmed   