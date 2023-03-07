package com.edusolun.stepDefinations;

import com.edusolun.base.CommonMethods;
import com.edusolun.pom.HomePage;
import com.edusolun.pom.LanguageSet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GHomePage_StepDefination extends CommonMethods {
	HomePage homepage=new HomePage();
	LanguageSet languageSet= new LanguageSet();
	@Given("user hit www.google.co.in")
	public void user_hit_www_google_co_in() {
		System.out.println("Started");
	    
	}

	@When("user is on google home page")
	public void user_is_on_google_home_page() {
		System.out.println("User is on Google HomePage");
	}

	@Then("Verify given Elements on homepage")
	public void verify_given_elements_on_homepage() {
		homepage.homecheck();
	}

	@When("user click on Google apps")
	public void user_click_on_google_apps() {
		homepage.appClick();
	    
	}

	@Then("All Apps should be displayed")
	public void all_apps_should_be_displayed() {
		homepage.googleAppCheck();
	    
	}
	@Then("All Apps should be displayed and HomePage of respective App should open")
	public void all_apps_should_be_displayed_and_home_page_of_respective_app_should_open() {
		homepage.accountAppVerify();
		homepage.searchAppVerify();
		homepage.mapVerify();
		homepage.youtubeVerify();
		homepage.googlePlayVerify();
		homepage.googleNewsVerify();
		homepage.googleDriveVerify();
	}

	@When("user click on setting and then search setting then select language")
	public void user_click_on_setting_and_then_search_setting_then_select_language() {
		languageSet.setSetting();
	}

	@When("Select desired language and press Save")
	public void select_desired_language_and_press_save() {
		languageSet.setLanguage();
	}

	@Then("HomePage should be displayed in resp language")
	public void home_page_should_be_displayed_in_resp_language() {
		languageSet.verifyLang();
	}
	
	
	@Then("User close browser")
	public void user_close_browser() {
		System.out.println("Closing Browser");
	 }


}
