package vigneshcr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		CSS- Cascading Style Sheets

		HTML     CSS   JavaScript
		
		sumbit
		
		driver.findElement(By.cssSelector(selector))
		
		css selectors
		-
		tag id     #				
			Ex:    input#small-searchterms
				  #small-searchterms
		
		
		tag class     .
			Ex:   input.search-box-text
		 		 .search-box-text
		
		tag attribute    []
			Ex:   input[name='q']
				 [name='q']
		
		
		
		tag class attribute    .  []
		
			Ex:  input.search-box-text[name='q']
				.search-box-text[name='q']
		
		*/
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();


		//css with tag & id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MacBook");

		//tag class
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MacBook");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("MacBook");
		
		//tag & attribute
		
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("MacBook");
		//driver.findElement(By.cssSelector("[name='q']")).sendKeys("MacBook");
		
		//tag class & attribute
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("MacBook");
		
	
		
		
		
	}

}
