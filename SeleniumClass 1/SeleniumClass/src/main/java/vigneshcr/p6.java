package vigneshcr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 
 Day-23
-------
wait commands


wait statements will be used to solve synchronization problem in automation.


Thread.sleep(ms)

implicit wait
explicite wait/ fluent state

sleep() : provided by java itself( not selenium command)
------------
Adv:
1) easy to use

DisAdvantage:

1) if the time is not suffitient then you will get exception
2) it will wait ofr maximum time out. this will reduce the perforemce script.
3) multiple times 

implicit wait
----------
Adv:
1) single time/one statement
2) it will not wait till maximum time if the element is availble
3) Applicable for all the elements
4) easy to use

Disadvantge:
1) if the time is not suffitient then you will get exception

Explicit wait
------------
declartion
usage

1) Conditional based, it will work more effectively.
2) finding element is inclusive
3) it will wait for copndition to be true, the consider the time
4) we need to write multiple statements for multiple elements 


Fluent wait
------
 // Waiting 30 seconds for an element to be present on the page, checking
   // for its presence once every 5 seconds.
  
 Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
       .withTimeout(Duration.ofSeconds(30L))
       .pollingEvery(Duration.ofSeconds(5L))
       .ignoring(NoSuchElementException.class);


   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
     public WebElement apply(WebDriver driver) {
       return driver.findElement(By.id("foo"));
     }
   });


Navigational commands
-----------------
navigate().to(url)   same as driver.get(url)
navigate().forward()
navigate().back()
navigate().refresh()

driver.navigate().to(url);

driver.manage().window().maximize();

"https://www.google.com"   -----> string

URL myurl=new URL("https://www.google.com")

navigate().to(URL) 
    accepts url is URL & Strign format

driver.get()  
	accepts only String format
 
 
 */

public class p6 {

	public static void main(String[] args) throws InterruptedException {
		
		
		/*
		 
		  //Implicit Wait
		
			WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit command
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
					
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		 */
		
		 
		 //Explicit Wait Demo
		 
		 WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		//declaring explicit wait
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
				
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
					
		WebElement useranme=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		useranme.sendKeys("Admin");
		
		
		WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		password.sendKeys("admin123");
		 
		 
		 
		/*
		 
		 // Fluent Wait Demo
		  
		  WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Fluent wait declaration
				
		FluentWait mywait=new FluentWait(driver);
		mywait.withTimeout(Duration.ofSeconds(30));
	    mywait.pollingEvery(Duration.ofSeconds(5));
	    mywait.ignoring(NoSuchElementException.class);
		
			
		//usage
	    WebElement username=(WebElement) mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		username.sendKeys("Admin");
		 
		 
		 */
		
		
		
		/*
		 
		 //NavigationalCommands
		 
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
	
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl()); // amzon
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl()); // flipkart
		
		driver.navigate().refresh();  // refresh the page
		
		
		 */
		/*
		//SleepStatement
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		*/
	}

}
