package com.edusolun.pom;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.edusolun.base.CommonMethods;
import com.edusolun.utils.PropertyReader;

public class Gmail extends CommonMethods{
	
	public void gmailLogin(String emailID,String Password)
	{
		List<WebElement> sign_in=driver.findElements(By.linkText(PropertyReader.getPropValue("sign_in_linkText")));
		waitForDisplay(sign_in.get(0));
		sign_in.get(0).click();
		WebElement email=driver.findElement(By.id(PropertyReader.getPropValue("email_id")));
		email.sendKeys(emailID);
		hardwait(2000);
		WebElement next=driver.findElement(By.xpath(PropertyReader.getPropValue("next_xpath")));
		next.click();
		WebElement pwd=driver.findElement(By.xpath(PropertyReader.getPropValue("pwd_xpath")));
		waitForDisplay(pwd);
		pwd.sendKeys(Password);
		WebElement chechbox=driver.findElement(By.xpath(PropertyReader.getPropValue("chechbox_xpath")));
		chechbox.click();
		hardwait(2000);
		
		WebElement pwd_next=driver.findElement(By.xpath(PropertyReader.getPropValue("pwd_next_xpath")));
		pwd_next.click();
		
		hardwait(2000);
		
	}
	public void gmailVerify()
	{
		WebElement image=driver.findElement(By.xpath(PropertyReader.getPropValue("image_xpath")));
		Assert.assertTrue(image.isDisplayed());
		WebElement gmail_logo=driver.findElement(By.xpath(PropertyReader.getPropValue("gmail_logo_xpath")));
		Assert.assertTrue(gmail_logo.isDisplayed());
		WebElement compose=driver.findElement(By.xpath(PropertyReader.getPropValue("compose_xpath")));
		Assert.assertTrue(compose.isDisplayed());
		WebElement inbox=driver.findElement(By.xpath(PropertyReader.getPropValue("inbox_xpath")));
		Assert.assertTrue(inbox.isDisplayed());
		WebElement starred=driver.findElement(By.xpath(PropertyReader.getPropValue("starred_xpath")));
		Assert.assertTrue(starred.isDisplayed());
		WebElement snoozed=driver.findElement(By.xpath(PropertyReader.getPropValue("snoozed_xpath")));
		Assert.assertTrue(snoozed.isDisplayed());
		WebElement sent=driver.findElement(By.xpath(PropertyReader.getPropValue("sent_xpath")));
		Assert.assertTrue(sent.isDisplayed());
		WebElement drafts=driver.findElement(By.xpath(PropertyReader.getPropValue("drafts_xpath")));
		Assert.assertTrue(drafts.isDisplayed());
		
	}

}
