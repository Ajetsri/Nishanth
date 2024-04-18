package vigneshcr;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p9 {
	
	/*
	 
	 Day-26
-------
frames/iframe

driver.switchTo().frame(name/id)
driver.switchTo().frame(WebElement)
driver.switchTo().frame(index)

driver.switchTo().defaultContent();


packageListFrame
packageFrame
classFrame

handle browser windows
-----

getWindowHandle() - return id of single window( in which driver focused)
getWindowHandles()- returns id's of multiple windows

driver.switchTo().window(window id)

driver.switchTo().window(window id).getTitle()

many browser windows opened

close() - close single browser window which is focud by driver.
quit() - close all the browser windows which are currently opened

3 types of switching commands
---
1) driver.switchTo().alert()
2)  driver.switchTo().frame()
3) driver.switcho().window()

Assignments
------------
Search, Opening links, switch to browser windows, capture titles, close all browser windows
	https://testautomationpractice.blogspot.com/

iframe:
	http://the-internet.herokuapp.com/iframe

	 
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HandleFramesDemo1
		/*
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
				
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();// frame1
		
		driver.switchTo().defaultContent();// switch back to page
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("WebDriver")).click();  // frame2
		
		driver.switchTo().defaultContent();// switch back to page
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//div[@class='topNav']//a[normalize-space()='Overview']")).click();
		
		 */
		
		// HandleInnerFramesDemo
		
		/*
		 
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Frame1
		WebElement frm1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frm1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("11111");
		
		driver.switchTo().defaultContent();
		
		//Frame3
		WebElement frm3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frm3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("33333");
		
		//inner frame
		driver.switchTo().frame(0);
		
		driver.findElement(By.cssSelector("div.AB7Lab")).click(); // select first radio button in frame
		
		driver.switchTo().defaultContent();
		
		
		//frame2
		
		
		
		//frame 4
		
		
		
		//frame 5
		
		 
		 
		 */
		
		// HandleBrowserWindows
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		//capture id's for browser windows
		Set<String> windowIDs=driver.getWindowHandles();  // store 2 window id's
		
		//Approach1 - using List collection
		/*
		List <String>windowidsList=new ArrayList(windowIDs); // converted Set ---> List
			
		String parentWindowID=windowidsList.get(0);
		String childWindowID=windowidsList.get(1);
		
		
		//Swith to child window
		driver.switchTo().window(childWindowID);
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
		
		//Switch to parent window
		driver.switchTo().window(parentWindowID);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		*/
		
		
		//Appraoch2
		
		/*for(String winid:windowIDs)
		{
			String title=driver.switchTo().window(winid).getTitle();
			
			if( title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"))
			{
				driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
			}
		}*/
		
		//closing specific browser windows based on choice
		// 1-x  2-y  3-z  4-a  5-b...........
		
		/*for(String winid:windowIDs)
		{
			String title=driver.switchTo().window(winid).getTitle();
			
			if( title.equals("x") || title.equals("y") || title.equals("z"))
			{
				driver.close();
			}
		}*/
		
		
		for(String winid:windowIDs)
		{
			String title=driver.switchTo().window(winid).getTitle();
			
			if( title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"))
			{
				driver.close();
			}
		}
		

	}

}
