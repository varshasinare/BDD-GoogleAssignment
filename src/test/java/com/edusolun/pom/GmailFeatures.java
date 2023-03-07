package com.edusolun.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.edusolun.base.CommonMethods;
import com.edusolun.utils.PropertyReader;

public class GmailFeatures extends CommonMethods{
	
	public void totalMail()
	{
		List<WebElement> more=driver.findElements(By.xpath(PropertyReader.getPropValue("more_xpath")));
		more.get(0).click();
		WebElement all_mails=driver.findElement(By.xpath(PropertyReader.getPropValue("all_mails_xpath")));
		all_mails.click();
		hardwait(2000);
		List<WebElement> tmails=driver.findElements(By.xpath(PropertyReader.getPropValue("tmails_xpath")));
		String emails=tmails.get(3).getText();
		System.out.println("Total no. of emails "+emails);
	}
	
	public void getStarredEmail()
	{
		List<WebElement> email_options=driver.findElements(By.xpath(PropertyReader.getPropValue("email_options_xpath")));
		email_options.get(1).click();
		hardwait(2000);
		List<WebElement> tmails=driver.findElements(By.xpath(PropertyReader.getPropValue("tmails_xpath")));
		String emails=tmails.get(3).getText();
		System.out.println("Total no. of Starred emails "+emails);
		
		
	}
	public void getUnReadEmails()
    {
		WebElement search_mail=driver.findElement(By.xpath(PropertyReader.getPropValue("search_mail_xpath")));
    	search_mail.click();
    	search_mail.sendKeys("label:unread");
    	search_mail.sendKeys(Keys.ENTER);
		hardwait(2000);
		List<WebElement> tmails=driver.findElements(By.xpath(PropertyReader.getPropValue("tmails_xpath")));
		String emails=tmails.get(3).getText();
		System.out.println("Total no. of UnRead emails "+emails);
		hardwait(2000);
    }
	public void getReadEmails()
    {
		WebElement search_mail=driver.findElement(By.xpath(PropertyReader.getPropValue("search_mail_xpath")));
    	search_mail.click();
    	search_mail.sendKeys("label:read");
    	search_mail.sendKeys(Keys.ENTER);
		hardwait(2000);
		List<WebElement> tmails=driver.findElements(By.xpath(PropertyReader.getPropValue("tmails_xpath")));
		String emails=tmails.get(3).getText();
		System.out.println("Total no. of Read emails "+emails);
		hardwait(2000);
    }
	public void composeMail()
	{
		WebElement compose=driver.findElement(By.xpath(PropertyReader.getPropValue("compose_xpath")));
		compose.click();
		hardwait(4000);
		WebElement new_msg=driver.findElement(By.xpath(PropertyReader.getPropValue("new_msg_xpath")));
		waitForDisplay(new_msg);
	}
	public void sendMail(String To_Email,String cc_Email,String bcc_Email)
	{
		WebElement compose=driver.findElement(By.xpath(PropertyReader.getPropValue("compose_xpath")));
		compose.click();
		hardwait(2000);
		WebElement to=driver.findElement(By.xpath(PropertyReader.getPropValue("to_xpath")));
		to.click();
		to.sendKeys(To_Email);
		WebElement cc_btn=driver.findElement(By.xpath(PropertyReader.getPropValue("cc_btn_xpath")));
		cc_btn.click();
		hardwait(2000);
		WebElement cc=driver.findElement(By.xpath(PropertyReader.getPropValue("cc_xpath")));
		cc.sendKeys(cc_Email);
		WebElement Bcc_btn=driver.findElement(By.xpath(PropertyReader.getPropValue("Bcc_btn_xpath")));
		Bcc_btn.click();
		hardwait(2000);
		WebElement bcc=driver.findElement(By.xpath(PropertyReader.getPropValue("bcc_xpath")));
		bcc.sendKeys(bcc_Email);
	
		WebElement subject=driver.findElement(By.xpath(PropertyReader.getPropValue("subject_xpath")));
		subject.sendKeys("Test Mail");
		hardwait(2000);
		WebElement mailBody=driver.findElement(By.xpath(PropertyReader.getPropValue("mailBody_xpath")));
		mailBody.click();
		hardwait(2000);
		mailBody.sendKeys("Hi");
		hardwait(2000);
		WebElement send=driver.findElement(By.xpath(PropertyReader.getPropValue("send_xpath")));
		send.click();
		
	}
	public void sentMail()
	{
		WebElement search_mail=driver.findElement(By.xpath(PropertyReader.getPropValue("search_mail_xpath")));
    	search_mail.click();
    	search_mail.sendKeys("in:sent");
    	search_mail.sendKeys(Keys.ENTER);
		hardwait(2000);
	}
	public void checkReceivedMail()
	{
		WebElement search_mail=driver.findElement(By.xpath(PropertyReader.getPropValue("search_mail_xpath")));
		search_mail.clear();
		search_mail.sendKeys("varshah.holkar@gmail.com");
		search_mail.sendKeys(Keys.ENTER);
		hardwait(3000);
		List<WebElement> tmails=driver.findElements(By.xpath(PropertyReader.getPropValue("tmails_xpath")));
		String emails=tmails.get(3).getText();
		System.out.println("Total no. of received emails "+emails);
		
	}
	public void checkAttachment()
	{
		WebElement search_mail=driver.findElement(By.xpath(PropertyReader.getPropValue("search_mail_xpath")));
		search_mail.clear();
		search_mail.sendKeys("has:attachment");
		search_mail.sendKeys(Keys.ENTER);
		hardwait(2000);
		List<WebElement> tmails=driver.findElements(By.xpath(PropertyReader.getPropValue("tmails_xpath")));
		String emails=tmails.get(3).getText();
		System.out.println("Total no. of emails with Attachments "+emails);
		
	}
	public void checkSettings()
	{
		WebElement set_link=driver.findElement(By.xpath(PropertyReader.getPropValue("set_link_xpath")));
		set_link.click();
		hardwait(2000);
		WebElement see_all_setting=driver.findElement(By.xpath(PropertyReader.getPropValue("see_all_setting_xpath")));
		see_all_setting.click();
		hardwait(2000);
		WebElement setting=driver.findElement(By.xpath(PropertyReader.getPropValue("setting_xpath")));
		waitForDisplay(setting);
		hardwait(2000);
		
	}
	public void createNewLable()
	{
		List<WebElement> more=driver.findElements(By.xpath(PropertyReader.getPropValue("more_xpath")));
		hardwait(2000);
		more.get(0).click();
		hardwait(2000);
		WebElement new_lable_link=driver.findElement(By.xpath(PropertyReader.getPropValue("new_lable_link_xpath")));
		new_lable_link.click();
		hardwait(4000);
		WebElement lable_name=driver.findElement(By.xpath(PropertyReader.getPropValue("lable_name_xpath")));
		lable_name.sendKeys("Testings");
		hardwait(2000);
		WebElement create_btn=driver.findElement(By.xpath(PropertyReader.getPropValue("create_btn_xpath")));
		create_btn.click();
		hardwait(2000);
		WebElement labels=driver.findElement(By.xpath(PropertyReader.getPropValue("labels_xpath")));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", labels);
		js.executeScript("arguments[0].scrollIntoView();", labels);
		hardwait(2000);
		
	}
	public void moveToLable()
	{
		hardwait(2000);
		WebElement Inbox=driver.findElement(By.xpath(PropertyReader.getPropValue("labels_xpath")));
		Inbox.click();
    	hardwait(2000);
    	
    	List<WebElement> InboxAllMail=driver.findElements(By.xpath(PropertyReader.getPropValue("InboxAllMail_xpath")));
    	List<WebElement> select=driver.findElements(By.xpath(PropertyReader.getPropValue("select_xpath")));
    	List<WebElement> Label=driver.findElements(By.xpath(PropertyReader.getPropValue("Label_xpath")));
    	int a = InboxAllMail.size();
		int b = select.size();
		int c = Label.size();
		int d = 1;
		String name1 = null;
		if (!InboxAllMail.isEmpty()) {
		name1 = InboxAllMail.get(d).getAttribute("name");
		System.out.println("Inbox mail Number : " + a);
		} 
		else {
		 System.out.println("Inbox is Vacant");
		 }
		 System.out.println("Mail Available to move : " + b);
		 System.out.println("Label size : " + c);
		 hardwait(2000);
		 select.get(d).click();
		
		hardwait(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//WebElement MoveToBtn=driver.findElement(By.xpath(PropertyReader.getPropValue("labels_xpath")));
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[@class='G-Ni J-J5-Ji']//div[@aria-label='Move to']")));
		hardwait(2000);
		
		/*MovetToBox.sendKeys("Testing");
		waitForDisplay(MoveToLabelSelect);
		MoveToLabelSelect.click();*/
		
		
	}
	public void logOut()
	{
		WebElement account_logo=driver.findElement(By.xpath(PropertyReader.getPropValue("account_logo_xpath")));
		account_logo.click();
		driver.switchTo().frame("account");
		WebElement sign_out=driver.findElement(By.xpath(PropertyReader.getPropValue("sign_out_xpath")));
		hardwait(2000);
		sign_out.click();
		hardwait(5000);
	}


}
