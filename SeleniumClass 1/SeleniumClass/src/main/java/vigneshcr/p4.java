package vigneshcr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 
		  	XPath
			--------
			Address of an element
			DOM - Document Object Model
			
			2 kinds of xpaths
			------
			1) Absolute xpath( full xpath)
			
				/html/body/header/div/div/div[1]/div/a/img
			
			2) Relative xpath ( partial xpath)
			
				//div[@id="logo"]/a/img
			
				//img[@title='Your Store']
			
			differences....
			
			which one you will prefer?   
				Relative xpath
			
			why?
				bcoz absolute xpath wont work if there are any changes in web page.
			
			
			How to write our own xpath?
			
				//*[@attribute='value']
				//tagname[@attribute='value']
			
			
			How to generate xpath automatically?
			  1) using developer tools
			 2) using selectors hub - extension of browser
			
			//img[@title='Your Store']
			
			xpath having multiple attributes
			xpath functions - text(), normalized-space(), contains() start-with()
			xpath operators - and      or
			xpath axes - following, preceding, sibling, parent, self, ancestor etc.....
			How to locate elements who attributes are dynamically changing
		  
		 */
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		String productname= driver.findElement(By.xpath("//a[normalize-space()='MacBook']")).getText(); 
		
		//String productname=driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/h4[1]/a[1]")).getText();
				
		System.out.println(productname);

	}

}
