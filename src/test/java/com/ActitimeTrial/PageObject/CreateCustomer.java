package com.ActitimeTrial.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCustomer {
	
	WebDriver driver;
	public CreateCustomer(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[@href='/tasks/tasklist.do']")
	WebElement tasks;
	
	@FindBy(xpath="//div[text()='Add New']")
	WebElement addNewButton;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	WebElement newCustomer;
	
	@FindBy(xpath= "(//input[@placeholder='Enter Customer Name'])[2]")
	WebElement enterCustName;
	
	
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	WebElement custDisc;
	
	@FindBy(xpath="//div[text()='  Create Customer']")
	WebElement  createCustButton;
	
	

	
	public void ClickTaskButton() {
		tasks.click();
	}

	public void clickAddNew() {
		addNewButton.click();
	}
	public void clickNewCustomer() {
		newCustomer.click();
	}
	
	public void enterCustName(String custName) {
		enterCustName.sendKeys(custName);
	}
	
	public void enterDescription(String disc) {
		custDisc.sendKeys(disc);
	}
	
	
	public void clickCreateCustomer() {
		createCustButton.click();
	}
}
