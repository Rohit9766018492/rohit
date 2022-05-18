package com.qa.PageLayer1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectDateInstapage {

	private WebDriver driver2;
	
	public  SelectDateInstapage(WebDriver driver)
	{
		this.driver2=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@title='Month:']")
	private WebElement Month;
	
	public void month()
	{
		Month.click();
		 Select s=new Select(Month);
		 s.selectByValue("6");
	}
	@FindBy(xpath="//select[@title='Day:']")
	private WebElement Day;
	
	public void day()
	{
		Day.click();
		Select s1=new Select(Day);
		s1.selectByValue("19");
	}
	@FindBy(xpath="//select[@title='Year:']")
	private WebElement Year;
	public void year()
	{
		Year.click();
		Select s2=new Select(Year);
		s2.selectByValue("1995");
		
	}
	@FindBy(xpath="//button[@class='sqdOP  L3NKy _4pI4F  y3zKF     ']")
	private WebElement Next;
	
	public void button()
	{
		Next.click();
	}
	
	
}
