package com.edusolun.stepDefinations;

import com.edusolun.base.CommonMethods;
import com.edusolun.pom.Gmail;
import com.edusolun.pom.GmailFeatures;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GmailStepDefination extends CommonMethods{
	
	Gmail gmail=new Gmail();
	GmailFeatures gmailFeatures=new GmailFeatures();
	@Given("user navigate to {string}")
	public void user_navigate_to(String string) {
	    driver.navigate().to(string);
	}

	@When("user enters valid {string} and {string}")
	public void user_enters_valid_and(String string, String string2) {
		gmail.gmailLogin(string,string2);
	}

	@Then("user should able to login to gmail and Verify the objects")
	public void user_should_able_to_login_to_gmail_and_verify_the_objects() {
	  gmail.gmailVerify();
	}
	
	@Given("User is on Gmail Page")
	public void user_is_on_gmail_page() {
		
	}

	@When("user click on total no. Emails")
	public void user_click_on_total_no_emails() {
		gmailFeatures.totalMail();
	}

	@Then("Total no of Emails should be displayed")
	public void total_no_of_emails_should_be_displayed() {
		
	}
	@When("user click on Starred Emails")
	public void user_click_on_starred_emails() {
		gmailFeatures.getStarredEmail();
	}
	
	@When("user click on Unread Emails")
	public void user_click_on_unread_emails() {
		gmailFeatures.getUnReadEmails();
	}

	@Then("Total no of Unread Emails should be displayed")
	public void total_no_of_unread_emails_should_be_displayed() {
	   
	}
	@When("user click on Read Emails")
	public void user_click_on_read_emails() {
		gmailFeatures.getReadEmails();
	}

	@Then("Total no of Read Emails should be displayed")
	public void total_no_of_read_emails_should_be_displayed() {
	   
	}
	@When("user click on Compose")
	public void user_click_on_compose() {
		gmailFeatures.composeMail();
	}

	@Then("Compose window should open")
	public void compose_window_should_open() {
	    
	}
	@When("user click on Compose and Enter {string} {string} {string}")
	public void user_click_on_compose_and_enter(String string, String string2, String string3) {
		gmailFeatures.sendMail(string,string2,string3);
	}

	@Then("After sending an email, verify that it exists in Sent emails")
	public void after_sending_an_email_verify_that_it_exists_in_sent_emails() {
		gmailFeatures.sentMail();
	}
	@When("user click search box and enter Email that need to search")
	public void user_click_search_box_and_enter_email_that_need_to_search() {
		gmailFeatures.checkReceivedMail();
	}

	@Then("user can se all mails received fron that EmailID")
	public void user_can_se_all_mails_received_fron_that_email_id() {
	    
	}
	@When("user click search box and enter Email with Attachments")
	public void user_click_search_box_and_enter_email_with_attachments() {
		gmailFeatures.checkAttachment();
	}

	@Then("user can see all Emails with attachments")
	public void user_can_see_all_emails_with_attachments() {
	    
	}
	@When("user click on Setting")
	public void user_click_on_setting() {
		gmailFeatures.checkSettings();
	}

	@Then("user should navigate to Setting Page and validate")
	public void user_should_navigate_to_setting_page_and_validate() {
	   
	}
	@When("user click on Create New label")
	public void user_click_on_create_new_label() {
		gmailFeatures.createNewLable();
	}

	@Then("user can see new Label created")
	public void user_can_see_new_label_created() {
	    
	}
	@When("user select Email and Click on MoveTo folder")
	public void user_select_email_and_click_on_move_to_folder() {
		gmailFeatures.moveToLable();
	}

	@Then("user can see Emails are moved to selected folder")
	public void user_can_see_emails_are_moved_to_selected_folder() {
	    
	}
	@When("user click on Sign_out")
	public void user_click_on_sign_out() {
		gmailFeatures.logOut();
	}

	@Then("user should able to log out")
	public void user_should_able_to_log_out() {
	 
	}



}
