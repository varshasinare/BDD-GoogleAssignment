package com.edusolun.pom;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.edusolun.base.CommonMethods;
import com.edusolun.utils.PropertyReader;

public class LanguageSet extends CommonMethods {

	public void setSetting() {
		hardwait(2000);
		WebElement setting = driver.findElement(By.xpath(PropertyReader.getPropValue("Lang_setting_xpath")));
		waitForDisplay(setting);
		hardwait(2000);
		setting.click();
		WebElement search_set = driver.findElement(By.linkText(PropertyReader.getPropValue("search_set_linkText")));
		search_set.click();
		hardwait(2000);
		WebElement lang = driver.findElement(By.xpath(PropertyReader.getPropValue("lang_xpath")));
		lang.click();
		hardwait(2000);
		WebElement Show_more = driver.findElement(By.id(PropertyReader.getPropValue("Show_more_id")));
		Show_more.click();

	}

	public void setLanguage() {
		WebElement hindi = driver.findElement(By.xpath(PropertyReader.getPropValue("hindi_xpath")));
		hindi.click();
		hardwait(2000);
		WebElement save = driver.findElement(By.xpath(PropertyReader.getPropValue("save_xpath")));
		save.click();
		hardwait(3000);
		Alert alert = driver.switchTo().alert();
		driver.switchTo().alert().accept();
		hardwait(2000);
	}

	public void verifyLang() {
		// driver.navigate().refresh();
		//driver.navigate().back();
		hardwait(5000);
	}
}
