package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePages1 {

	public ActiTimePages1(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	//Create WebElement for UserName text field
	private WebElement username;

	public WebElement getUserName()
	{
		return username;
	}

	//Create WebElement for Password Text Field
	private WebElement pwd;

	public WebElement getPassword()
	{
		return pwd;
	}

	//Create WebElement for Login button
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement oBtnLogin;

	public WebElement getLoginButton()
	{
		return oBtnLogin;
	}

	//Create WebElement for FlyOutWindow 
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}

	//Create WebElement for Logout Link
	@FindBy(linkText="Logout")
	private WebElement oLnkLogout;
	public WebElement getLogoutLink()
	{
		return oLnkLogout;
	}

	//Create WebElement for Task Tab
	@FindBy(xpath="//*[@id='topnav']/tbody/tr/td[3]/a/div[2]")
	private WebElement oBtnTask;

	public WebElement getTaskTab()
	{
		return oBtnTask;
	}

	//Create WebElement for Add New 
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement oBtnAddNew;
	public WebElement getAddNew()
	{
		return oBtnAddNew;
	}

	//Create WebElement for New Customer Button
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement oBtnNewCustomerBtn;
	public WebElement getNewCustomerBtn()
	{
		return oBtnNewCustomerBtn;
	}

	//Create WebElement for New Project Button
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement oBtnNewProjectBtn;
	public WebElement getNewProjectBtn()
	{
		return oBtnNewProjectBtn;
	}

	//Create WebElement for Project Name Field
	@FindBy(id="projectPopup_projectNameField")
	private WebElement oBtnProjNameField;
	public WebElement getProjNameField()
	{
		return oBtnProjNameField;
	}

	//Create WebElement for Project Name Description Field
	@FindBy(id="projectPopup_projectDescriptionField")
	private WebElement oBtnProjDescField;
	public WebElement getProjDescField()
	{
		return oBtnProjDescField;
	}

	//Create WebElement for Create Project Button
	@FindBy(xpath="//*[@id='projectPopup_commitBtn']/div/span")
	private WebElement oBtnCreateProjectBtn;
	public WebElement getCreateProjectBtn()
	{
		return oBtnCreateProjectBtn;
	}

	//Create WebElement for Customer Name Field
	@FindBy(id="customerLightBox_nameField")
	private WebElement oBtnCustNameField;
	public WebElement getCustNameField()
	{
		return oBtnCustNameField;
	}

	//Create WebElement for Customer Name Description Field
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement oBtnCustDescField;
	public WebElement getCustDescField()
	{
		return oBtnCustDescField;
	}
	//Create WebElement for Create Customer Button
	@FindBy(xpath="//*[@id='customerLightBox_commitBtn']/div/span")
	private WebElement oBtnCreateCustomerBtn;
	public WebElement getCreateCustomerBtn()
	{
		return oBtnCreateCustomerBtn;
	}

	//Create WebElement for Edit Customer Button
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement oBtnEditCustomerBtn;
	public WebElement getEditCustomerBtn()
	{
		return oBtnEditCustomerBtn;
	}

	//Create WebElement for Edit Project Button
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement oBtnEditProjectBtn;
	public WebElement getEditProjectBtn()
	{
		return oBtnEditProjectBtn;
	}

	//Create WebElement for Customer Action Button
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")
	private WebElement oBtnCustomerActionBtn;
	public WebElement getCustomerActionBtn()
	{
		return oBtnCustomerActionBtn;
	}
	
	//Create WebElement for Project Action Button
		@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div")
		private WebElement oBtnProjectActionBtn;
		public WebElement getProjectActionBtn()
		{
			return oBtnProjectActionBtn;
		}

		//Create WebElement for Project Delete Button
		@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")
		private WebElement oBtnProjectDeleteBtn;
		public WebElement getProjectDeleteBtn()
		{
			return oBtnProjectDeleteBtn;
		}
	//Create WebElement for Customer Delete Button
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")
	private WebElement oBtnCustomerDeleteBtn;
	public WebElement getCustomerDeleteBtn()
	{
		return oBtnCustomerDeleteBtn;
	}
	
	//Create WebElement for Project Delete Confirm Button
		@FindBy(id="projectPanel_deleteConfirm_submitTitle")
		private WebElement oBtnProjectDeleteConfirmBtn;
		public WebElement getProjectDeleteConfirmBtn()
		{
			return oBtnProjectDeleteConfirmBtn;
		}

	//Create WebElement for Customer Delete Confirm Button
	@FindBy(id="customerPanel_deleteConfirm_submitTitle")
	private WebElement oBtnCustomerDeleteConfirmBtn;
	public WebElement getCustomerDeleteConfirmBtn()
	{
		return oBtnCustomerDeleteConfirmBtn;
	}

	//Create WebElement for Edit Customer description text
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement oBtnEditCustomerDesc;
	public WebElement getEditCustomerDesc()
	{
		return oBtnEditCustomerDesc;
	}

	//Create WebElement for Edit Project description text
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement oBtnEditProjectDesc;
	public WebElement getEditProjectDesc()
	{
		return oBtnEditProjectDesc;
	}

	//Create WebElement for Customer Task Close Button
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[1]")
	private WebElement oBtnCustomerTaskCloseBtn;
	public WebElement getCustomerTaskCloseBtn()
	{
		return oBtnCustomerTaskCloseBtn;
	}
	//Create WebElement for Project Task Close Button
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[1]")
	private WebElement oBtnProjectTaskCloseBtn;
	public WebElement getProjectTaskCloseBtn()
	{
		return oBtnProjectTaskCloseBtn;
	}
}
