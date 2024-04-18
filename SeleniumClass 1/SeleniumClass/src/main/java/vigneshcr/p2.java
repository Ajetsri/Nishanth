package vigneshcr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Open app
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize(); // maximize browser window
		
		//search box
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		
		//search button
		driver.findElement(By.name("submit_search")).click();
		
		//link text & partial linktext
		//driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		driver.findElement(By.partialLinkText("Printed Chiffon")).click();
		*/
		
		//***************************************************************
		
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Open app
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize(); // maximize browser window
		
		//Finding number of sliders on home page	
		List<WebElement> sliders=driver.findElements(By.className("homeslider-container"));
		System.out.println("Number of sliders:"+sliders.size());
		
		//Find Total number of images in home page
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("Total number of images:"+images.size());
		
		//Find total number of links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+ links.size());
		
		
		driver.quit();
		
		//*************************************************************
		 /* 
		 
		  	1) Identifying elements - Locators
			2) Perform actions - Methods

				Locator - Locate the web elements

				findElement()
				findElements()

				length - arrays   a.length
				lenght() - string   s.lenght()
				size()- List, Set, HashMap 

				findElement(loc) ----> WebElement 
				findElements(loc) ----> List<WebElement>
				
				Scenario1:  locator is matching with single web element.
				-------
				findElement(loc) ---->single webelement   WebElement
				findElements(loc)--->single webelement		List<WebElement>
				
				Scenario2: locator is matching with multiple web elements
				------------------
				findElement(loc)---->single webelement(first)    WebElement
				findElements(loc) ---> multiple web elements      List<WebElement>
				
				Scenario3: locator is incorect ( No elements are not matching with locator)
				------
				findElement(loc)----> NoSuchElementException
				findElements(loc)--->returns zero
	
		
		*/

	}

}
