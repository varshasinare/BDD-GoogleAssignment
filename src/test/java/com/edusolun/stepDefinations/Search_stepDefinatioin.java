package com.edusolun.stepDefinations;

import com.edusolun.base.CommonMethods;
import com.edusolun.pom.SearchKeyWord;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_stepDefinatioin extends CommonMethods {
	
	SearchKeyWord searchKeyWord=new SearchKeyWord();
	@When("user enters {string}")
	public void user_enters(String string) {
		searchKeyWord.EnterKeyword(string);
	}

	@Then("Search options are displayed")
	public void search_options_are_displayed() {
		
	    
	}


}
