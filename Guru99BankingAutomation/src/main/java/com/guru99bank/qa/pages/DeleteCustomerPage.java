package com.guru99bank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99bank.qa.base.TestBase;

public class DeleteCustomerPage extends TestBase {
	
	//Page Factory
	@FindBy(xpath="//input[@name='cusid']")
	WebElement custIdTextBox;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	WebElement submitBtn;
	
	//Initialize Page Factory
	public DeleteCustomerPage() {
		PageFactory.initElements(driver, this);
	}
	
	//actions
	public void deleteCustomer(String id) {
		custIdTextBox.sendKeys(id);
		submitBtn.click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
	}

}
