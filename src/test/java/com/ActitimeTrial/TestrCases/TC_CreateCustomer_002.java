package com.ActitimeTrial.TestrCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.ActitimeTrial.PageObject.CreateCustomer;
import com.ActitimeTrial.PageObject.LoginPage;

import net.bytebuddy.utility.RandomString;

public class TC_CreateCustomer_002 extends BaseClass {
	@Test
	public void createCustomer()  {
		LoginPage lp= new  LoginPage(driver);
		
		driver.get(baseURL);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
		
		CreateCustomer cc= new CreateCustomer(driver);
		cc.ClickTaskButton();
		logger.info("Task button clicked");
		cc.clickAddNew();
		logger.info("Add new button Clicked");
		cc.clickNewCustomer();
		logger.info("New Customer Clicked");
		
		cc.enterCustName(setRandomString());
		
		
		cc.enterDescription(setRandomString());
		
		cc.clickCreateCustomer();
	}

}
