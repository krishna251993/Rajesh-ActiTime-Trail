package com.ActitimeTrial.TestrCases;

import org.testng.annotations.Test;

import com.ActitimeTrial.PageObject.LoginPage;

public class TC_LoginTestCase_001 extends BaseClass {
	
	@Test
	public void login() throws InterruptedException {
		logger.info("browser opened");
		driver.get(baseURL);
		
		logger.info("URL Passes");
		LoginPage lp= new LoginPage(driver);
	
		lp.setUserName(username);
		logger.info("username passed");
		lp.setPassword(password);
		logger.info("password passed");
		lp.clickLogin();
		logger.info("login clicked");
		Thread.sleep(3000);
	}

}
