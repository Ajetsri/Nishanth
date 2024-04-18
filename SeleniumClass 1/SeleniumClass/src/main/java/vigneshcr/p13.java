package vigneshcr;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p13 {

	/*
	 
	 Day-30
---------
Keyboard actions..

JavaScriptExecutor  --- Interface

executeScript() -->  
we can execute java script statemetns in selenium using this method...
	 
	 */
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//KeyboardActions
		/*
		 WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com/");
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("WELCOME TO AUTOMATION");
		Actions act=new Actions(driver);
		//ctrl +a
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		//ctrl +c
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		//tab
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		//act.sendKeys(Keys.TAB).perform(); // only if want to press single key then prefer this
		//ctrl+v
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		 */
		
		// TabsAndWindows
		
		/*
		 WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/");
		driver.switchTo().newWindow(WindowType.TAB); // OPENS NEW TAB
		//driver.switchTo().newWindow(WindowType.WINDOW); // OPENS IN ANOTHER WINDOW
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 */
		
		// InteractwithElementsUsingJS
		
		/*
		 WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 //ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//JavascriptExecutor js=driver;
		//First name - inputbox
		WebElement inputbox=driver.findElement(By.id("RESULT_TextField-1"));
		js.executeScript("arguments[0].setAttribute('value','john')", inputbox);
		//Radio button
		WebElement male_Rd=driver.findElement(By.id("RESULT_RadioButton-7_0"));
		//male_Rd.click();  //ClickInterceptedException
		js.executeScript("arguments[0].click();",male_Rd);
		//Checkbox
		WebElement chkbox=driver.findElement(By.id("RESULT_CheckBox-8_0"));
		js.executeScript("arguments[0].click();",chkbox);
		//button
		WebElement button=driver.findElement(By.id("FSsubmit"));
		js.executeScript("arguments[0].click();",button);
		 */
		
		//ScrollingPage
		
		 WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		JavascriptExecutor js=driver;
		//1) scroll down page by pixel
		js.executeScript("window.scrollBy(0,3000)", "");
		//System.out.println(js.executeScript("return window.pageYOffset;"));  //3000		
		//2) scroll down the page till the element is present
		WebElement flag=driver.findElement(By.xpath("//img[@alt='Flag of India']"));
		js.executeScript("arguments[0].scrollIntoView();", flag);
		System.out.println(js.executeScript("return window.pageYOffset;"));  //5077.40234375	
		//3) scroll down till end of the page/document
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		Thread.sleep(3000);
		// go back to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		 

	}

}
