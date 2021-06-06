package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg3_POMCreateDeleteCustomer {

		public static WebDriver oBrowser=null; //WebDriver object
		public static ActiTimePages1 oPage=null; //Page object
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			login();
			flyOutWindow();
			createCustomer();
			deleteCustomer();
			logout();
			closeApplication();
		}
		
		static void createCustomer()
		{
			try {
				oPage.getTaskTab().click();
				Thread.sleep(1000);
				oPage.getAddNew().click();
				oPage.getNewCustomerBtn().click();
				Thread.sleep(1000);
				oPage.getCustNameField().sendKeys("Tester1");
				Thread.sleep(1000);
				oPage.getCustDescField().sendKeys("Test desc");
				Thread.sleep(1000);
				oPage.getCreateCustomerBtn().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void deleteCustomer()
		{
			try {
				oPage.getEditCustomerBtn().click();
				Thread.sleep(1000);
				oPage.getCustomerActionBtn().click();
				Thread.sleep(1000);
				oPage.getCustomerDeleteBtn().click();
				Thread.sleep(1000);
				oPage.getCustomerDeleteConfirmBtn().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "G:\\DemoWorkspace\\JavaPracticePrograms\\Web-Automation\\Library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
				oBrowser.manage().window().maximize();
				oPage=new ActiTimePages1(oBrowser);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		static void navigate()
		{
			try
			{
				oBrowser.get("http://localhost:81/login.do");
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void login()
		{
			try
			{
				oPage.getUserName().sendKeys("admin");
				oPage.getPassword().sendKeys("manager");
				oPage.getLoginButton().click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void flyOutWindow()
		{
			try
			{
				oPage.getFlyOutWindow().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void logout()
		{
			try
			{
				oPage.getLogoutLink().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void closeApplication()
		{
			try
			{
				oBrowser.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}
