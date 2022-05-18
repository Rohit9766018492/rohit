package com.qa.Pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage extends ProdutctPage{

	    private WebElement Search_bar;
	    private WebElement Search_tab;
	
	
		
		public homepage(WebDriver driver)
		{
			Search_bar=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			Search_tab=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		}
	
		public void start()
		{
			Search_bar.sendKeys("i phone");
		}
		
		public void click()
		{
			Search_tab.click();
		}
}
