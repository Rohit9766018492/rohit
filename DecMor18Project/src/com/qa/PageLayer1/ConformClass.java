package com.qa.PageLayer1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConformClass {


	
		private WebDriver driver3;
		
		public  ConformClass(WebDriver driver)
		{
			this.driver3=driver;
			PageFactory.initElements(driver, this);
		}
       
		@FindBy(xpath="//button[@class='sqdOP  L3NKy   y3zKF     ']")
		private WebElement Conform;
		
		public void ConformCall()
		{
			Conform.click();
		}
}
