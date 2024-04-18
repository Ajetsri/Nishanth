package vigneshcr;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.*;
import org.openqa.*;


/*
 Test case
--------
1) Launch browser
2) open url https://opensource-demo.orangehrmlive.com/
3) Provide username  - Admin
4) Provide password  - admin123
5) Click on Login button 
6) Verify the title of dashboard page Exp title : OrangeHRM
7) close browser
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1)Lauching the Browser
		WebDriver driver=new ChromeDriver();
		
		// Maximizing the browser
		driver.manage().window().maximize();
		
		// 2) open url https://opensource-demo.orangehrmlive.com/
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		/* *** Here the website is too fast to take the input from selenium scripts
		so that this will throw exception that the element is not found to avoid that 
		we need to use Thread.sleep(); *** */
		Thread.sleep(8000);
		
		//3) Provide username  - Admin
		//WebElement a=driver.findElement(By.name("username"));
		//a.sendKeys("XYZAPPLE");
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//4) Provide password  - admin123
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//5) Click on Login button 
		//driver.findElement(By.className("oxd-button")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
		
		//6) Verify the title of dashboard page Exp title : OrangeHRM
		
		/*
		 * CASE 1:--
		String webTitle=driver.getTitle();
		String reqTitle="OrangeHRM";
		if(webTitle.equals(reqTitle)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		*/
		// CASE 2
		
		String webText=null;
		try {
		webText=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		}catch(NoSuchElementException e) {
			webText="";
		};
		
		String comText="Dashboard";
		if(webText.equals(comText)) {			
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		//7) close browser
		driver.quit();
	}

}
