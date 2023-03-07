package com.edusolun.stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.edusolun.base.CommonMethods;
import com.edusolun.pom.GoogleAppLogin;
import com.edusolun.utils.PropertyReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleAppLogin_StepDefin extends CommonMethods {
	GoogleAppLogin appLogin=new GoogleAppLogin();
	
	@When("user enters  active EmailID {string} and Password {string}")
	public void user_enters_active_email_id_and_password(String string, String string2) {
		appLogin.account_login(string,string2);
	}

	@Then("user should navigate to Apps homepage")
	public void user_should_navigate_to_apps_homepage() {
		appLogin.checkAppPage();
		 
	}
	
	
}
