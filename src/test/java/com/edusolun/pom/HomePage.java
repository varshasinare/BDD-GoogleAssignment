package com.edusolun.pom;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.edusolun.base.CommonMethods;
import com.edusolun.utils.PropertyReader;

public class HomePage extends CommonMethods
{
	 public void homecheck() {
		 
			hardwait(2000);
			getScreenshot("HomepageImage");
			String title=driver.getTitle();						//page Title
			System.out.println("Page Title: "+title);
			Assert.assertTrue(title.equalsIgnoreCase("Google"));
			
			WebElement google_logo=driver.findElement(By.xpath(PropertyReader.getPropValue("google_logo_xpath")));
			waitForDisplay(google_logo);						//Google logo
			
			WebElement sign_in=driver.findElement(By.xpath(PropertyReader.getPropValue("sign_in_xpath")));
			Assert.assertTrue(sign_in.isDisplayed());			//Sign in
			
			WebElement search_text_box=driver.findElement(By.xpath(PropertyReader.getPropValue("Searchtext_box_xpath")));
			Assert.assertTrue(search_text_box.isDisplayed());
			List<WebElement> google_Search_btn=driver.findElements(By.xpath(PropertyReader.getPropValue("search_btn_xpath")));
			Assert.assertTrue(google_Search_btn.get(1).isDisplayed());   //Google Search 
			List<WebElement> lucky_btn=driver.findElements(By.xpath(PropertyReader.getPropValue("lucky_btn_xpath")));
			Assert.assertTrue(lucky_btn.get(1).isDisplayed());         //I'am feeling lucky
		
		
	 }
	 public void appClick(){
		 	WebElement google_app=driver.findElement(By.xpath(PropertyReader.getPropValue("google_app_xpath")));
			google_app.click();
			hardwait(1000);
		 
		 
	 }
	 
	 
	 public void googleAppCheck(){
			
		 	hardwait(2000);
			driver.switchTo().frame(1);
			getScreenshot("GoogleApp1");
			hardwait(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			List<WebElement> app_list=driver.findElements(By.xpath(PropertyReader.getPropValue("app_list_xpath")));
			System.out.println("Size "+app_list.size());
			js.executeScript("arguments[0].scrollIntoView();", app_list.get(25));
			hardwait(2000);
		    getScreenshot("GoogleApp2");
			js.executeScript("arguments[0].scrollIntoView();", app_list.get(0));
			
			hardwait(1000);
			
	}
	// WebElement google_app;
	 public void accountAppVerify() {
		 
			driver.switchTo().frame(1);
			hardwait(1000);
			List<WebElement> app_list=driver.findElements(By.xpath(PropertyReader.getPropValue("app_list_xpath")));
			hardwait(1000);
			app_list.get(0).click();
			
			WebElement Account_header=driver.findElement(By.className(PropertyReader.getPropValue("Account_header_className")));
			Assert.assertTrue(Account_header.isDisplayed());
			driver.navigate().back();
			driver.navigate().refresh();
			hardwait(1000);
	}
	 
	public void searchAppVerify() {
		 
			waitForClick(driver.findElement(By.xpath(PropertyReader.getPropValue("google_app_xpath"))));
		 	WebElement google_app=driver.findElement(By.xpath(PropertyReader.getPropValue("google_app_xpath")));
		 	google_app.click();
			hardwait(1000);
			driver.switchTo().frame(0);
			hardwait(1000);
			List<WebElement> app_list=driver.findElements(By.xpath(PropertyReader.getPropValue("app_list_xpath")));
			app_list.get(1).click();
			hardwait(2000);
			WebElement google_image=driver.findElement(By.xpath(PropertyReader.getPropValue("google_image_xpath")));
			Assert.assertTrue(google_image.isDisplayed());

			WebElement search_text=driver.findElement(By.xpath(PropertyReader.getPropValue("search_text_xpath")));
			Assert.assertTrue(search_text.isDisplayed());
			hardwait(1000);
			WebElement google_Search_btn=driver.findElement(By.xpath(PropertyReader.getPropValue("search_btn2_xpath")));
			Assert.assertTrue(google_Search_btn.isDisplayed());
			hardwait(1000);
			WebElement lucky_btn=driver.findElement(By.xpath(PropertyReader.getPropValue("lucky_btn2_xpath")));
			Assert.assertTrue(lucky_btn.isDisplayed());
			
			driver.navigate().back();
			driver.navigate().refresh();
			hardwait(1000);
	 
	}
	public void mapVerify(){
		
			waitForClick(driver.findElement(By.xpath(PropertyReader.getPropValue("google_app_xpath"))));
		 	WebElement google_app=driver.findElement(By.xpath(PropertyReader.getPropValue("google_app_xpath")));
		 	google_app.click();
			hardwait(1000);
			driver.switchTo().frame(0);
			hardwait(1000);
			List<WebElement> app_list=driver.findElements(By.xpath(PropertyReader.getPropValue("app_list_xpath")));
			app_list.get(2).click();
			hardwait(2000);
			WebElement search_google_map=driver.findElement(By.xpath(PropertyReader.getPropValue("search_google_map_xpath")));
			Assert.assertTrue(search_google_map.isDisplayed());
			
			driver.navigate().back();
			driver.navigate().refresh();
			hardwait(1000);		
		
	}
	
	public void youtubeVerify(){
		
		waitForClick(driver.findElement(By.xpath(PropertyReader.getPropValue("google_app_xpath"))));
	 	WebElement google_app=driver.findElement(By.xpath(PropertyReader.getPropValue("google_app_xpath")));
	 	google_app.click();
		hardwait(1000);
		driver.switchTo().frame(0);
		hardwait(1000);
		List<WebElement> app_list=driver.findElements(By.xpath(PropertyReader.getPropValue("app_list_xpath")));
		app_list.get(3).click();
		hardwait(2000);
		WebElement youtube_logo=driver.findElement(By.xpath(PropertyReader.getPropValue("youtube_logo_xpath")));
		Assert.assertTrue(youtube_logo.isDisplayed());
		WebElement youtube_search=driver.findElement(By.xpath(PropertyReader.getPropValue("youtube_search_xpath")));
		Assert.assertTrue(youtube_search.isDisplayed());
		
		driver.navigate().back();
		driver.navigate().refresh();
		hardwait(1000);		
	
	}
	public void googlePlayVerify(){
		
		waitForClick(driver.findElement(By.xpath(PropertyReader.getPropValue("google_app_xpath"))));
	 	WebElement google_app=driver.findElement(By.xpath(PropertyReader.getPropValue("google_app_xpath")));
	 	google_app.click();
		hardwait(1000);
		driver.switchTo().frame(0);
		hardwait(1000);
		List<WebElement> app_list=driver.findElements(By.xpath(PropertyReader.getPropValue("app_list_xpath")));
		app_list.get(4).click();
		hardwait(2000);
		WebElement google_play_logo=driver.findElement(By.xpath(PropertyReader.getPropValue("google_play_logo_xpath")));
		Assert.assertTrue(google_play_logo.isDisplayed());
		WebElement google_play_search=driver.findElement(By.xpath(PropertyReader.getPropValue("google_play_search_xpath")));
		Assert.assertTrue(google_play_search.isDisplayed());
		
		driver.navigate().back();
		driver.navigate().refresh();
		hardwait(1000);		
	
	}
	
	public void googleNewsVerify(){
		
		waitForClick(driver.findElement(By.xpath(PropertyReader.getPropValue("google_app_xpath"))));
	 	WebElement google_app=driver.findElement(By.xpath(PropertyReader.getPropValue("google_app_xpath")));
	 	google_app.click();
		hardwait(1000);
		driver.switchTo().frame(0);
		hardwait(1000);
		List<WebElement> app_list=driver.findElements(By.xpath(PropertyReader.getPropValue("app_list_xpath")));
		hardwait(1000);
		app_list.get(5).click();
		hardwait(2000);
		WebElement google_News=driver.findElement(By.id(PropertyReader.getPropValue("google_News_id")));
		Assert.assertTrue(google_News.isDisplayed());
		WebElement News_Home=driver.findElement(By.xpath(PropertyReader.getPropValue("News_Home_xpath")));
		Assert.assertTrue(News_Home.isDisplayed());
		
		driver.navigate().back();
		driver.navigate().refresh();
		hardwait(1000);		
	
	}
	
	public void googleDriveVerify(){
		
		waitForClick(driver.findElement(By.xpath(PropertyReader.getPropValue("google_app_xpath"))));
	 	WebElement google_app=driver.findElement(By.xpath(PropertyReader.getPropValue("google_app_xpath")));
	 	google_app.click();
		hardwait(1000);
		driver.switchTo().frame(0);
		hardwait(1000);
		List<WebElement> app_list=driver.findElements(By.xpath(PropertyReader.getPropValue("app_list_xpath")));
		app_list.get(10).click();
		hardwait(2000);
		List<WebElement> drive_logo=driver.findElements(By.xpath(PropertyReader.getPropValue("drive_logo_xpath")));
		waitForDisplay(drive_logo.get(0));
		WebElement go_to_drive=driver.findElement(By.xpath(PropertyReader.getPropValue("go_to_drive_xpath")));
		waitForDisplay(go_to_drive);
		hardwait(1000);		
	
	}
	
			
	
}
