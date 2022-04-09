package com.guru99bank.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guru99bank.qa.base.TestBase;
import com.guru99bank.qa.pages.DeleteCustomerPage;
import com.guru99bank.qa.pages.HomePage;
import com.guru99bank.qa.pages.LoginPage;

public class DeleteCustomerTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	DeleteCustomerPage deleteCustomerPage;
	
	public DeleteCustomerTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		deleteCustomerPage=homePage.clickDeleteCustomerButton();
	}
	
	@Test
	public void deletingCustomer() {
		deleteCustomerPage.deleteCustomer(prop.getProperty("customerId"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
