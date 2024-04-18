package vigneshcr;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 
 Day-24
-------
Check boxes 
Dropdowns
----------
1) Drop down having select tag in DOM.
2) DropDown not having select tag in DOM ( input/div) - Bootstrap dropdown
3) Auto Suggest drop down ( Dynamic)

Select class
 
 */


public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 
		 //HandleCheckboxes
		  WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		//select specific one checkbox
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		//total number of checkboxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("Total number of checkboxes:"+checkboxes.size()); //7
		
		//Select all the checkboxes
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		/*for(WebElement chkbox:checkboxes)
		{
			chkbox.click();
		}*/
		
		//Select last 2 checkboxes
		// total Number of checkboxes-how many checkboxes to be selected= startign index
		//7-3= 4 ( startign index)
		/*for(int i=4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//Select first 2 chekboxes
		
		/*for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}*/
		
		/*for(int i=0;i<checkboxes.size();i++)
		{
			if(i<2)
			{
			checkboxes.get(i).click();
			}
		}*/
		
		//clear/Uncheck checkboxes
		
		//Using normal for loop
		/*
		for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(4000);
		
		/*for(int i=0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
			checkboxes.get(i).click();
			}
		}*/
		/*
		for(WebElement chkbox:checkboxes)
		{
			if(chkbox.isSelected())
			{
				chkbox.click();
			}
		}
		//========================================
		 
		 */

		/*
		 //HandleDropDownWithoutSelectTag
		  
		  WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		
		//clicking on the dropdown
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,multiselect)]//label"));
		
		//find total number of options
		System.out.println("Total number of options:"+options.size());
			
		//print all the options from dropdown
		
		//using normal for loop
		/*for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}*/
		
		//select options from dropdown
		/*for(int i=0;i<options.size();i++)
		{
			String option=options.get(i).getText();
						
			if(option.equals("Java") || option.equals("Python"))
			{
				options.get(i).click();
			}
			
		}*/
		/*
		for(WebElement option:options)
		{
			String text=option.getText();
			if(text.equals("Java") || text.equals("Python"))
			{
				option.click();
			}
		}
		  
		 */
		
		//========================================================
		
		
			
			//HandleDropDownwithSelectTag
			 
			 WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country-list']"));
		Select drpCountry=new Select(drpCountryEle);
		
		//1) Selecting an option from teh dropdown
		//drpCountry.selectByVisibleText("USA");
		 //drpCountry.selectByValue("4"); // use this only if value attribute is present for option tag
		//drpCountry.selectByIndex(3); //France
		
		// 2) Find total options in dropdown
		List<WebElement> options=drpCountry.getOptions();
		System.out.println("total number of options:"+options.size());
		
		//3) print options in console window
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		//using enhanced loop
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
			
			
		 
		
		
	}

}
