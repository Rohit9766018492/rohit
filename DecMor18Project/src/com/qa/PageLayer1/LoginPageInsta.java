package com.qa.PageLayer1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageInsta {

	private WebDriver driver1;
	public LoginPageInsta(WebDriver driver)
	{
		this.driver1=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='emailOrPhone']")
	  private  WebElement MO_NO;
	
	public void MoNO()
	{
	 MO_NO.sendKeys("7219761557");
	}
	
	@FindBy(xpath="//input[@name='fullName']")
	private WebElement FULL_NAME;
	
	public void Full_Name()
	{
		FULL_NAME.sendKeys("Rohit Sawant");
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement User_Name;
	
	public void User_N()
	{
		User_Name.sendKeys("rohitsawant636");	
	}
	
	@FindBy(xpath="//input[@name='password']")
	private  WebElement Pass;
	
	public void Passs()
	{
		Pass.sendKeys("Rohit.19");
	}
	
	@FindBy(xpath="(//button[@class='sqdOP  L3NKy   y3zKF     '])[2]")
	private WebElement SignUp;
	
	public void signIn()
	{
		SignUp.click();
	}
}
