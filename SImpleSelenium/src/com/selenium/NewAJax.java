package com.selenium;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.support.ui.Select;

public class NewAJax {
	WebDriver driver;
	String url= "http://demo.guru99.com/V4/";
	
	@Before
	
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91954\\Desktop\\Ankit\\chromedriver.exe");
		   driver= new ChromeDriver();
		  driver.get(url);
		  Thread.sleep(3000);
		  }
	@Test
	
	public void test() throws Exception {
		
		File file= new File("");
		
		
		
		
	}
	@After
	
	public void after() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
}