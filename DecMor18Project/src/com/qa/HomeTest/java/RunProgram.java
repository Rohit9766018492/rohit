package com.qa.HomeTest.java;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.PageLayer1.ConformClass;
import com.qa.PageLayer1.LoginPageInsta;
import com.qa.PageLayer1.SelectDateInstapage;

public class RunProgram {
 
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\OneDrive\\Documents\\Automation\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		LoginPageInsta lpi=new LoginPageInsta(driver);
		
		lpi.MoNO();
		lpi.Full_Name();
		lpi.User_N();
     	lpi.Passs();
     	lpi.signIn();
     	
     	SelectDateInstapage dt=new SelectDateInstapage(driver);
     	dt.month();
     	dt.day();
     	dt.year();
     	dt.button();
     	
     	Thread.sleep(20000);
     	
     	ConformClass c=new ConformClass(driver);
     	c.ConformCall();
	}
}
