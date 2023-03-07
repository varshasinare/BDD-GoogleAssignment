package com.edusolun.pom;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.edusolun.base.CommonMethods;
import com.edusolun.utils.PropertyReader;

public class GoogleAppLogin extends CommonMethods{
	public void account_login(String email,String pass)
	{
		driver.switchTo().frame(1);
		hardwait(1000);
		List<WebElement> app_list=driver.findElements(By.xpath(PropertyReader.getPropValue("app_list_xpath")));
		hardwait(1000);
		app_list.get(0).click();
		List<WebElement> google_account=driver.findElements(By.xpath(PropertyReader.getPropValue("google_account_xpath")));
		google_account.get(1).click();
		hardwait(1000);
		WebElement emailID=driver.findElement(By.id(PropertyReader.getPropValue("email_id")));
		emailID.sendKeys(email);  //vrshholkar
		List<WebElement> email_next=driver.findElements(By.xpath(PropertyReader.getPropValue("email_next_xpath")));
		email_next.get(1).click();
		hardwait(2000);
		WebElement password=driver.findElement(By.xpath(PropertyReader.getPropValue("password_xpath")));
		password.sendKeys(pass);   //Varsha@123
		hardwait(2000);
		WebElement pass_next=driver.findElement(By.xpath(PropertyReader.getPropValue("pass_next_xpath")));
		pass_next.click();
		
		
	}
	
	public void checkAppPage()
	{
		WebElement home=driver.findElement(By.xpath(PropertyReader.getPropValue("home_xpath")));
		waitForDisplay(home);
		WebElement name=driver.findElement(By.xpath(PropertyReader.getPropValue("name_xpath")));
		//System.out.println(name.getText());
		Assert.assertTrue(name.getText().equalsIgnoreCase("Welcome, varsha holkar"));
	}


}
