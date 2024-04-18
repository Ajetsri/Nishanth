package vigneshcr;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 
 Day-22
---------
1) get methods
2) conditional methods
3) Browser methods
4) Navigational methods
5) wait methods

get methods  - we can these methods through webdriver instance
----------
get(url)
getTitle()
getCurrentURL()
getPageSource()
getWindowHandle()
getwindowHandles()

conditional commands - access these commands thorugh WebElement
----------------------
Returns true/false ( boolean values)

isDisplayed()
isEnabled()
isSelected()

browser methods
---------------
close() 
- close single browser window

quit()
 
 */


public class p5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
			get(url)
			getTitle()
			getCurrentURL()
			getPageSource()
			getWindowHandle()
			getwindowHandles()
		 */
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		System.out.println("title of the page:"+driver.getTitle());
		
		System.out.println("Current URL:"+ driver.getCurrentUrl());
				
		/*System.out.println("Page source......................");
		String ps=driver.getPageSource();
		System.out.println(ps);
		System.out.println(ps.contains("html"));*/
		
		//System.out.println(driver.getWindowHandle());  //CDwindow-3127F2DCB717E0F5993100E70756C523
														//CDwindow-46E50E8AE6529C7635BCF8E9EA2FB5DE

		Thread.sleep(3000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // opens new browser window
		
		Set<String> windowids=driver.getWindowHandles();
		
		for(String winid:windowids)
		{
			System.out.println(winid);  //CDwindow-B9429C1F5CC606A3981FAF0CD1A96DBC
										//CDwindow-339CE5C5C5FB731B207639DE22EC40D1
		}
		// *******************************************************************************

		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//  isDisplayed()  isEnabled()
		//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println("displsy status of logo:"+logo.isDisplayed());
		
		//boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println(status);
		
		//WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		//System.out.println("Dispay status:"+searchbox.isDisplayed());
		//System.out.println("Enable status:"+searchbox.isEnabled());
		
		//isSelected()
		
		WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		//Before selection
		System.out.println("Before selection...............");
		System.out.println(male_rd.isSelected()); //false
		System.out.println(female_rd.isSelected()); //false
		
		//After selection of male radio button
		System.out.println("After selection of male radiop button............");
		male_rd.click();
		System.out.println(male_rd.isSelected()); //true
		System.out.println(female_rd.isSelected()); //false
				
		
		//After selection of fe-male radio button
		System.out.println("After selection of female radiop button............");
		female_rd.click();
		System.out.println(male_rd.isSelected()); //false
		System.out.println(female_rd.isSelected()); //true
		
		// *******************************************************************************
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	
		Thread.sleep(3000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(5000);	
		
		//driver.close();  // single browser window

		driver.quit(); // all browser windows
		
	}

}
