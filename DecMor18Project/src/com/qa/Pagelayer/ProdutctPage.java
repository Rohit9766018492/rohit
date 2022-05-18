package com.qa.Pagelayer;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ProdutctPage {
//     WebDriver driver;
//	WebDriver ScreenShot;
//     public void scroll()
//	{
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1200)");
//	}
     
     public static void screenshot(WebDriver driver ,String name) 
     {
    	 try { 
    	TakesScreenshot ts=(TakesScreenshot)driver;
    	 File src=ts.getScreenshotAs(OutputType.FILE);
    	 
    	 File des=new File ("C:\\Users\\Lenovo\\OneDrive\\Documents\\ScreenShotAuto\\"+ name+".png");
    	 
    	
			FileHandler.copy(src, des);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    	
    	
    	 
     }
}
