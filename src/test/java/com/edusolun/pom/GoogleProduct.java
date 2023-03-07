package com.edusolun.pom;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.edusolun.base.CommonMethods;
import com.edusolun.utils.PropertyReader;

public class GoogleProduct extends CommonMethods{
	
	public void googleProductVerify()
	{
		List<WebElement> product_list=driver.findElements(By.xpath(PropertyReader.getPropValue("product_list_xpath")));
		System.out.println("size :"+product_list.size());
		
		WebElement for_all=driver.findElement(By.xpath(PropertyReader.getPropValue("for_all_xpath")));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", for_all);
		hardwait(2000);
	    getScreenshot("GoogleProduct1");
	    
	    WebElement googleTV=driver.findElement(By.xpath(PropertyReader.getPropValue("googleTV_xpath")));
	    js.executeScript("arguments[0].scrollIntoView();", googleTV);
	    Assert.assertTrue(googleTV.isDisplayed());
		hardwait(2000);
	    getScreenshot("GoogleProduct2");
	    
	    WebElement youtubeVR=driver.findElement(By.xpath(PropertyReader.getPropValue("youtubeVR_xpath")));
		js.executeScript("arguments[0].scrollIntoView();", youtubeVR);
		hardwait(2000);
		getScreenshot("GoogleProduct3");
		
	}

}
