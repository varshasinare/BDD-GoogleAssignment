package com.edusolun.pom;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.edusolun.base.CommonMethods;
import com.edusolun.utils.PropertyReader;

public class SearchKeyWord  extends CommonMethods{
	
	public void EnterKeyword(String s)
	{
		WebElement search_box=driver.findElement(By.xpath(PropertyReader.getPropValue("search_box_xpath")));
		waitForDisplay(search_box);
		search_box.sendKeys(s);
		hardwait(2000);
		List<WebElement> search_list=driver.findElements(By.xpath(PropertyReader.getPropValue("search_list_xpath")));
		 for(int i=0;i<search_list.size();i++)
		 {
			 
			if(search_list.get(i).getText().contains(s))
			{
				search_list.get(i).click();
				hardwait(1000);
				break;
			}
		 }
		
		 
		WebElement search_Name=driver.findElement(By.xpath(PropertyReader.getPropValue("search_Name_xpath")));
		hardwait(2000);
		Assert.assertTrue(search_Name.getText().contains(s));
		List<WebElement> search_wiki=driver.findElements(By.xpath(PropertyReader.getPropValue("search_wiki_xpath")));
		hardwait(2000);
		for(int i=0;i<search_wiki.size();i++)
		 {
			 System.out.println(search_wiki.get(i).getText());
			
		 }
		 hardwait(2000);
	}

}
