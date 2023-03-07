package com.edusolun.stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.edusolun.base.CommonMethods;
import com.edusolun.utils.PropertyReader;

public class CucumberHooks extends CommonMethods{
	
@Before
public void StartUp ()
{
	browserLauch(PropertyReader.getPropValue("browser"));
	driver.get(PropertyReader.getPropValue("url"));
	
	}
@After
public void tearDown()
{
	driver.quit();
	}
}
