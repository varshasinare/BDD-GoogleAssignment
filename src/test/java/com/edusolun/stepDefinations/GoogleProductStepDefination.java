package com.edusolun.stepDefinations;

import com.edusolun.base.CommonMethods;
import com.edusolun.pom.GoogleProduct;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleProductStepDefination  extends CommonMethods{
	
	GoogleProduct googleProduct=new GoogleProduct();
	@When("user navigate to {string} link")
	public void user_navigate_to_link(String string) {
	    driver.navigate().to(string);
	}

	@Then("Verify Google apps\\/products on Google products webpage")
	public void verify_google_apps_products_on_google_products_webpage() {
		googleProduct.googleProductVerify();
	    
	}


}
