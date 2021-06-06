package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
	public static WebDriver oBrowser=null; // WebDriver is an interface; for interface we have created oBrowser as a reference variable;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
	}
	
	static void launchBrowser()
	{
		String path=null;
		try {
			path=System.getProperty("user.dir"); //Gets the folder path of this java class file
			System.out.println(path);
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe"); //It takes the relative path of the ChromeDriver
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
	{
		try {
			
			oBrowser.get("http://localhost:81/user/submit_tt.do"); //Navigate to the ActiTime url using Chrome Browser
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
