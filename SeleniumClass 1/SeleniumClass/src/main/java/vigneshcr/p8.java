package vigneshcr;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p8 {
	
	/*
	 Day-25
---------
Auto suggest dropdown(dynamic)

Alerts/popus

1) alert with ok 
2) alert with ok & Cancel
3) alert with inputbox along with ok & Cancel
4) alert with no elements

Alert alertwindow=driver.switchTo().alert()

accept()
dismiss()
getText()


Assignments
-------------
1) Auto suggetion box
https://www.bing.com/

2) Alert
https://the-internet.herokuapp.com/javascript_alerts
https://mail.rediff.com/cgi-bin/login.cgi
	 */

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		 
		  //AuthenticatedPopop
		  WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	//http://the-internet.herokuapp.com/basic_auth
	//http://admin:admin@the-internet.herokuapp.com/basic_auth
	
	
	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	String text=driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
	
	if(text.contains("Congratulations"))
	{
		System.out.println("successful login");
	}
	else
	{
		System.out.println("login failed");
	}
		  
		 
		 */
		
		/*
		
		// AutoSuggestDropDown
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		Thread.sleep(3000);

		List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span"));
		
		System.out.println("Number of suggestions:"+list.size());
		
		
		//select an option from list
		for(int i=0;i<list.size();i++)
		{
			String text=list.get(i).getText();
			
			if(text.equals("selenium tutorial"))
			{
				list.get(i).click();
				break;
			}
			
		}
			*/
		/*
		
		//HandleAlerts
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		
		
		
		Alert alertwindow=driver.switchTo().alert();
//		Alert alertwindow=mywait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alertwindow.getText());
		
		Thread.sleep(3000);
		
		//alertwindow.accept(); // this will close alert window using ok button
		alertwindow.dismiss();  // close alert window by using cancel button
		*/
		//AlertwithInputbox
		
		 
		 WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		Alert alertwindow=driver.switchTo().alert();
		
		System.out.println(alertwindow.getText());
		
		alertwindow.sendKeys("welcome");
		Thread.sleep(3000);
			
		alertwindow.accept();
		//alertwindow.dismiss();
		
		//validation
		
		String act_text=driver.findElement(By.xpath("//p[@id='result']")).getText();
		String exp_text="You entered: welcome";
		
		System.out.println(act_text);
		System.out.println(exp_text);
		
		if(act_text.equals(exp_text))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		 
		 


	}

}
