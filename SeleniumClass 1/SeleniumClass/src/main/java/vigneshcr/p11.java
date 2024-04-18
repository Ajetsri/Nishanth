package vigneshcr;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FindSmallerNumberinArray
		
		/*
		 
		 //removing dollor sign
		
		String price="$200.98";
		String price1=price.replace("$","");  // remove the dollor sign
		System.out.println(Double.parseDouble(price1)); //converted to number
		
		//find smallest number in array
		
		int a[]= {500,400,100,200,700};
		
		Arrays.sort(a);
		
		System.out.println("smallest number:"+a[0]);
		
		System.out.println("$"+a[0]);
		 
		 */
		
		// DropDownWithHiddenOptions
		
		/*

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();


		//Dropwdown
		
		
		driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]")).click();// opens the dropdown
		
		List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		for(WebElement option:options)
		{
			//System.out.println(option.getText());
			if(option.getText().equals("Finance Manager"))
			{
				option.click();
				break;
			}
		}
		
		*/
		
		//DatePickerDemo
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(0); //switth to frame
		
		//Appraoch 1
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/15/2022"); // mm/dd/yyyy
		
		//Approach2
				
		String year="2024";
		String month="October";
		String date="12";
				
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // will open the date picker
			
		
		//select month & year
		while(true)
		{
			String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mon.equals(month) && yr.equals(year))
			{
				break;
			}
			
//			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  // Future date
//			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();   //Past date
			
					
		}
		
		//select date
		
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
		
		/*for(int i=0;i<allDates.size();i++)
		{
			if(allDates.get(i).getText().equals(date))
			{
				allDates.get(i).click();
				break;
			}
				
		}*/

	}

}
