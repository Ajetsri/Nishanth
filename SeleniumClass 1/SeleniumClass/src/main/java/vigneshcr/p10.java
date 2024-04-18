package vigneshcr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p10 {
	
	/*
	 Day-27
----------
Web Table
----------
static table
dynamic table
pagination table

https://demo.opencart.com/admin/

Assignment
---------
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

Login
Go to PIM
Capture first name & last name from Employee table
	 */

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//StaticTableDemo
		/*
		 WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		// 1) Find total number of rows 
		
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //7  preferred
		//int rows=driver.findElements(By.tagName("tr")).size(); //8   prefered only if you have one single table
		System.out.println("Number of rows:"+ rows); //7
		
		
		//2) Find total number of columns
		
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		//int cols=driver.findElements(By.tagName("th")).size(); // dont prefer if you have multiple tables
		
		System.out.println("Number of columns:"+ cols); //4
		
		
		//3) Read specific row & column data
		//String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();
		//System.out.println(value); //Master In JS
		
		
		//4) Read data from all the rows & columns
		
		/*System.out.println("Book Name"+"     "+"Author"+"    "+"Subject"+"       "+"Price");
		
		
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t"); 
			}
			System.out.println();
		}
		*/
			
		
		//5) Print book names whose author is Amit
		
		/*for(int r=2;r<=rows;r++)
		{
			String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
			
			if(author.equals("Mukesh"))
			{
				String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
				System.out.println(author+"    "+bookname);
			}
			
		}*/
		
		
		//6)Find sum of prices for all the books
		/*
		int sum=0;
		for(int r=2;r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
			sum=sum+Integer.parseInt(price);
			
		}
		
		System.out.println("Total price of books:"+sum);
		 */
		//======================================================================
		
		// PaginationTable
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		//Login
		WebElement username=driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("demo");  //demo
				
		WebElement password=driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("demo"); //demo
				
		driver.findElement(By.xpath("//button[text()=' Login']")).click();
		
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		//Customers--->customers
		
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@class='collapse show']//a[contains(text(),'Customers')]")).click();
		
		
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();  //Showing 91 to 100 of 5513 (552 Pages)
		
			
		int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		
		
		System.out.println("Total number of pages:"+total_pages);
		
		for(int p=1;p<=10;p++)   //for(int p=1;p<=total_pages;p++)
		{
			if(total_pages>1)
			{
				WebElement active_Page=driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()="+p+"]"));	
				System.out.println(" Active Page : "+active_Page.getText());
				active_Page.click();
				Thread.sleep(2000);
			}
			
			int noOfrows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			System.out.println(" Total No Of Rows in active Page : "+noOfrows);
			
			for(int r=1;r<=noOfrows;r++)
			{
				String customerName=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				String customerEmail=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
				String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();
				
				System.out.println(customerName+"      "+customerEmail+"          "+status);
			}
			
		}
		
		driver.quit();

	}

}
