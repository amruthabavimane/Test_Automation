package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirefoxBrowserDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		//logout();
		//closeApplication();
	}
	
	static void launchBrowser()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir"); //Gets the folder path of this java class file
			System.out.println(path);
			System.setProperty("webdriver.gecko.driver", path+"\\Library\\drivers\\geckodriver.exe"); //It takes the relative path of the FirefoxDriver
			
			oBrowser=new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		
		try {
			
			oBrowser.get("http://localhost:81/user/submit_tt.do"); //Navigate to the ActiTime url using Firefox Browser
			
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
	
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			WebDriverWait wait=new WebDriverWait(oBrowser, 60);
			wait.until(ExpectedConditions.textToBe(By.xpath("//td[text()='Enter Time-Track']"), "Enter Time-Track"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(oBrowser, 30);
			//wait.until(ExpectedConditions.elementToBeClickable(By.id("gettingStartedShortcutsPanelId")));
		//	oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			
			wait.until(ExpectedConditions.elementToBeClickable(By.id("gettingStartedShortcutsMenuCloseId")));
			oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			wait=new WebDriverWait(oBrowser, 30);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			WebDriverWait wait=new WebDriverWait(oBrowser, 30);
			wait.until(ExpectedConditions.attributeToBe(By.id("username"), "id", "username"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}