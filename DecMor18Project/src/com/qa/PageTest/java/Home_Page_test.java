package com.qa.PageTest.java;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.Pagelayer.ProdutctPage;
import com.qa.Pagelayer.homepage;

public class Home_Page_test {

	public static void main(String args[]) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\OneDrive\\Documents\\Automation\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		homepage h=new homepage(driver);
		h.start();
		h.click();
		
		ProdutctPage.screenshot(driver, "Rohit"); 
		//p.scroll();
//		p.screenshot("Rohit");
		 driver.quit();
	}
}
